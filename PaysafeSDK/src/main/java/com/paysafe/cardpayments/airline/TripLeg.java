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

public class TripLeg implements DomainObject {

  /**
   * Operating Carrier Code and the Number of the airline flight to
   * be taken on Leg of the trip (excluding the carrier code).
   */
  @Expose
  private Flight flight;

  /**
   * Indicates service class (first class, business class, etc.). <br>
   * Example values (not limited to):
   * <ul>
   *   <li>F - First Class</li>
   *   <li>J - Business Class</li>
   *   <li>W - Premium Economy Class</li>
   *   <li>Y - Economy Class</li>
   * </ul>
   */
  @Expose
  private String serviceClass;

  /**
   * Fee applied to a specific leg.
   */
  @Expose
  private Integer serviceClassFee;

  /**
   * Indicates whether a stopover is allowed on this ticket.
   */
  @Expose
  private Boolean isStopOverAllowed;

  /**
   * The airport of departure.
   */
  @Expose
  private String departureAirport;

  /**
   * Destination Airport Code (IATA Airport Code).
   */
  @Expose
  private String destination;

  /**
   * Contains a Fare Basis Code for Leg that carriers assign to a
   * particular ticket type, such as business class or discounted/nonrefundable.
   */
  @Expose
  private String fareBasis;

  /**
   * Date of passenger’s departure for this leg. <br>
   *
   * <b>Date format = YYYY-MM-DD, ISO 8601</b><br>
   *
   * <p>Example: 2014-01-26</p>
   */
  @Expose
  private String departureDate;


  /**
   * Departure time at the airport of departure. <br>
   *
   * <b>Date format = YYYY-MM-DDTHH:MM:SSZ, ISO 8601</b> <br>
   *
   * <p>Example: 2022-01-26T10:32:28Z</p>
   */
  @Expose
  private String departureTime;

  /**
   * Arrival time at the airport for that specific leg. <br>
   *
   * <b>Date format = YYYY-MM-DDTHH:MM:SSZ, ISO 8601</b> <br>
   *
   * <p>Example: 2022-01-26T10:32:28Z</p>
   */
  @Expose
  private String arrivalTime;

  /**
   * Specifying a number of the conjunction ticket within a single contract of carriage.
   */
  @Expose
  private String conjunctionTicket;

  /**
   * Coupon number associated with the leg. Every leg could have a coupon number.
   */
  @Expose
  private String couponNumber;

  /**
   * An endorsement can be an agency-added notation or a mandatory government required notation,
   * such as value-added tax. A restriction is a limitation based on the type of fare,
   * such as a ticket with a 3-day minimum stay.
   */
  @Expose
  private String notation;

  /**
   * Taxes for a specific leg.
   */
  @Expose
  private Integer taxes;

  /**
   * Retrieve the flight.
   * @return the flight
   */
  public Flight getFlight() {
    return flight;
  }

  /**
   * Set the flight.
   * @param flight - flight to set
   */
  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  /**
   * Retrieve the serviceClass.
   * @return the serviceClass
   */
  public String getServiceClass() {
    return serviceClass;
  }

