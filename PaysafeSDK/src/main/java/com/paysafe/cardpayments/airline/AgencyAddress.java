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
package com.paysafe.cardpayments.airline;

import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

import com.google.gson.annotations.Expose;

public class AgencyAddress implements DomainObject {

  /**
   * Address line of the agent selling the ticket
   */
  @Expose
  private String street;

  /**
   * Postal code of the agent selling the ticket
   */
  @Expose
  private String zip;

  /**
   * Country code of agent selling the ticket
   */
  @Expose
  private String country;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The sub-builder class for AgencyAddress.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AgencyAddressBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<AgencyAddress, BLDRT> {

    /** The agency address. */
    private final AgencyAddress agencyAddress = new AgencyAddress();

    public AgencyAddressBuilder(final BLDRT parent) {
      super(parent);
    }


    @Override
    public final AgencyAddress build() {
      return agencyAddress;
    }


    public final AgencyAddress.AgencyAddressBuilder<BLDRT> country(final String country) {
      agencyAddress.setCountry(country);
      return this;
    }

    public final AgencyAddress.AgencyAddressBuilder<BLDRT> street(final String street) {
      agencyAddress.setStreet(street);
      return this;
    }

    public final AgencyAddress.AgencyAddressBuilder<BLDRT> zip(final String zip) {
      agencyAddress.setZip(zip);
      return this;
    }


  }
}
