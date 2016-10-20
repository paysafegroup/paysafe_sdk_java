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

import com.paysafe.common.impl.DomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class AcquirerResponse.
 */
public class AcquirerResponse implements DomainObject {

  /** The code. */
  private String code;
  
  /** The response code. */
  private String responseCode;
  
  /** The avs code. */
  private String avsCode;
  
  /** The balance response. */
  private String balanceResponse;
  
  /** The batch number. */
  private String batchNumber;
  
  /** The effective date. */
  private String effectiveDate;
  
  /** The financing type. */
  private String financingType;
  
  /** The grace period. */
  private String gracePeriod;
  
  /** The plan. */
  private String plan;
  
  /** The seq number. */
  private String seqNumber;
  
  /** The term. */
  private String term;
  
  /** The terminal id. */
  private String terminalId;
  
  /** The response id. */
  private String responseId;
  
  /** The request id. */
  private String requestId;
  
  /** The description. */
  private String description;
  
  /** The auth code. */
  private String authCode;
  
  /** The txn date time. */
  private String txnDateTime;
  
  /** The reference nbr. */
  private String referenceNbr;
  
  /** The response reason code. */
  private String responseReasonCode;
  
  /** The cvv2 result. */
  private String cvv2Result;
  
  /** The mid. */
  private String mid;

  /**
   * Gets the code.
   *
   * @return the code
   */
  public final String getCode() {
    return code;
  }

  /**
   * Sets the code.
   *
   * @param code the new code
   */
  public final void setCode(final String code) {
    this.code = code;
  }

  /**
   * Gets the response code.
   *
   * @return the response code
   */
  public final String getResponseCode() {
    return responseCode;
  }

  /**
   * Sets the response code.
   *
   * @param responseCode the new response code
   */
  public final void setResponseCode(final String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Gets the avs code.
   *
   * @return the avs code
   */
  public final String getAvsCode() {
    return avsCode;
  }

  /**
   * Sets the avs code.
   *
   * @param avsCode the new avs code
   */
  public final void setAvsCode(final String avsCode) {
    this.avsCode = avsCode;
  }

  /**
   * Gets the balance response.
   *
   * @return the balance response
   */
  public final String getBalanceResponse() {
    return balanceResponse;
  }

  /**
   * Sets the balance response.
   *
   * @param balanceResponse the new balance response
   */
  public final void setBalanceResponse(final String balanceResponse) {
    this.balanceResponse = balanceResponse;
  }

  /**
   * Gets the batch number.
   *
   * @return the batch number
   */
  public final String getBatchNumber() {
    return batchNumber;
  }

  /**
   * Sets the batch number.
   *
   * @param batchNumber the new batch number
   */
  public final void setBatchNumber(final String batchNumber) {
    this.batchNumber = batchNumber;
  }

  /**
   * Gets the effective date.
   *
   * @return the effective date
   */
  public final String getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the effective date.
   *
   * @param effectiveDate the new effective date
   */
  public final void setEffectiveDate(final String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  /**
   * Gets the financing type.
   *
   * @return the financing type
   */
  public final String getFinancingType() {
    return financingType;
  }

  /**
   * Sets the financing type.
   *
   * @param financingType the new financing type
   */
  public final void setFinancingType(final String financingType) {
    this.financingType = financingType;
  }

  /**
   * Gets the grace period.
   *
   * @return the grace period
   */
  public final String getGracePeriod() {
    return gracePeriod;
  }

  /**
   * Sets the grace period.
   *
   * @param gracePeriod the new grace period
   */
  public final void setGracePeriod(final String gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  /**
   * Gets the plan.
   *
   * @return the plan
   */
  public final String getPlan() {
    return plan;
  }

  /**
   * Sets the plan.
   *
   * @param plan the new plan
   */
  public final void setPlan(final String plan) {
    this.plan = plan;
  }

  /**
   * Gets the seq number.
   *
   * @return the seq number
   */
  public final String getSeqNumber() {
    return seqNumber;
  }

  /**
   * Sets the seq number.
   *
   * @param seqNumber the new seq number
   */
  public final void setSeqNumber(final String seqNumber) {
    this.seqNumber = seqNumber;
  }

  /**
   * Gets the term.
   *
   * @return the term
   */
  public final String getTerm() {
    return term;
  }

  /**
   * Sets the term.
   *
   * @param term the new term
   */
  public final void setTerm(final String term) {
    this.term = term;
  }

  /**
   * Gets the terminal id.
   *
   * @return the terminal id
   */
  public final String getTerminalId() {
    return terminalId;
  }

  /**
   * Sets the terminal id.
   *
   * @param terminalId the new terminal id
   */
  public final void setTerminalId(final String terminalId) {
    this.terminalId = terminalId;
  }

  /**
   * Gets the response id.
   *
   * @return the response id
   */
  public final String getResponseId() {
    return responseId;
  }

  /**
   * Sets the response id.
   *
   * @param responseId the new response id
   */
  public final void setResponseId(final String responseId) {
    this.responseId = responseId;
  }

  /**
   * Gets the request id.
   *
   * @return the request id
   */
  public final String getRequestId() {
    return requestId;
  }

  /**
   * Sets the request id.
   *
   * @param requestId the new request id
   */
  public final void setRequestId(final String requestId) {
    this.requestId = requestId;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public final String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public final void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the auth code.
   *
   * @return the auth code
   */
  public final String getAuthCode() {
    return authCode;
  }

  /**
   * Sets the auth code.
   *
   * @param authCode the new auth code
   */
  public final void setAuthCode(final String authCode) {
    this.authCode = authCode;
  }

  /**
   * Gets the txn date time.
   *
   * @return the txn date time
   */
  public final String getTxnDateTime() {
    return txnDateTime;
  }

  /**
   * Sets the txn date time.
   *
   * @param txnDateTime the new txn date time
   */
  public final void setTxnDateTime(final String txnDateTime) {
    this.txnDateTime = txnDateTime;
  }

  /**
   * Gets the reference nbr.
   *
   * @return the reference nbr
   */
  public final String getReferenceNbr() {
    return referenceNbr;
  }

  /**
   * Sets the reference nbr.
   *
   * @param referenceNbr the new reference nbr
   */
  public final void setReferenceNbr(final String referenceNbr) {
    this.referenceNbr = referenceNbr;
  }

  /**
   * Gets the response reason code.
   *
   * @return the response reason code
   */
  public final String getResponseReasonCode() {
    return responseReasonCode;
  }

  /**
   * Sets the response reason code.
   *
   * @param responseReasonCode the new response reason code
   */
  public final void setResponseReasonCode(final String responseReasonCode) {
    this.responseReasonCode = responseReasonCode;
  }

  /**
   * Gets the cvv2 result.
   *
   * @return the cvv2 result
   */
  public final String getCvv2Result() {
    return cvv2Result;
  }

  /**
   * Sets the cvv2 result.
   *
   * @param cvv2Result the new cvv2 result
   */
  public final void setCvv2Result(final String cvv2Result) {
    this.cvv2Result = cvv2Result;
  }

  /**
   * Gets the mid.
   *
   * @return the mid
   */
  public final String getMid() {
    return mid;
  }

  /**
   * Sets the mid.
   *
   * @param mid the new mid
   */
  public final void setMid(final String mid) {
    this.mid = mid;
  }
}
