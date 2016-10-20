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
package com.paysafe.common.impl;

import com.google.gson.annotations.Expose;
import com.paysafe.common.AddressDetails;

// TODO: Auto-generated Javadoc
/**
 * AddressContainer used to serialize addressDetails within a node rather than as a sub node.
 */
public abstract class AddressContainer {

  /** The address details. */
  @Expose
  private AddressDetails addressDetails;

  /**
   * Gets the address details.
   *
   * @return the address details
   */
  public final AddressDetails getAddressDetails() {
    return addressDetails;
  }

  /**
   * Sets the address details.
   *
   * @param addressDetails the new address details
   */
  public final void setAddressDetails(final AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }
}
