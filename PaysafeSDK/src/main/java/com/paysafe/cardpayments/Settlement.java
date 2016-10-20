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

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.Link;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Settlement.
 */
public class Settlement implements BaseDomainObject {

  /** The id. */
  private Id<Settlement> id;
  
  /** The merchant ref num. */
  @Expose
  private String merchantRefNum;
  
  /** The amount. */
  @Expose
  private Integer amount;
  
  /** The available to refund. */
  private Integer availableToRefund;
  
  /** The child account num. */
  private String childAccountNum;
  
  /** The txn time. */
  private String txnTime;
  
  /** The dup check. */
  @Expose
  private Boolean dupCheck;
  
  /** The status. */
  @Expose
  private Status status;
  
  /** The risk reason code. */
  private ArrayList<Integer> riskReasonCode;
  
  /** The acquirer response. */
  private AcquirerResponse acquirerResponse;
  
  /** The error. */
  private Error error;
  
  /** The links. */
  private ArrayList<Link> links;
  
  /** The authorization id. */
  private Id<Authorization> authorizationId;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Settlement> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Settlement> id) {
    this.id = id;
  }

  /**
   * Gets the merchant ref num.
   *
   * @return the merchant ref num
   */
  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  /**
   * Sets the merchant ref num.
   *
   * @param merchantRefNum the new merchant ref num
   */
  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  /**
   * Gets the amount.
   *
   * @return the amount
   */
  public final Integer getAmount() {
    return amount;
  }

  /**
   * Sets the amount.
   *
   * @param amount the new amount
   */
  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  /**
   * Gets the available to refund.
   *
   * @return the available to refund
   */
  public final Integer getAvailableToRefund() {
    return availableToRefund;
  }

  /**
   * Sets the available to refund.
   *
   * @param availableToRefund the new available to refund
   */
  public final void setAvailableToRefund(final Integer availableToRefund) {
    this.availableToRefund = availableToRefund;
  }

  /**
   * Gets the child account num.
   *
   * @return the child account num
   */
  public final String getChildAccountNum() {
    return childAccountNum;
  }

  /**
   * Sets the child account num.
   *
   * @param childAccountNum the new child account num
   */
  public final void setChildAccountNum(final String childAccountNum) {
    this.childAccountNum = childAccountNum;
  }

  /**
   * Gets the dup check.
   *
   * @return the dup check
   */
  public final Boolean getDupCheck() {
    return dupCheck;
  }

  /**
   * Sets the dup check.
   *
   * @param dupCheck the new dup check
   */
  public final void setDupCheck(final Boolean dupCheck) {
    this.dupCheck = dupCheck;
  }

  /**
   * Gets the txn time.
   *
   * @return the txn time
   */
  public final String getTxnTime() {
    return txnTime;
  }

  /**
   * Sets the txn time.
   *
   * @param txnTime the new txn time
   */
  public final void setTxnTime(final String txnTime) {
    this.txnTime = txnTime;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public final Status getStatus() {
    return status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public final void setStatus(final Status status) {
    this.status = status;
  }

  /**
   * Gets the risk reason code.
   *
   * @return the risk reason code
   */
  public final ArrayList<Integer> getRiskReasonCode() {
    return riskReasonCode;
  }

  /**
   * Sets the risk reason code.
   *
   * @param riskReasonCode the new risk reason code
   */
  public final void setRiskReasonCode(final ArrayList<Integer> riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
  }

  /**
   * Gets the acquirer response.
   *
   * @return the acquirer response
   */
  public final AcquirerResponse getAcquirerResponse() {
    return acquirerResponse;
  }

  /**
   * Sets the acquirer response.
   *
   * @param acquirerResponse the new acquirer response
   */
  public final void setAcquirerResponse(final AcquirerResponse acquirerResponse) {
    this.acquirerResponse = acquirerResponse;
  }

  /* (non-Javadoc)
   * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
   */
  @Override
  public final Error getError() {
    return error;
  }

  /**
   * Sets the error.
   *
   * @param error the new error
   */
  public final void setError(final Error error) {
    this.error = error;
  }

  /**
   * Gets the links.
   *
   * @return the links
   */
  public final ArrayList<Link> getLinks() {
    return links;
  }

  /**
   * Sets the links.
   *
   * @param links the new links
   */
  public final void setLinks(final ArrayList<Link> links) {
    this.links = links;
  }

  /**
   * Gets the authorization id.
   *
   * @return the authorization id
   */
  public final Id<Authorization> getAuthorizationId() {
    return authorizationId;
  }

  /**
   * Sets the authorization id.
   *
   * @param authorizationId the new authorization id
   */
  public final void setAuthorizationId(final Id<Authorization> authorizationId) {
    this.authorizationId = authorizationId;
  }

  /**
   * Get a Settlement builder.
   *
   * @return SettlementBuilder
   */
  public static final SettlementBuilder builder() {
    return new SettlementBuilder();
  }

  /**
   * The builder class for Settlement.
   */
  public static class SettlementBuilder extends BaseBuilder<Settlement> {

    /** The settlement. */
    private final Settlement settlement = new Settlement();

    /**
     * Build this Settlement object.
     *
     * @return Settlement
     */
    @Override
    public final Settlement build() {
      return settlement;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return SettlementBuilder
     */
    public final SettlementBuilder id(final Id<Settlement> id) {
      settlement.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant ref num
     * @return AuuthorizationBuilder
     */
    public final SettlementBuilder merchantRefNum(final String merchantRefNum) {
      settlement.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the amount property.
     *
     * @param amount the amount
     * @return AuuthorizationBuilder
     */
    public final SettlementBuilder amount(final Integer amount) {
      settlement.setAmount(amount);
      return this;
    }

    /**
     * Set the dupCheck property.
     *
     * @param dupCheck the dup check
     * @return AuuthorizationBuilder
     */
    public final SettlementBuilder dupCheck(final Boolean dupCheck) {
      settlement.setDupCheck(dupCheck);
      return this;
    }

    /**
     * Set the authorizationId property.
     *
     * @param authorizationId the authorization id
     * @return SettlementBuilder
     */
    public final SettlementBuilder authorizationId(final Id<Authorization> authorizationId) {
      settlement.setAuthorizationId(authorizationId);
      return this;
    }
  }
}
