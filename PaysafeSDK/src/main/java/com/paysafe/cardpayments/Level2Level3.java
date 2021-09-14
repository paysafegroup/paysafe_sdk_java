/*
 * Copyright (c) 2021 Optimal Payments
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
import com.paysafe.common.impl.DomainObject;

public class Level2Level3 implements DomainObject {

  /**
   * This indicates whether or not local tax is exempted for the request.
   * If set to true, then the localTaxAmount parameter will be ignored.
   */
  @Expose
  private boolean exemptLocalTax;

  /**
   * This is the local sales tax applied to the purchase.
   */
  @Expose
  private int localTaxAmount;

  /**
   * This is the national tax included in the transaction amount.
   */
  @Expose
  private int nationalTaxAmount;

  /**
   * This is the freight or shipping portion of the total transaction amount.
   */
  @Expose
  private int freightAmount;

  /**
   * This is the duty associated with the import of the purchased goods.
   */
  @Expose
  private int dutyAmount;

  /**
   * This is the postal/zip code of the address to which the purchased goods will be delivered.
   * This field can be identical to the shipFromZip if the customer is present and takes immediate possession of the
   * goods.
   */
  @Expose
  private int destinationZip;

  /**
   * This is the country to which the goods are being shipped.
   */
  @Expose
  private int destinationCountry;

  /**
   * This is the postal/zip code of the address from which the purchased goods are being shipped.
   */
  @Expose
  private int shipFromZip;

  /**
   * This is more detailed information about the items that are being purchased.
   */
  @Expose
  private LineItems lineItems;

  public boolean isExemptLocalTax() {
    return exemptLocalTax;
  }

  public void setExemptLocalTax(boolean exemptLocalTax) {
    this.exemptLocalTax = exemptLocalTax;
  }

  public int getLocalTaxAmount() {
    return localTaxAmount;
  }

  public void setLocalTaxAmount(int localTaxAmount) {
    this.localTaxAmount = localTaxAmount;
  }

  public int getNationalTaxAmount() {
    return nationalTaxAmount;
  }

  public void setNationalTaxAmount(int nationalTaxAmount) {
    this.nationalTaxAmount = nationalTaxAmount;
  }

  public int getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(int freightAmount) {
    this.freightAmount = freightAmount;
  }

  public int getDutyAmount() {
    return dutyAmount;
  }

  public void setDutyAmount(int dutyAmount) {
    this.dutyAmount = dutyAmount;
  }

  public int getDestinationZip() {
    return destinationZip;
  }

  public void setDestinationZip(int destinationZip) {
    this.destinationZip = destinationZip;
  }

  public int getDestinationCountry() {
    return destinationCountry;
  }

  public void setDestinationCountry(int destinationCountry) {
    this.destinationCountry = destinationCountry;
  }

  public int getShipFromZip() {
    return shipFromZip;
  }

  public void setShipFromZip(int shipFromZip) {
    this.shipFromZip = shipFromZip;
  }

  public LineItems getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItems lineItems) {
    this.lineItems = lineItems;
  }

}
