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

/**
 * The Class DateOfBirth.
 */
public class DateOfBirth implements DomainObject {

  @Expose	
  private Integer day;
  @Expose
  private Integer month;
  @Expose
  private Integer year;

  public final Integer getDay() {
    return day;
  }

  public final void setDay(final Integer day) {
    this.day = day;
  }

  public final Integer getMonth() {
    return month;
  }

  public final void setMonth(final Integer month) {
    this.month = month;
  }

  public final Integer getYear() {
    return year;
  }

  public final void setYear(final Integer year) {
    this.year = year;
  }

  /**
   * The sub-builder class for DateOfBirth.
   *
   * @param <BLDRT> the parent builder
   */
  public static class DateOfBirthBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<DateOfBirth, BLDRT> {

    private final DateOfBirth dateOfBirth = new DateOfBirth();

    public DateOfBirthBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this date of birth object.
     *
     * @return DateOfBirth
     */
    @Override
    public final DateOfBirth build() {
      return dateOfBirth;
    }

    /**
     * Set the day property.
     *
     * @param day
     * @return DateOfBirthBuilder< BLDRT >
     */
    public final DateOfBirthBuilder<BLDRT> day(final Integer day) {
      dateOfBirth.setDay(day);
      return this;
    }

    /**
     * Set the month property.
     *
     * @param month
     * @return DateOfBirthBuilder< BLDRT >
     */
    public final DateOfBirthBuilder<BLDRT> month(final Integer month) {
      dateOfBirth.setMonth(month);
      return this;
    }

    /**
     * Set the year property.
     *
     * @param year
     * @return DateOfBirthBuilder< BLDRT >
     */
    public final DateOfBirthBuilder<BLDRT> year(final Integer year) {
      dateOfBirth.setYear(year);
      return this;
    }
  }
}
