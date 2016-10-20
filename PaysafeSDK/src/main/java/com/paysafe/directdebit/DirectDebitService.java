
package com.paysafe.directdebit;

import java.io.IOException;

import java.util.HashMap;

import com.paysafe.PaysafeApiClient;
import com.paysafe.cardpayments.Filter;
import com.paysafe.common.PaysafeException;
import com.paysafe.common.Pagerator;
import com.paysafe.common.impl.Monitor;
import com.paysafe.common.impl.Request;
import com.paysafe.directdebit.impl.PurchasesPagerator;
import com.paysafe.directdebit.impl.StandaloneCreditsPagerator;

// TODO: Auto-generated Javadoc
/**
 * The class DirectDebitService.
 * @author bhushan.patil, deepika.mishra
 * @since 01-04-2016.
 */

public class DirectDebitService {
    
    /** The client. */
    private final PaysafeApiClient client;
    
    /** The Constant PURCHASE_PATH. */
    private static final String PURCHASE_PATH = "/purchases/";
    
    /** The Constant MERCHANT_REF_NUMBER. */
    private static final String MERCHANT_REF_NUMBER = "merchantRefNum";
    
    /** The Constant ACCOUNTS. */
    private static final String ACCOUNTS = "/accounts/";
    
    /** The Constant CREDIT_REQUEST_PATH. */
    private static final String CREDIT_REQUEST_PATH = "/standalonecredits/";
    
    /** The Constant LIMIT. */
    private static final String LIMIT = "limit";
    
    /** The Constant OFFSET. */
    private static final String OFFSET = "offset";
    
    /** The Constant START_DATE. */
    private static final String START_DATE = "startDate";
    
    /** The Constant END_DATE. */
    private static final String END_DATE = "endDate";
    
    
    /**
     * Instantiates a new direct debit service.
     *
     * @param client the client
     */
    public DirectDebitService(PaysafeApiClient client) {
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
              .uri("directdebit/monitor")
              .method(Request.RequestType.GET)
              .build();

      return ("READY".equals(client.processRequest(request, Monitor.class).getStatus()));
    }
 
