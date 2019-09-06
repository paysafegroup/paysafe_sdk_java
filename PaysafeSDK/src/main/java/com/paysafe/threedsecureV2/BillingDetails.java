package com.paysafe.threedsecureV2;

import com.paysafe.common.AddressDetails;
import com.paysafe.common.impl.AddressContainer;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

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
    public BillingDetailsBuilder(final BLDRT parent,com.paysafe.customervault.Address a) {
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
 }
}

