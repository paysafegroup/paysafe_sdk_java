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

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AgencyAddress getAgencyAddress() {
    return agencyAddress;
  }

  public void setAgencyAddress(AgencyAddress agencyAddress) {
    this.agencyAddress = agencyAddress;
  }


  public static class TravelAgencyBuilder<
      BLDRT extends GenericBuilder> extends
      NestedBuilder<TravelAgency, BLDRT> {

    private final TravelAgency travelAgency = new TravelAgency();

    public TravelAgencyBuilder(final BLDRT parent) {
      super(parent);
    }


    @Override
    public final TravelAgency build() {
      return travelAgency;
    }

    public final TravelAgency.TravelAgencyBuilder<BLDRT> code(
        final String code) {
      travelAgency.setCode(code);
      return this;
    }

    public final TravelAgency.TravelAgencyBuilder<BLDRT> name(
        final String name) {
      travelAgency.setName(name);
      return this;
    }

    public final TravelAgency.TravelAgencyBuilder<BLDRT> agencyAddress(
        final AgencyAddress agencyAddress) {
      travelAgency.setAgencyAddress(agencyAddress);
      return this;
    }

  }
}