    /**
     * Submit Purchase.
     *
     * @param purchases the purchases
     * @return Purchase
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    public final Purchases submitPurchase(Purchases purchases) throws IOException, PaysafeException {
        final Request request = Request.builder()
                .uri(prepareUri(ACCOUNTS+client.getAccount()+PURCHASE_PATH))
                .method(Request.RequestType.POST)
                .body(purchases)
                .build();
    	Purchases returnVal = (Purchases)this.client.processRequest(request, Purchases.class);
    	return returnVal;
    }
    
    /**
     * Cancel Purchase.
     *
     * @param purchases the purchases
     * @return Purchase
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    
    public final Purchases cancelPurchase(Purchases purchases) throws IOException, PaysafeException {
        	final Request request = Request.builder()
                .uri(prepareUri(ACCOUNTS+client.getAccount()+PURCHASE_PATH+purchases.getId()))
                .method(Request.RequestType.PUT)
                .body(purchases)
                .build();
    	Purchases returnVal = (Purchases)this.client.processRequest(request, Purchases.class);
    	returnVal.setId(purchases.getId());
    	return returnVal;
    }
    
    /**
     * Get Purchase.
     *
     * @param purchases the purchases
     * @return Purchase
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    public final Purchases getPurchase(Purchases purchases) throws IOException, PaysafeException 
    {
    	final Request request = Request.builder()
                .uri(prepareUri(ACCOUNTS+client.getAccount()+PURCHASE_PATH+purchases.getId()))
                .method(Request.RequestType.GET)
                .body(purchases)
                .build();
    	
    	Purchases returnVal = (Purchases)this.client.processRequest(request, Purchases.class);
    	returnVal.setId(purchases.getId());
    	return returnVal;
    }
    
   
    /**
     * Get Purchases using merchant reference number.
     *
     * @param purchases the purchases
     * @param filter the filter
     * @return Pagerator< Purchases >
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    public final Pagerator<Purchases> getPurchases(final Purchases purchases, final Filter filter)
            throws IOException, PaysafeException {

      final HashMap<String, String> queryStr = new HashMap<String, String>();
      if (null != purchases) {
        if (null != purchases.getMerchantRefNum() && !purchases.getMerchantRefNum().isEmpty()) {
          queryStr.put(MERCHANT_REF_NUMBER, purchases.getMerchantRefNum());
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
              .uri(prepareUri(ACCOUNTS+client.getAccount()+"/purchases"))
              .method(Request.RequestType.GET)
              .queryStr(queryStr)
              .build();

      PurchasesPagerator response
              = client.processRequest(request, PurchasesPagerator.class);
      response.setClient(client);
      return response;
    }
    
    /**
     * Submit StanaloneCredit.
     *
     * @param standalonecredits the standalonecredits
     * @return StandaloneCredits
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    public final StandaloneCredits submitStandaloneCredit(StandaloneCredits standalonecredits) throws IOException, PaysafeException {
        final Request request = Request.builder()
                .uri(prepareUri(ACCOUNTS+client.getAccount()+CREDIT_REQUEST_PATH))
                .method(Request.RequestType.POST)
                .body(standalonecredits)
                .build();
        StandaloneCredits returnVal = (StandaloneCredits)this.client.processRequest(request, StandaloneCredits.class);
    	return returnVal;
    }
    
    
    /**
     * Cancel StandaloneCredits.
     *
     * @param standalonecredits the standalonecredits
     * @return StandaloneCredits
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    
    public final StandaloneCredits cancelStandaloneCredit(StandaloneCredits standalonecredits) throws IOException, PaysafeException {
        	final Request request = Request.builder()
                .uri(prepareUri(ACCOUNTS+client.getAccount()+CREDIT_REQUEST_PATH+standalonecredits.getId()))
                .method(Request.RequestType.PUT)
                .body(standalonecredits)
                .build();
        StandaloneCredits returnVal = (StandaloneCredits)this.client.processRequest(request, StandaloneCredits.class);
    	returnVal.setId(standalonecredits.getId());
    	return returnVal;
    }

    
    /**
     * Get StandaloneCredit.
     *
     * @param standalonecredits the standalonecredits
     * @return StandaloneCreditS
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    public final StandaloneCredits getStandaloneCredit(StandaloneCredits standalonecredits) throws IOException, PaysafeException 
    {
    	final Request request = Request.builder()
                .uri(prepareUri(ACCOUNTS+client.getAccount()+CREDIT_REQUEST_PATH+standalonecredits.getId()))
                .method(Request.RequestType.GET)
                .body(standalonecredits)
                .build();
    	
    	StandaloneCredits returnVal = (StandaloneCredits)this.client.processRequest(request, StandaloneCredits.class);
    	returnVal.setId(standalonecredits.getId());
    	return returnVal;
    }
    
    
    /**
     * Get StandaloneCredits using merchant reference number.
     *
     * @param standalonecredits the standalonecredits
     * @param filter the filter
     * @return Pagerator< StandaloneCredits >
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws PaysafeException the paysafe exception
     */
    public final Pagerator<StandaloneCredits> getStandaloneCredits(final StandaloneCredits standalonecredits, final Filter filter)
            throws IOException, PaysafeException {
      final HashMap<String, String> queryStr = new HashMap<String, String>();
      if (null != standalonecredits) {
        if (null != standalonecredits.getMerchantRefNum() && !standalonecredits.getMerchantRefNum().isEmpty()) {
          queryStr.put(MERCHANT_REF_NUMBER, standalonecredits.getMerchantRefNum());
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
              .uri(prepareUri(ACCOUNTS+client.getAccount()+"/standalonecredits"))
              .method(Request.RequestType.GET)
              .queryStr(queryStr)
              .build();

      StandaloneCreditsPagerator response
              = client.processRequest(request, StandaloneCreditsPagerator.class);
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
    private String prepareUri(String path) throws PaysafeException {
        return "directdebit/v1" + path;
    }
}


