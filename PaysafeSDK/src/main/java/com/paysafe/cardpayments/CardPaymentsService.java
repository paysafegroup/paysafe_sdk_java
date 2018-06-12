/*
 * Copyright (c) 2014 Optimal Payments
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.paysafe.cardpayments;

import java.io.IOException;
import java.util.HashMap;
import com.paysafe.PaysafeApiClient;
import com.paysafe.cardpayments.impl.AuthorizationPagerator;
import com.paysafe.cardpayments.impl.AuthorizationReversalPagerator;
import com.paysafe.cardpayments.impl.RefundPagerator;
import com.paysafe.cardpayments.impl.SettlementPagerator;
import com.paysafe.cardpayments.impl.VerificationPagerator;
import com.paysafe.common.Id;
import com.paysafe.common.PaysafeException;
import com.paysafe.common.Pagerator;
import com.paysafe.common.impl.Monitor;
import com.paysafe.common.impl.Request;

// TODO: Auto-generated Javadoc
/**
 * The Class CardPaymentsService.
 */
public class CardPaymentsService {

  /**
   * The client.
   */
  private final PaysafeApiClient client;

  /**
   * The paths to different features in the API.
   */
  private static final String URI = "cardpayments/v1";
  
  /** The Constant AUTH_PATH. */
  private static final String AUTH_PATH = "/auths/";
  
  /** The Constant AUTH_REVERSAL_PATH. */
  private static final String AUTH_REVERSAL_PATH = "/voidauths/";
  
  /** The Constant SETTLEMENT_PATH. */
  private static final String SETTLEMENT_PATH = "/settlements/";
  
  /** The Constant REFUND_PATH. */
  private static final String REFUND_PATH = "/refunds/";
  
  /** The Constant VERIFY_PATH. */
  private static final String VERIFY_PATH = "/verifications/";

  /** The Constant MERCHANT_REF_NUM. */
  private static final String MERCHANT_REF_NUM = "merchantRefNum";
  
  /** The Constant LIMIT. */
  private static final String LIMIT = "limit";
  
  /** The Constant OFFSET. */
  private static final String OFFSET = "offset";
  
  /** The Constant START_DATE. */
  private static final String START_DATE = "startDate";
  
  /** The Constant END_DATE. */
  private static final String END_DATE = "endDate";

  /**
   * Instantiates a new card payment service.
   *
   * @param client the client
   */
  public CardPaymentsService(final PaysafeApiClient client) {
    this.client = client;
  }

