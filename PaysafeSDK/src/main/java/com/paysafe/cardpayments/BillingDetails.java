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

import com.paysafe.common.AddressDetails;
import com.paysafe.common.impl.AddressContainer;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class BillingDetails.
 */
public class BillingDetails extends AddressContainer implements DomainObject {

  /**
   * The sub-builder class for BillingDetails.
   *
   * @param <BLDRT> the parent builder
   */
  public static class BillingDetailsBuilder<BLDRT extends GenericBuilder>
          extends NestedBuilder<BillingDetails, BLDRT> {

    /** The billing details. */
    private final BillingDetails billingDetails = new BillingDetails();
    
    /** The address details. */
    private AddressDetails addressDetails = new AddressDetails();

    /**
     * Instantiates a new billing details builder.
     *
     * @param parent the parent
     */
    public BillingDetailsBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Instantiates a new billing details builder.
     *
     * @param parent the parent
     * @param a the a
     */
    public BillingDetailsBuilder(
            final BLDRT parent,
            com.paysafe.customervault.Address a) {
      super(parent);
      if (null != a.getAddressDetails()) {
        addressDetails = a.getAddressDetails();
      }
    }

    /**
     * Build this BillingDetails object.
     *
     * @return BillingDetails
     */
    @Override
    public final BillingDetails build() {
      billingDetails.setAddressDetails(addressDetails);
      return billingDetails;
    }

    /**
     * Set the street property.
     *
     * @param street the street
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> street(final String street) {
      addressDetails.setStreet(street);
      return this;
    }

    /**
     * Set the street2 property.
     *
     * @param street2 the street2
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> street2(final String street2) {
      addressDetails.setStreet2(street2);
      return this;
    }

    /**
     * Set the city property.
     *
     * @param city the city
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> city(final String city) {
      addressDetails.setCity(city);
      return this;
    }

    /**
     * Set the state property.
     *
     * @param state the state
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> state(final String state) {
      addressDetails.setState(state);
      return this;
    }

    /**
     * Set the country property.
     *
     * @param country the country
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> country(final String country) {
      addressDetails.setCountry(country);
      return this;
    }

    /**
     * Set the zip property.
     *
     * @param zip the zip
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> zip(final String zip) {
      addressDetails.setZip(zip);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone the phone
     * @return BillingDetailsBuilder< BLDRT >
     */
    public final BillingDetailsBuilder<BLDRT> phone(final String phone) {
      addressDetails.setPhone(phone);
      return this;
    }
  }
}
