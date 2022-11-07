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

public class AirlineTravelDetails implements DomainObject {

  /**
   * Passenger name record. Used by the airline company for reservation number.
   */
  @Expose
  private String passengerNameRecord;

  /**
   * Name of the passenger to whom the ticket was issued.
   */
  @Expose
  private String passengerName;

  /**
   * Date of passenger’s departure.
   *
   * <p>Date format = YYYY-MM-DD, ISO 8601 expected.</p>
   *
   * <b>Example: 2014-01-26</b>
   */
  @Expose
  private String departureDate;

  /**
   * Departure Airport Code (IATA Airport Code).<br>
   * Example “YUL”
   */
  @Expose
  private String origin;

  /**
   * Indicates the computerized reservation system used to make
   * the reservation and purchase the ticket.
   * <p>For tickets purchased in Germany, this field should one of these codes:</p>
   * <ul>
   *   <li>STRT = Start</li>
   *   <li>PARS = TWA</li>
   *   <li>DATS = Delta</li>
   *   <li>SABR = Sabre</li>
   *   <li>DALA = Covia-Apollo</li>
   *   <li>BLAN = Dr. Blank</li>
   *   <li>DERD = DER</li>
   *   <li>TUID = TUI</li>
   * </ul>
   */
  @Expose
  private ComputerizedReservationSystem computerizedReservationSystem;

  /**
   * 	BookingReference field. Typically used for the PNR,
   * 	but should allow an airline to specify any other reference if they feel fit.
   */
  @Expose
  private String additionalBookingReference;

  /**
   * Total fare for all legs on the ticket, excluding taxes and fees.
   * If multiple tickets are purchased, this is the total fare for all tickets
   */
  @Expose
  private Integer totalFare;

  /**
   * Total fee for all legs on the ticket. If multiple tickets are purchased, this is the total fee for all tickets
   */
  @Expose
  private Integer totalFee;

  /**
   * Total taxes for all legs on the ticket.
   * If multiple tickets are purchased, this is the total taxes for all tickets
   */
  @Expose
  private Integer totalTaxes;

  /**
   * Contains the code that the cardholder supplied to the card acceptor.
   */
  @Expose
  private String customerReferenceNumber;

  /**
   * Information about the Airline Ticket Number and if the ticket is restricted
   */
  @Expose
  private Ticket ticket;

  /**
   * Information about the passengers reserved tickets with the same transaction.
   */
  @Expose
  private Passengers passengers;

  /**
   * Information about the travel agency if the ticket was issued by a travel agency.
   */
  @Expose
  private TravelAgency travelAgency;

  /**
   * A grouping of up to four trip legs. Each leg provides detailed itinerary data.
   */
  @Expose
  private TripLegs tripLegs;

  public String getPassengerNameRecord() {
    return passengerNameRecord;
  }

  public void setPassengerNameRecord(String passengerNameRecord) {
    this.passengerNameRecord = passengerNameRecord;
  }

  public String getPassengerName() {
    return passengerName;
  }

  public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
  }

  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ComputerizedReservationSystem getComputerizedReservationSystem() {
    return computerizedReservationSystem;
  }

  public void setComputerizedReservationSystem(
      ComputerizedReservationSystem computerizedReservationSystem) {
    this.computerizedReservationSystem = computerizedReservationSystem;
  }

  public String getAdditionalBookingReference() {
    return additionalBookingReference;
  }

  public void setAdditionalBookingReference(String additionalBookingReference) {
    this.additionalBookingReference = additionalBookingReference;
  }

  public Integer getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(Integer totalFare) {
    this.totalFare = totalFare;
  }

  public Integer getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Integer totalFee) {
    this.totalFee = totalFee;
  }

  public Integer getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(Integer totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }

  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }

  public Ticket getTicket() {
    return ticket;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public Passengers getPassengers() {
    return passengers;
  }

  public void setPassengers(Passengers passengers) {
    this.passengers = passengers;
  }

  public TravelAgency getTravelAgency() {
    return travelAgency;
  }

  public void setTravelAgency(TravelAgency travelAgency) {
    this.travelAgency = travelAgency;
  }

  public TripLegs getTripLegs() {
    return tripLegs;
  }

  public void setTripLegs(TripLegs tripLegs) {
    this.tripLegs = tripLegs;
  }

  /**
   * The sub-builder class for MerchantDescriptor.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AirlineTravelDetailsBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<AirlineTravelDetails, BLDRT> {

    /** The merchant descriptor. */
    private final AirlineTravelDetails airlineTravelDetails = new AirlineTravelDetails();

    /**
     * Instantiates a new merchant descriptor builder.
     *
     * @param parent the parent
     */
    public AirlineTravelDetailsBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this MerchantDescriptor object.
     *
     * @return MerchantDescriptor
     */
    @Override
    public final AirlineTravelDetails build() {
      return airlineTravelDetails;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> passengerNameRecord(
        final String passengerNameRecord) {
      airlineTravelDetails.setPassengerNameRecord(passengerNameRecord);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> passengerName(
        final String passengerName) {
      airlineTravelDetails.setPassengerName(passengerName);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> departureDate(
        final String departureDate) {
      airlineTravelDetails.setDepartureDate(departureDate);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> origin(
        final String origin) {
      airlineTravelDetails.setOrigin(origin);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> computerizedReservationSystem(
        final ComputerizedReservationSystem computerizedReservationSystem) {
      airlineTravelDetails.setComputerizedReservationSystem(computerizedReservationSystem);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> additionalBookingReference(
        final String additionalBookingReference) {
      airlineTravelDetails.setAdditionalBookingReference(additionalBookingReference);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> totalFare(
        final Integer totalFare) {
      airlineTravelDetails.setTotalFare(totalFare);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> totalFee(
        final Integer totalFee) {
      airlineTravelDetails.setTotalFee(totalFee);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> totalTaxes(
        final Integer totalTaxes) {
      airlineTravelDetails.setTotalTaxes(totalTaxes);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> customerReferenceNumber(
        final String customerReferenceNumber) {
      airlineTravelDetails.setCustomerReferenceNumber(customerReferenceNumber);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> ticket(
        final Ticket ticket) {
      airlineTravelDetails.setTicket(ticket);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> passengers(
        final Passengers passengers) {
      airlineTravelDetails.setPassengers(passengers);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> travelAgency(
        final TravelAgency travelAgency) {
      airlineTravelDetails.setTravelAgency(travelAgency);
      return this;
    }

    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> tripLegs(
        final TripLegs tripLegs) {
      airlineTravelDetails.setTripLegs(tripLegs);
      return this;
    }
  }
}