  /**
   * Set the serviceClass.
   * @param serviceClass - serviceClass to set
   */
  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }

  /**
   * Retrieve the serviceClassFee.
   * @return the serviceClassFee
   */
  public Integer getServiceClassFee() {
    return serviceClassFee;
  }

  /**
   * Set the serviceClassFee.
   * @param serviceClassFee - serviceClassFee to set
   */
  public void setServiceClassFee(Integer serviceClassFee) {
    this.serviceClassFee = serviceClassFee;
  }

  /**
   * Retrieve whether stopOver is allowed.
   * @return true if allowed
   */
  public Boolean getStopOverAllowed() {
    return isStopOverAllowed;
  }

  /**
   * Set whether stopOver is allowed.
   * @param stopOverAllowed - true if allowed
   */
  public void setStopOverAllowed(Boolean stopOverAllowed) {
    isStopOverAllowed = stopOverAllowed;
  }

  /**
   * Retrieve the departureAirport.
   * @return the departureAirport.
   */
  public String getDepartureAirport() {
    return departureAirport;
  }

  /**
   * Set the departureAirport.
   * @param departureAirport - departureAirport to set 
   */
  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  /**
   * Retrieve the destination.
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Set the destination.
   * @param destination - destination to set
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Retrieve the fareBasis.
   * @return tha fareBasis.
   */
  public String getFareBasis() {
    return fareBasis;
  }

  /**
   * Set the fareBasis.
   * @param fareBasis - fareBasis to set
   */
  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }

  /**
   * Retrieve the departureTime.
   * @return the departureTime
   */
  public String getDepartureTime() {
    return departureTime;
  }

  /**
   * Set the departureTime.
   * @param departureTime - departureTime to set
   */
  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  /**
   * Retrieve the departureDate.
   * @return the departureDate
   */
  public String getDepartureDate() {
    return departureDate;
  }

  /**
   * Set the departureDate.
   * @param departureDate - departureDate to set
   */
  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  /**
   * Retrieve the arrivalTime.
   * @return the arrivalTime
   */
  public String getArrivalTime() {
    return arrivalTime;
  }

  /**
   * Set teh arrivalTime.
   * @param arrivalTime - arrivalTime to set
   */
  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  /**
   * Retrieve the conjunctionTicket.
   * @return the conjunctionTicket
   */
  public String getConjunctionTicket() {
    return conjunctionTicket;
  }

  /**
   * Set the conjunctionTicket. 
   * @param conjunctionTicket - conjunctionTicket to set
   */
  public void setConjunctionTicket(String conjunctionTicket) {
    this.conjunctionTicket = conjunctionTicket;
  }

  /**
   * Retrieve the couponNumber.
   * @return the couponNumber
   */
  public String getCouponNumber() {
    return couponNumber;
  }

  /**
   * Set the couponNumber.
   * @param couponNumber - couponNumber to set
   */
  public void setCouponNumber(String couponNumber) {
    this.couponNumber = couponNumber;
  }

  /**
   * Retrieve the notation.
   * @return the notation
   */
  public String getNotation() {
    return notation;
  }

  /**
   * Set the notation.
   * @param notation - notation to set
   */
  public void setNotation(String notation) {
    this.notation = notation;
  }

  /**
   * Retrieve the taxes.
   * @return the taxes
   */
  public Integer getTaxes() {
    return taxes;
  }

  /**
   * Set the taxes.
   * @param taxes - taxes to set
   */
  public void setTaxes(Integer taxes) {
    this.taxes = taxes;
  }

  /**
   * The sub-builder class for the TripLeg object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class TripLegBuilder<
      BLDRT extends GenericBuilder> extends
      NestedBuilder<TripLeg, BLDRT> {


    /**
     * The builder for the flight.
     */
    private Flight.FlightBuilder<TripLegBuilder<BLDRT>> flightBuilder;
    
    /**
     * The tripLeg object to be built.
     */
    private final TripLeg tripLeg = new TripLeg();


    /**
     * Creates a new TripLegBuilder object.
     * @param parent - the parent builder
     */
    public TripLegBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this TripLeg object.
     *
     * @return the created TripLeg object
     */
    @Override
    public final TripLeg build() {
      if (flightBuilder != null) {
        tripLeg.setFlight(flightBuilder.build());
      }
      return tripLeg;
    }

    /**
     * Set the arrivalTime to the current builder instance.
     * @param arrivalTime - arrivalTime to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> arrivalTime(
        final String arrivalTime) {
      tripLeg.setArrivalTime(arrivalTime);
      return this;
    }

    /**
     * Set the conjunctionTicket to the current builder instance.
     * @param conjunctionTicket - conjunctionTicket to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> conjunctionTicket(
        final String conjunctionTicket) {
      tripLeg.setConjunctionTicket(conjunctionTicket);
      return this;
    }

    /**
     * Set the couponNumber to the current builder instance.
     * @param couponNumber - couponNumber to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> couponNumber(
        final String couponNumber) {
      tripLeg.setCouponNumber(couponNumber);
      return this;
    }

    /**
     * Set the departureTime to the current builder instance.
     * @param departureTime - departureTime to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> departureTime(
        final String departureTime) {
      tripLeg.setDepartureTime(departureTime);
      return this;
    }

    /**
     * Set the departureAirport to the current builder instance.
     * @param departureAirport - departureAirport to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> departureAirport(
        final String departureAirport) {
      tripLeg.setDepartureAirport(departureAirport);
      return this;
    }

    /**
     * Set the destination to the current builder instance.
     * @param destination - destination to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> destination(
        final String destination) {
      tripLeg.setDestination(destination);
      return this;
    }

    /**
     * Set the fareBasis to the current builder instance.
     * @param fareBasis - fareBasis to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> fareBasis(
        final String fareBasis) {
      tripLeg.setFareBasis(fareBasis);
      return this;
    }

    /**
     * Set the departureDate to the current builder instance.
     * @param departureDate - departureDate to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> departureDate(
        final String departureDate) {
      tripLeg.setDepartureDate(departureDate);
      return this;
    }

    /**
     * Set the flight to the current builder instance.
     * @param flight - flight to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> flight(
        final Flight flight) {
      tripLeg.setFlight(flight);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Flight.FlightBuilder<TripLegBuilder<BLDRT>> flight() {
      if (flightBuilder == null) {
        flightBuilder = new Flight.FlightBuilder<>(this);
      }
      return flightBuilder;
    }

    /**
     * Set the notation to the current builder instance.
     * @param notation - notation to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> notation(
        final String notation) {
      tripLeg.setNotation(notation);
      return this;
    }

    /**
     * Set the stopOverAllowed to the current builder instance.
     * @param stopOverAllowed - stopOverAllowed to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> stopOverAllowed(
        final Boolean stopOverAllowed) {
      tripLeg.setStopOverAllowed(stopOverAllowed);
      return this;
    }

    /**
     * Set the taxes to the current builder instance.
     * @param taxes - ticketNumber to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> taxes(
        final Integer taxes) {
      tripLeg.setTaxes(taxes);
      return this;
    }

    /**
     * Set the serviceClass to the current builder instance.
     * @param serviceClass - serviceClass to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> serviceClass(
        final String serviceClass) {
      tripLeg.setServiceClass(serviceClass);
      return this;
    }

    /**
     * Set the serviceClassFee to the current builder instance.
     * @param serviceClassFee - serviceClassFee- to set
     * @return the currentBuilder
     */
    public final TripLeg.TripLegBuilder<BLDRT> serviceClassFee(
        final Integer serviceClassFee) {
      tripLeg.setServiceClassFee(serviceClassFee);
      return this;
    }


  }
}
