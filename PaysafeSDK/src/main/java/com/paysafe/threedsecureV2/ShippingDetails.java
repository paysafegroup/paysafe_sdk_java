package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.ShipMethod;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class ShippingDetails.
 */
public class ShippingDetails implements DomainObject {

	/** The ship method. */
	@Expose
	private ShipMethod shipMethod;

	/** The street. */
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

	/**
	 * Gets the ship method.
	 *
	 * @return the ship method
	 */
	public final ShipMethod getShipMethod() {
		return shipMethod;
	}

	/**
	 * Sets the ship method.
	 *
	 * @param shipMethod the new ship method
	 */
	public final void setShipMethod(final ShipMethod shipMethod) {
		this.shipMethod = shipMethod;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public final String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 *            
	 */
	public final void setStreet(final String street) {
		this.street = street;
	}

	/**
	 * Gets the street2.
	 *
	 * @return the street2
	 */
	public final String getStreet2() {
		return street2;
	}

	/**
	 * Sets the street2.
	 *
	 * @param street2 the new street2
	 */
	public final void setStreet2(final String street2) {
		this.street2 = street2;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public final void setCity(final String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public final void setState(final String state) {
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public final Country getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public final void setCountry(final Country country) {
		this.country = country;
	}

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public final String getZip() {
		return zip;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 */
	public final void setZip(final String zip) {
		this.zip = zip;
	}

	/**
	 * The sub-builder class for ShippingDetails.
	 *
	 * @param <BLDRT> the parent builder
	 */
	public static class ShippingDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<ShippingDetails, BLDRT> {
		/** The shipping details. */
		private final ShippingDetails shippingDetails = new ShippingDetails();

		@Override
		public ShippingDetails build() {
			return shippingDetails;
		}

		/**
		 * @param parent
		 */
		public ShippingDetailsBuilder(final BLDRT parent) {
			super(parent);
		}

		/**
		 * Set the street property.
		 *
		 * @param street the street
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> street(final String street) {
			shippingDetails.setStreet(street);
			return this;
		}

		/**
		 * Set the street2 property.
		 *
		 * @param street2 the street2
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> street2(final String street2) {
			shippingDetails.setStreet2(street2);
			return this;
		}

		/**
		 * Set the city property.
		 *
		 * @param city the city
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> city(final String city) {
			shippingDetails.setCity(city);
			return this;
		}

		/**
		 * Set the state property.
		 *
		 * @param state the state
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> state(final String state) {
			shippingDetails.setState(state);
			return this;
		}

		/**
		 * Set the country property.
		 *
		 * @param country the country
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> country(final Country country) {
			shippingDetails.setCountry(country);
			return this;
		}

		/**
		 * Set the zip property.
		 *
		 * @param zip the zip
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> zip(final String zip) {
			shippingDetails.setZip(zip);
			return this;
		}

		/**
		 * Set the shipMethod property.
		 *
		 * @param string the ship method
		 * @return ShippingDetailsBuilder< BLDRT >
		 */
		public final ShippingDetailsBuilder<BLDRT> shipMethod(final ShipMethod shipMethod) {
			shippingDetails.setShipMethod(shipMethod);
			return this;
		}
	}
}
