package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class BillingDetails.
 */
public class BillingDetails implements DomainObject {

	@Expose
	private String street;

	/** The street2. */
	@Expose
	private String street2;

	/** The city. */
	@Expose
	private String city;

	/** The state. */
	@Expose
	private String state;

	/** The country. */
	@Expose
	private Country country;

	/** The zip. */
	@Expose
	private String zip;

	/** The useAsShippingAddress. */
	private Boolean useAsShippingAddress;

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 *            
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Gets the street2.
	 *
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * Sets the street2.
	 *
	 * @param street2 the new street2
	 *            
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 *            
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 *            
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 *            
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 *            
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Gets the useAsShippingAddress.
	 *
	 * @return the useAsShippingAddress
	 */
	public Boolean getUseAsShippingAddress() {
		return useAsShippingAddress;
	}

	/**
	 * Sets the useAsShippingAddress.
	 *
	 * @param useAsShippingAddress the new useAsShippingAddress
	 *            
	 */
	public void setUseAsShippingAddress(Boolean useAsShippingAddress) {
		this.useAsShippingAddress = useAsShippingAddress;
	}

	/**
	 * The sub-builder class for BillingDetails.
	 *
	 * @param <BLDRT> the parent builder
	 *            
	 */
	public static class BillingDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<BillingDetails, BLDRT> {

		/** The billing details. */
		private final BillingDetails billingDetails = new BillingDetails();

		@Override
		public BillingDetails build() {
			return billingDetails;
		}

		/**
		 * Instantiates a new billing details builder.
		 *
		 * @param parent the parent
		 *            
		 */
		public BillingDetailsBuilder(final BLDRT parent) {
			super(parent);
		}

		/**
		 * Set the street property.
		 *
		 * @param street the street
		 *            
		 * @return BillingDetailsBuilder< BLDRT >
		 */
		public final BillingDetailsBuilder<BLDRT> street(final String street) {
			billingDetails.setStreet(street);
			return this;
		}

		/**
		 * Set the street2 property.
		 * 
		 * @param street2  the street2
		 *           
		 * @return BillingDetailsBuilder< BLDRT >
		 */
		public final BillingDetailsBuilder<BLDRT> street2(final String street2) {
			billingDetails.setStreet2(street2);
			return this;
		}

		/**
		 * Set the city property.
		 *
		 * @param city the city
		 *            
		 * @return BillingDetailsBuilder< BLDRT >
		 */
		public final BillingDetailsBuilder<BLDRT> city(final String city) {
			billingDetails.setCity(city);
			return this;
		}

		/**
		 * Set the state property.
		 *
		 * @param state the state
		 *            
		 * @return BillingDetailsBuilder< BLDRT >
		 */
		public final BillingDetailsBuilder<BLDRT> state(final String state) {
			billingDetails.setState(state);
			return this;
		}

		/**
		 * Set the country property.
		 *
		 * @param country the country
		 *            
		 * @return BillingDetailsBuilder< BLDRT >
		 */
		public final BillingDetailsBuilder<BLDRT> country(final Country country) {
			billingDetails.setCountry(country);
			return this;
		}

		/**
		 * Set the zip property.
		 *
		 * @param zip the zip
		 *            
		 * @return BillingDetailsBuilder< BLDRT >
		 */
		public final BillingDetailsBuilder<BLDRT> zip(final String zip) {
			billingDetails.setZip(zip);
			return this;
		}
	}
}
