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

public class TravelAgency implements DomainObject {

  /**
   * Code identifying travel agency if the ticket was issued by a travel agency.
   */
  @Expose
  private String code;

  /**
   * Name of travel agency if the ticket was issued by a travel agency.
   */
  @Expose
  private String name;

  /**
   * Details for the agency address.
   */
  @Expose
  private AgencyAddress agencyAddress;

  /**
   * Retrieve the code
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Set the code
   * @param code - code to set
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Retrieve the name
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name
   * @param name - name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Retrieve the agencyAddress
   * @return the agencyAddress
   */
  public AgencyAddress getAgencyAddress() {
    return agencyAddress;
  }

  /**
   * Set the agencyAddress
   * @param agencyAddress - the agencyAddress
   */
  public void setAgencyAddress(AgencyAddress agencyAddress) {
    this.agencyAddress = agencyAddress;
  }

  /**
   * The sub-builder class for the TravelAgency object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class TravelAgencyBuilder<
      BLDRT extends GenericBuilder> extends
      NestedBuilder<TravelAgency, BLDRT> {

    /**
     * The builder for the agencyAddress
     */
    private AgencyAddress.AgencyAddressBuilder<TravelAgencyBuilder<BLDRT>> agencyAddressBuilder;

    /**
     * The TravelAgency object to be built.
     */
    private final TravelAgency travelAgency = new TravelAgency();

    /**
     * Creates a new TravelAgencyBuilder object.
     * @param parent - the parent builder
     */
    public TravelAgencyBuilder(final BLDRT parent) {
      super(parent);
    }


    /**
     * Build this TravelAgency object.
     *
     * @return the created TravelAgency object
     */
    @Override
    public final TravelAgency build() {
      if (agencyAddressBuilder != null) {
        travelAgency.setAgencyAddress(agencyAddressBuilder.build());
      }
      return travelAgency;
    }

    /**
     * Set the code to the current builder instance.
     * @param code - code to set
     * @return the currentBuilder
     */
    public final TravelAgency.TravelAgencyBuilder<BLDRT> code(
        final String code) {
      travelAgency.setCode(code);
      return this;
    }

    /**
     * Set the name to the current builder instance.
     * @param name - name to set
     * @return the currentBuilder
     */
    public final TravelAgency.TravelAgencyBuilder<BLDRT> name(
        final String name) {
      travelAgency.setName(name);
      return this;
    }

    /**
     * Set the agencyAddress to the current builder instance.
     * @param agencyAddress - agencyAddress to set
     * @return the currentBuilder
     */
    public final TravelAgency.TravelAgencyBuilder<BLDRT> agencyAddress(
        final AgencyAddress agencyAddress) {
      travelAgency.setAgencyAddress(agencyAddress);
      return this;
    }


    /**
     * Starts a new AgencyAddressBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new AgencyAddressBuilder
     */
    public final AgencyAddress.AgencyAddressBuilder<TravelAgencyBuilder<BLDRT>> agencyAddress() {
      if (agencyAddressBuilder == null) {
        agencyAddressBuilder = new AgencyAddress.AgencyAddressBuilder<>(this);
      }
      return agencyAddressBuilder;
    }

  }
}
