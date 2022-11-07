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
  private String taxes;

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public String getServiceClass() {
    return serviceClass;
  }

  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }

  public Integer getServiceClassFee() {
    return serviceClassFee;
  }

  public void setServiceClassFee(Integer serviceClassFee) {
    this.serviceClassFee = serviceClassFee;
  }

  public Boolean getStopOverAllowed() {
    return isStopOverAllowed;
  }

  public void setStopOverAllowed(Boolean stopOverAllowed) {
    isStopOverAllowed = stopOverAllowed;
  }

  public String getDepartureAirport() {
    return departureAirport;
  }

  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public String getConjunctionTicket() {
    return conjunctionTicket;
  }

  public void setConjunctionTicket(String conjunctionTicket) {
    this.conjunctionTicket = conjunctionTicket;
  }

  public String getCouponNumber() {
    return couponNumber;
  }

  public void setCouponNumber(String couponNumber) {
    this.couponNumber = couponNumber;
  }

  public String getNotation() {
    return notation;
  }

  public void setNotation(String notation) {
    this.notation = notation;
  }

  public String getTaxes() {
    return taxes;
  }

  public void setTaxes(String taxes) {
    this.taxes = taxes;
  }

  public static class TripLegBuilder<
      BLDRT extends GenericBuilder> extends
      NestedBuilder<TripLeg, BLDRT> {

    private final TripLeg tripLeg = new TripLeg();


    public TripLegBuilder(final BLDRT parent) {
      super(parent);
    }

    @Override
    public final TripLeg build() {
      return tripLeg;
    }

    public final TripLeg.TripLegBuilder<BLDRT> arrivalTime(
        final String arrivalTime) {
      tripLeg.setArrivalTime(arrivalTime);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> conjunctionTicket(
        final String conjunctionTicket) {
      tripLeg.setConjunctionTicket(conjunctionTicket);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> couponNumber(
        final String couponNumber) {
      tripLeg.setCouponNumber(couponNumber);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> departureTime(
        final String departureTime) {
      tripLeg.setDepartureTime(departureTime);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> departureAirport(
        final String departureAirport) {
      tripLeg.setDepartureAirport(departureAirport);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> destination(
        final String destination) {
      tripLeg.setDestination(destination);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> fareBasis(
        final String fareBasis) {
      tripLeg.setFareBasis(fareBasis);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> departureDate(
        final String departureDate) {
      tripLeg.setDepartureDate(departureDate);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> flight(
        final Flight flight) {
      tripLeg.setFlight(flight);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> notation(
        final String notation) {
      tripLeg.setNotation(notation);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> stopOverAllowed(
        final Boolean stopOverAllowed) {
      tripLeg.setStopOverAllowed(stopOverAllowed);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> taxes(
        final String taxes) {
      tripLeg.setTaxes(taxes);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> serviceClass(
        final String serviceClass) {
      tripLeg.setServiceClass(serviceClass);
      return this;
    }

    public final TripLeg.TripLegBuilder<BLDRT> serviceClassFee(
        final Integer serviceClassFee) {
      tripLeg.setServiceClassFee(serviceClassFee);
      return this;
    }


  }
}
