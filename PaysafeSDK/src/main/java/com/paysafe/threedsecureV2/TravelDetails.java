package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class TravelDetails.
 */
public class TravelDetails implements DomainObject {

	/** The isAirTravel. */
	@Expose
	private Boolean isAirTravel;

	/** The departureDate. */
	@Expose
	private String departureDate;

	/** The passengerFirstName. */
	@Expose
	private String passengerFirstName;

	/** The passengerLastName. */
	@Expose
	private String passengerLastName;

	/** The origin. */
	@Expose
	private String origin;

	/** The destination. */
	@Expose
	private String destination;

	/** The airlineCarrier. */
	@Expose
	private String airlineCarrier;

	/**
	 * Gets the isAirTravel.
	 *
	 * @return the isAirTravel
	 */
	public Boolean getIsAirTravel() {
		return isAirTravel;
	}

	/**
	 * Sets the isAirTravel.
	 *
	 * @param isAirTravel the new isAirTravel
	 *            
	 */
	public void setIsAirTravel(Boolean isAirTravel) {
		this.isAirTravel = isAirTravel;
	}

	/**
	 * Gets the departureDate.
	 *
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * Sets the departureDate.
	 *
	 * @param departureDate the new departureDate
	 *            
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * Gets the passengerFirstName.
	 *
	 * @return the passengerFirstName
	 */
	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	/**
	 * Sets the passengerFirstName.
	 *
	 * @param passengerFirstName the new passengerFirstName
	 *            
	 */
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	/**
	 * Gets the passengerLastName.
	 *
	 * @return the passengerLastName
	 */
	public String getPassengerLastName() {
		return passengerLastName;
	}

	/**
	 * Sets the passengerLastName.
	 *
	 * @param passengerLastName the new passengerLastName
	 *            
	 */
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	/**
	 * Gets the origin.
	 *
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param origin the new origin
	 *            
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination the new destination
	 *            
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Gets the airlineCarrier.
	 *
	 * @return the airlineCarrier
	 */
	public String getAirlineCarrier() {
		return airlineCarrier;
	}

	/**
	 * Sets the airlineCarrier.
	 *
	 * @param airlineCarrier the new airlineCarrier
	 *            
	 */
	public void setAirlineCarrier(String airlineCarrier) {
		this.airlineCarrier = airlineCarrier;
	}

	/**
	 * The builder class for TravelDetails.
	 */
	public static class TravelDetailsBuilder<BLDRT extends GenericBuilder> extends NestedBuilder<TravelDetails, BLDRT> {
		public TravelDetailsBuilder(final BLDRT parent) {
			super(parent);
		}

		private final TravelDetails travelDetails = new TravelDetails();

		@Override
		public TravelDetails build() {
			return travelDetails;
		}

		/**
		 * Set the isAirTravel property.
		 *
		 * @param isAirTravel the isAirTravel
		 *            
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> isAirTravel(final Boolean isAirTravel) {
			travelDetails.setIsAirTravel(isAirTravel);
			return this;
		}

		/**
		 * Set the departureDate property.
		 *
		 * @param departureDate the departureDate
		 *           
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> departureDate(final String departureDate) {
			travelDetails.setDepartureDate(departureDate);
			return this;
		}

		/**
		 * Set the passengerFirstName property.
		 *
		 * @param passengerFirstName the passengerFirstName
		 *           
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> passengerFirstName(final String passengerFirstName) {
			travelDetails.setPassengerFirstName(passengerFirstName);
			return this;
		}

		/**
		 * Set the passengerLastName property.
		 *
		 * @param passengerLastName the passengerLastName
		 *            
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> passengerLastName(final String passengerLastName) {
			travelDetails.setPassengerLastName(passengerLastName);
			return this;
		}

		/**
		 * Set the origin property.
		 *
		 * @param origin the origin
		 *            
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> origin(final String origin) {
			travelDetails.setOrigin(origin);
			return this;
		}

		/**
		 * Set the destination property.
		 *
		 * @param destination the destination
		 *            
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> destination(final String destination) {
			travelDetails.setDestination(destination);
			return this;
		}

		/**
		 * Set the airlineCarrier property.
		 *
		 * @param airlineCarrier the airlineCarrier
		 *            
		 * @return TravelDetailsBuilder
		 */
		public final TravelDetailsBuilder<BLDRT> airlineCarrier(final String airlineCarrier) {
			travelDetails.setAirlineCarrier(airlineCarrier);
			return this;
		}
	}
}
