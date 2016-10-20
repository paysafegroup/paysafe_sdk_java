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

import com.paysafe.common.DateOfBirth;
import com.paysafe.common.impl.DomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class VisaAdditionalAuthData.
 */
public class VisaAdditionalAuthData implements DomainObject {

  /** The recipient date of birth. */
  private DateOfBirth recipientDateOfBirth;
  
  /** The recipient zip. */
  private String recipientZip;
  
  /** The recipient last name. */
  private String recipientLastName;
  
  /** The recipient account number. */
  private String recipientAccountNumber;

  /**
   * Gets the recipient date of birth.
   *
   * @return the recipient date of birth
   */
  public final DateOfBirth getRecipientDateOfBirth() {
    return recipientDateOfBirth;
  }

  /**
   * Sets the recipient date of birth.
   *
   * @param recipientDateOfBirth the new recipient date of birth
   */
  public final void setRecipientDateOfBirth(final DateOfBirth recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
  }

  /**
   * Gets the recipient zip.
   *
   * @return the recipient zip
   */
  public final String getRecipientZip() {
    return recipientZip;
  }

  /**
   * Sets the recipient zip.
   *
   * @param recipientZip the new recipient zip
   */
  public final void setRecipientZip(final String recipientZip) {
    this.recipientZip = recipientZip;
  }

  /**
   * Gets the recipient last name.
   *
   * @return the recipient last name
   */
  public final String getRecipientLastName() {
    return recipientLastName;
  }

  /**
   * Sets the recipient last name.
   *
   * @param recipientLastName the new recipient last name
   */
  public final void setRecipientLastName(final String recipientLastName) {
    this.recipientLastName = recipientLastName;
  }

  /**
   * Gets the recipient account number.
   *
   * @return the recipient account number
   */
  public final String getRecipientAccountNumber() {
    return recipientAccountNumber;
  }

  /**
   * Sets the recipient account number.
   *
   * @param recipientAccountNumber the new recipient account number
   */
  public final void setRecipientAccountNumber(final String recipientAccountNumber) {
    this.recipientAccountNumber = recipientAccountNumber;
  }
}
