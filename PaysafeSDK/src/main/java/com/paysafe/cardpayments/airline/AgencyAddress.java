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

  /**
   * Retrieve the street.
   * @return the street
   */
  public String getStreet() {
    return street;
  }

  /**
   * Set the street.
   * @param street - street to set
   */
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Retrieve the zip.
   * @return the zip
   */
  public String getZip() {
    return zip;
  }

  /**
   * Set the zip.
   * @param zip - zip to set
   */
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * Retrieve the country.
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Set the country.
   * @param country - country to set
   */
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

    /**
     * Create the nested builder.
     * @param parent - the parent builder
     */
    public AgencyAddressBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Creates an AgencyAddress instance.
     * @return the instance
     */
    @Override
    public final AgencyAddress build() {
      return agencyAddress;
    }


    /**
     * Set the country to the current builder instance.
     * @param country - country to set
     * @return the builder instance
     */
    public final AgencyAddress.AgencyAddressBuilder<BLDRT> country(final String country) {
      agencyAddress.setCountry(country);
      return this;
    }

    /**
     * Set the street to the current builder instance.
     * @param street - country to set
     * @return the builder instance
     */
    public final AgencyAddress.AgencyAddressBuilder<BLDRT> street(final String street) {
      agencyAddress.setStreet(street);
      return this;
    }

    /**
     * Set the zip to the current builder instance.
     * @param zip - country to set
     * @return the builder instance
     */
    public final AgencyAddress.AgencyAddressBuilder<BLDRT> zip(final String zip) {
      agencyAddress.setZip(zip);
      return this;
    }
  }
}
