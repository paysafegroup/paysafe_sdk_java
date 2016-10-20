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
package com.paysafe.common;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class CardExpiry.
 */
public class CardExpiry implements DomainObject {

  /** The month. */
  @Expose
  private Integer month;
  
  /** The year. */
  @Expose
  private Integer year;

  /**
   * Gets the month.
   *
   * @return the month
   */
  public final Integer getMonth() {
    return month;
  }

  /**
   * Sets the month.
   *
   * @param month the new month
   */
  public final void setMonth(final Integer month) {
    this.month = month;
  }

  /**
   * Gets the year.
   *
   * @return the year
   */
  public final Integer getYear() {
    return year;
  }

  /**
   * Sets the year.
   *
   * @param year the new year
   */
  public final void setYear(final Integer year) {
    this.year = year;
  }

  /**
   * The sub-builder class for CardExpiry.
   *
   * @param <BLDRT> the parent builder
   */
  public static class CardExpiryBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<CardExpiry, BLDRT> {

    /** The card expiry. */
    private final CardExpiry cardExpiry = new CardExpiry();

    /**
     * Instantiates a new card expiry builder.
     *
     * @param parent the parent
     */
    public CardExpiryBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this CardExpiry object.
     *
     * @return CardExpiry
     */
    @Override
    public final CardExpiry build() {
      return cardExpiry;
    }

    /**
     * Set the month property.
     *
     * @param month the month
     * @return CardExpiryBuilder< BLDRT >
     */
    public final CardExpiryBuilder<BLDRT> month(final Integer month) {
      cardExpiry.setMonth(month);
      return this;
    }

    /**
     * Set the year property.
     *
     * @param year the year
     * @return CardExpiryBuilder< BLDRT >
     */
    public final CardExpiryBuilder<BLDRT> year(final Integer year) {
      cardExpiry.setYear(year);
      return this;
    }
  }
}
