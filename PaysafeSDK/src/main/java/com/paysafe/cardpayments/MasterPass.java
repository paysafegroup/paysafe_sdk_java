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
 * The Class MasterPass.
 */
public class MasterPass implements DomainObject {

  /** The pay pass wallet indicator. */
  private String payPassWalletIndicator;
  
  /** The authentication method. */
  private String authenticationMethod;
  
  /** The card enrollment method. */
  private String cardEnrollmentMethod;
  
  /** The master card assigned id. */
  private String masterCardAssignedId;

  /**
   * Gets the pay pass wallet indicator.
   *
   * @return the pay pass wallet indicator
   */
  public final String getPayPassWalletIndicator() {
    return payPassWalletIndicator;
  }

  /**
   * Sets the pay pass wallet indicator.
   *
   * @param payPassWalletIndicator the new pay pass wallet indicator
   */
  public final void setPayPassWalletIndicator(final String payPassWalletIndicator) {
    this.payPassWalletIndicator = payPassWalletIndicator;
  }

  /**
   * Gets the authentication method.
   *
   * @return the authentication method
   */
  public final String getAuthenticationMethod() {
    return authenticationMethod;
  }

  /**
   * Sets the authentication method.
   *
   * @param authenticationMethod the new authentication method
   */
  public final void setAuthenticationMethod(final String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  /**
   * Gets the card enrollment method.
   *
   * @return the card enrollment method
   */
  public final String getCardEnrollmentMethod() {
    return cardEnrollmentMethod;
  }

  /**
   * Sets the card enrollment method.
   *
   * @param cardEnrollmentMethod the new card enrollment method
   */
  public final void setCardEnrollmentMethod(final String cardEnrollmentMethod) {
    this.cardEnrollmentMethod = cardEnrollmentMethod;
  }

  /**
   * Gets the master card assigned id.
   *
   * @return the master card assigned id
   */
  public final String getMasterCardAssignedId() {
    return masterCardAssignedId;
  }

  /**
   * Sets the master card assigned id.
   *
   * @param masterCardAssignedId the new master card assigned id
   */
  public final void setMasterCardAssignedId(final String masterCardAssignedId) {
    this.masterCardAssignedId = masterCardAssignedId;
  }
}
