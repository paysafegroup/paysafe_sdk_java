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

public class LineItems implements DomainObject {

  /**
   * This is a description of the item(s) being purchased.
   */
  @Expose
  private String description;

  /**
   * This is a merchant-defined description code of the item being purchased.
   */
  @Expose
  private String productCode;

  /**
   * This is the quantity of the item.
   */
  @Expose
  private int quantity;

  /**
   * This is the unit price of the item being purchased, in minor units.
   * The currency will be based on the account setting.
   */
  @Expose
  private int unitAmount;

  /**
   * This is the tax rate used to calculate the tax amount.
   * For example, if the tax rate is 10.5%, this value should be 10.5.
   */
  @Expose
  private int taxRate;

  /**
   * This is the amount of any value-added taxes that can be associated with the purchased item, in minor units.
   * The currency will be based on the account setting.
   */
  @Expose
  private int taxAmount;

  /**
   * This is the total amount of the line item, typically calculated as price multiplied by quantity, in minor units.
   * The currency will be based on the account setting.
   */
  @Expose
  private int totalAmount;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getUnitAmount() {
    return unitAmount;
  }

  public void setUnitAmount(int unitAmount) {
    this.unitAmount = unitAmount;
  }

  public int getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(int taxRate) {
    this.taxRate = taxRate;
  }

  public int getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(int taxAmount) {
    this.taxAmount = taxAmount;
  }

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

}