  /**
   * Monitor.
   *
   * @return true, if successful
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean monitor() throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri("cardpayments/monitor")
            .method(Request.RequestType.GET)
            .build();

    return ("READY".equals(client.processRequest(request, Monitor.class).getStatus()));
  }

  /**
   * Authorize.
   *
   * @param auth the authorization
   * @return the authorization
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Authorization authorize(final Authorization auth)
          throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH))
            .method(Request.RequestType.POST)
            .body(auth)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Approve held authorization.
   *
   * @param <T> Authorization
   * @param id the id
   * @return Authorization
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final <T extends Authorization> Authorization approveHeldAuth(final Id<T> id)
          throws IOException, PaysafeException {

    final Authorization tmpAuth = new Authorization();
    tmpAuth.setStatus(Status.COMPLETED);
    
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpAuth)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Cancel held authorization.
   *
   * @param id the id
   * @return Authorization
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Authorization cancelHeldAuth(final Id<Authorization> id)
          throws IOException, PaysafeException {

    final Authorization tmpAuth = new Authorization();
    tmpAuth.setStatus(Status.CANCELLED);
    
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpAuth)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Reverse an authorization.
   *
   * @param authReversal the auth reversal
   * @return AuthorizationReversal
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final AuthorizationReversal reverseAuth(final AuthorizationReversal authReversal)
          throws IOException,
          PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    AUTH_PATH + authReversal.getAuthorizationId() + AUTH_REVERSAL_PATH))
            .method(Request.RequestType.POST)
            .body(authReversal)
            .build();

    return client.processRequest(request, AuthorizationReversal.class);
  }

  /**
   * Settle an authorization.
   *
   * @param settlement the settlement
   * @return Settlement
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Settlement settlement(final Settlement settlement)
          throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + settlement.getAuthorizationId() + SETTLEMENT_PATH))
            .method(Request.RequestType.POST)
            .body(settlement)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Cancel a settlement.
   *
   * @param id the id
   * @return Settlement
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Settlement cancelSettlement(final Id<Settlement> id)
          throws IOException, PaysafeException {

    final Settlement tmpSettlement = new Settlement();
    tmpSettlement.setStatus(Status.CANCELLED);
    
    Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpSettlement)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Refund a settlement.
   *
   * @param refund the refund
   * @return Refund
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Refund refund(final Refund refund) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH + refund.getSettlementId() + REFUND_PATH))
            .method(Request.RequestType.POST)
            .body(refund)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Cancel a refund.
   *
   * @param id the id
   * @return Refund
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Refund cancelRefund(final Id<Refund> id) 
          throws IOException, PaysafeException {

    final Refund tmpRefund = new Refund();
    tmpRefund.setStatus(Status.CANCELLED);
    
    Request request = Request.builder()
            .uri(prepareUri(REFUND_PATH + id))
            .method(Request.RequestType.PUT)
            .body(tmpRefund)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Verify a card.
   *
   * @param verify the verify
   * @return Verification
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Verification verify(final Verification verify) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(VERIFY_PATH))
            .method(Request.RequestType.POST)
            .body(verify)
            .build();

    return client.processRequest(request, Verification.class);
  }

  /**
   * Get an authorization by id.
   *
   * @param id the id
   * @return Authorization
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Authorization getAuth(final Id<Authorization> id)
          throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Authorization.class);
  }
  
    /**
   * Get an authorization by merchantRefNum.
   *
   * @param  String of merchantRefNum
   * @return Authorization
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Authorization getAuthWithMerchantRefNum(final String merchantRefNum)
          throws IOException, PaysafeException {
    final HashMap<String, String> queryStr = new HashMap<String, String>();
	  queryStr.put("merchantRefNum", merchantRefNum);
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    return client.processRequest(request, Authorization.class);
  }

  /**
   * Get matching authorizations.
   *
   * @return Pagerator< Authorization >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Authorization> getAuths()
          throws IOException, PaysafeException {
    return getAuths(null, null);
  }

  /**
   * Get matching authorizations.
   *
   * @param auth the auth
   * @return Pagerator< Authorization >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Authorization> getAuths(final Authorization auth)
          throws IOException, PaysafeException {
    return getAuths(auth, null);
  }

  /**
   * Get matching authorizations.
   *
   * @param auth the auth
   * @param filter the filter
   * @return Pagerator< Authorization >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Authorization> getAuths(final Authorization auth, final Filter filter)
          throws IOException, PaysafeException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != auth) {
      if (null != auth.getMerchantRefNum() && !auth.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, auth.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    AuthorizationPagerator response
            = client.processRequest(request, AuthorizationPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an auth reversal by id.
   *
   * @param id the id
   * @return AuthorizationReversal
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final AuthorizationReversal getAuthReversal(
          final Id<AuthorizationReversal> id) throws IOException, PaysafeException {
    
    final Request request = Request.builder()
            .uri(prepareUri(AUTH_REVERSAL_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, AuthorizationReversal.class);
  }

  /**
   * Get matching authorization reversals.
   *
   * @return Pagerator< AuthorizationReversal >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<AuthorizationReversal> getAuthReversals()
          throws IOException, PaysafeException {
    return getAuthReversals(null, null);
  }

  /**
   * Get matching authorization reversals.
   *
   * @param authReversal the auth reversal
   * @return Pagerator< AuthorizationReversal >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<AuthorizationReversal>
          getAuthReversals(final AuthorizationReversal authReversal)
          throws IOException, PaysafeException {
    return getAuthReversals(authReversal, null);
  }

  /**
   * Get matching authorization reversals.
   *
   * @param authReversal the auth reversal
   * @param filter the filter
   * @return Pagerator< AuthorizationReversal >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<AuthorizationReversal>
          getAuthReversals(final AuthorizationReversal authReversal, final Filter filter)
          throws IOException, PaysafeException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != authReversal) {
      if (null != authReversal.getMerchantRefNum() && !authReversal.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, authReversal.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(AUTH_REVERSAL_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final AuthorizationReversalPagerator response
            = client.processRequest(request, AuthorizationReversalPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an settlement by id.
   *
   * @param id the id
   * @return Settlement
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Settlement getSettlement(final Id<Settlement> id)
          throws IOException, PaysafeException {
    
    final Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Settlement.class);
  }

  /**
   * Get matching settlements.
   *
   * @return Pagerator< Settlement >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Settlement> getSettlements()
          throws IOException, PaysafeException {
    return getSettlements(null, null);
  }

  /**
   * Get matching settlements.
   *
   * @param settlement the settlement
   * @return Pagerator< Settlement >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Settlement> getSettlements(final Settlement settlement)
          throws IOException, PaysafeException {
    return getSettlements(settlement, null);
  }

  /**
   * Get matching settlements.
   *
   * @param settlement the settlement
   * @param filter the filter
   * @return Pagerator< Settlement >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Settlement>
          getSettlements(final Settlement settlement, final Filter filter)
          throws IOException, PaysafeException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != settlement) {
      if (null != settlement.getMerchantRefNum() && !settlement.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, settlement.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(SETTLEMENT_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final SettlementPagerator response
            = client.processRequest(request, SettlementPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an refund by id.
   *
   * @param id the id
   * @return Refund
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Refund getRefund(final Id<Refund> id) throws IOException, PaysafeException {
    
    final Request request = Request.builder()
            .uri(prepareUri(REFUND_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Refund.class);
  }

  /**
   * Get matching refunds.
   *
   * @return Pagerator< Refund >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Refund> getRefunds()
          throws IOException, PaysafeException {
    return getRefunds(null, null);
  }

  /**
   * Get matching refunds.
   *
   * @param refund the refund
   * @return Pagerator< Refund >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Refund> getRefunds(final Refund refund)
          throws IOException, PaysafeException {
    return getRefunds(refund, null);
  }

  /**
   * Get matching refunds.
   *
   * @param refund the refund
   * @param filter the filter
   * @return Pagerator< Refund >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Refund>
          getRefunds(final Refund refund, final Filter filter)
          throws IOException, PaysafeException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != refund) {
      if (null != refund.getMerchantRefNum() && !refund.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, refund.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    Request request = Request.builder()
            .uri(prepareUri(REFUND_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final RefundPagerator response
            = client.processRequest(request, RefundPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Get an verification by id.
   *
   * @param id the id
   * @return Verification
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Verification getVerification(final Id<Verification> id)
          throws IOException, PaysafeException {
    
    final Request request = Request.builder()
            .uri(prepareUri(VERIFY_PATH + id))
            .method(Request.RequestType.GET)
            .build();

    return client.processRequest(request, Verification.class);
  }

  /**
   * Get matching verifications.
   *
   * @return Pagerator< Verification >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Verification> getVerifications()
          throws IOException, PaysafeException {
    return getVerifications(null, null);
  }

  /**
   * Get matching verifications.
   *
   * @param verification the verification
   * @return Pagerator< Verification >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Verification> getVerifications(final Verification verification)
          throws IOException, PaysafeException {
    return getVerifications(verification, null);
  }

  /**
   * Get matching verifications.
   *
   * @param verification the verification
   * @param filter the filter
   * @return Pagerator< Verification >
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Pagerator<Verification>
          getVerifications(final Verification verification, final Filter filter)
          throws IOException, PaysafeException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    if (null != verification) {
      if (null != verification.getMerchantRefNum() && !verification.getMerchantRefNum().isEmpty()) {
        queryStr.put(MERCHANT_REF_NUM, verification.getMerchantRefNum());
      }
    }
    if (null != filter) {
      if (null != filter.getLimit()) {
        queryStr.put(LIMIT, filter.getLimit().toString());
      }
      if (null != filter.getOffset()) {
        queryStr.put(OFFSET, filter.getOffset().toString());
      }
      if (null != filter.getStartDate()) {
        queryStr.put(START_DATE, filter.getStartDate());
      }
      if (null != filter.getEndDate()) {
        queryStr.put(END_DATE, filter.getEndDate());
      }
    }

    final Request request = Request.builder()
            .uri(prepareUri(VERIFY_PATH))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();

    final VerificationPagerator response
            = client.processRequest(request, VerificationPagerator.class);
    response.setClient(client);
    return response;
  }

  /**
   * Prepare uri.
   *
   * @param path the path
   * @return the string
   * @throws PaysafeException the paysafe exception
   */
  private String prepareUri(final String path) throws PaysafeException {
    if (null == client.getAccount()) {
      throw new PaysafeException("Missing or invalid account.");
    }

    return URI + "/accounts/" + client.getAccount() + path;
  }
}
