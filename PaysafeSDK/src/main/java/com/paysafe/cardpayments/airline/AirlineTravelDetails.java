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

  /**
   * Retrieve the passengerNameRecord.
   * @return the passenger name record
   */
  public String getPassengerNameRecord() {
    return passengerNameRecord;
  }

  /**
   * Set the passengerNameRecord
   * @param passengerNameRecord - name to set
   */
  public void setPassengerNameRecord(String passengerNameRecord) {
    this.passengerNameRecord = passengerNameRecord;
  }

  /**
   * Retrieve the passengerName.
   * @return the passengerName
   */
  public String getPassengerName() {
    return passengerName;
  }

  /**
   * Set the passengerName
   * @param passengerName - name to set
   */
  public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
  }

  /**
   * Retrieve the departureDate.   * @return the departureDate
   */
  public String getDepartureDate() {
    return departureDate;
  }

  /**
   * Set the departureDate.
   * @param departureDate - date to set
   */
  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  /**
   * Retrieve the origin.
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Set the origin.
   * @param origin - origin to set
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * Retrieve the computerizedReservationSystem.
   * @return - the computerizedReservationSystem
   */
  public ComputerizedReservationSystem getComputerizedReservationSystem() {
    return computerizedReservationSystem;
  }

  /**
   * Set the computerizedReservationSystem.
   * @param computerizedReservationSystem - computerizedReservationSystem to set
   */
  public void setComputerizedReservationSystem(
      ComputerizedReservationSystem computerizedReservationSystem) {
    this.computerizedReservationSystem = computerizedReservationSystem;
  }

  /**
   * Retrieve additionalBookingReference.
   * @return the additionalBookingReference
   */
  public String getAdditionalBookingReference() {
    return additionalBookingReference;
  }

  /**
   * Set the additionalBookingReference.
   * @param additionalBookingReference - additionalBookingReference to set
   */
  public void setAdditionalBookingReference(String additionalBookingReference) {
    this.additionalBookingReference = additionalBookingReference;
  }

  /**
   * Retrieve the totalFare.
   * @return the totalFare
   */
  public Integer getTotalFare() {
    return totalFare;
  }

  /**
   * Set the totalFare.
   * @param totalFare - totalFare to set.
   */
  public void setTotalFare(Integer totalFare) {
    this.totalFare = totalFare;
  }

  /**
   * Retrieve the totalFee.
   * @return the totalFee
   */
  public Integer getTotalFee() {
    return totalFee;
  }

  /**
   * Set the totalFee.
   * @param totalFee - totalFee to set
   */
  public void setTotalFee(Integer totalFee) {
    this.totalFee = totalFee;
  }

  /**
   * Retrieve totalTaxes.
   * @return the totalTaxes
   */
  public Integer getTotalTaxes() {
    return totalTaxes;
  }

  /**
   * Set the totalTaxes.
   * @param totalTaxes - totalTaxes to set
   */
  public void setTotalTaxes(Integer totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  /**
   * Retrieve the customerReferenceNumber.
   * @return the customerReferenceNumber
   */
  public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }

  /**
   * Set the customerReferenceNumber.
   * @param customerReferenceNumber - customerReferenceNumber to set
   */
  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }

  /**
   * Retrieve the ticket.
   * @return the ticket
   */
  public Ticket getTicket() {
    return ticket;
  }

  /**
   * Set the ticket.
   * @param ticket - ticket to set
   */
  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  /**
   * Retrieve the passengers.
   * @return the passengers
   */
  public Passengers getPassengers() {
    return passengers;
  }

  /**
   * Set the passengers.
   * @param passengers - passengers to set
   */
  public void setPassengers(Passengers passengers) {
    this.passengers = passengers;
  }

  /**
   * Retrieve the travelAgency.
   * @return the travelAgency
   */
  public TravelAgency getTravelAgency() {
    return travelAgency;
  }

  /**
   * Set the travelAgency.
   * @param travelAgency - travelAgency to set
   */
  public void setTravelAgency(TravelAgency travelAgency) {
    this.travelAgency = travelAgency;
  }

  /**
   * Retrieve the tripLegs.
   * @return the tripLegs
   */
  public TripLegs getTripLegs() {
    return tripLegs;
  }

  /**
   * Set the tripLegs.
   * @param tripLegs - tripLegs to set
   */
  public void setTripLegs(TripLegs tripLegs) {
    this.tripLegs = tripLegs;
  }

  /**
   * The sub-builder class for the AirlineTravelDetails object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AirlineTravelDetailsBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<AirlineTravelDetails, BLDRT> {

    /** The airlineTravelDetails to be created. */
    private final AirlineTravelDetails airlineTravelDetails = new AirlineTravelDetails();

    /**
     * The sub-builder for the ticket parameter.
     */
    private Ticket.TicketBuilder<AirlineTravelDetailsBuilder<BLDRT>> ticketBuilder;

    /**
     * The sub-builder for the travelAgency parameter.
     */
    private TravelAgency.TravelAgencyBuilder<AirlineTravelDetailsBuilder<BLDRT>> travelAgencyBuilder;

    /**
     * The sub-builder for the passengers parameter.
     */
    private Passengers.PassengersBuilder<AirlineTravelDetailsBuilder<BLDRT>> passengersBuilder;

    /**
     * The sub-builder for the tripLegs parameter.
     */
    private TripLegs.TripLegsBuilder<AirlineTravelDetailsBuilder<BLDRT>> tripLegsBuilder;

    /**
     * Instantiates a new AirlineTravelDetails builder.
     *
     * @param parent the parent
     */
    public AirlineTravelDetailsBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this AirlineTravelDetails object.
     *
     * @return the created AirlineTravelDetails object
     */
    @Override
    public final AirlineTravelDetails build() {
      if (ticketBuilder != null) {
        airlineTravelDetails.setTicket(ticketBuilder.build());
      }

      if (travelAgencyBuilder != null) {
        airlineTravelDetails.setTravelAgency(travelAgencyBuilder.build());
      }

      if (passengersBuilder != null) {
        airlineTravelDetails.setPassengers(passengersBuilder.build());
      }

      if (tripLegsBuilder != null) {
        airlineTravelDetails.setTripLegs(tripLegsBuilder.build());
      }

      return airlineTravelDetails;
    }

    /**
     * Set the passengerNameRecord to the current builder instance.
     * @param passengerNameRecord - passengerNameRecord to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> passengerNameRecord(
        final String passengerNameRecord) {
      airlineTravelDetails.setPassengerNameRecord(passengerNameRecord);
      return this;
    }

    /**
     * Set the passengerName to the current builder instance.
     * @param passengerName - passengerName to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> passengerName(
        final String passengerName) {
      airlineTravelDetails.setPassengerName(passengerName);
      return this;
    }


    /**
     * Set the departureDate to the current builder instance.
     * @param departureDate - departureDate to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> departureDate(
        final String departureDate) {
      airlineTravelDetails.setDepartureDate(departureDate);
      return this;
    }


    /**
     * Set the origin to the current builder instance.
     * @param origin - origin to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> origin(
        final String origin) {
      airlineTravelDetails.setOrigin(origin);
      return this;
    }


    /**
     * Set the computerizedReservationSystem to the current builder instance.
     * @param computerizedReservationSystem - computerizedReservationSystem to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> computerizedReservationSystem(
        final ComputerizedReservationSystem computerizedReservationSystem) {
      airlineTravelDetails.setComputerizedReservationSystem(computerizedReservationSystem);
      return this;
    }


    /**
     * Set the additionalBookingReference to the current builder instance.
     * @param additionalBookingReference - additionalBookingReference to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> additionalBookingReference(
        final String additionalBookingReference) {
      airlineTravelDetails.setAdditionalBookingReference(additionalBookingReference);
      return this;
    }


    /**
     * Set the totalFare to the current builder instance.
     * @param totalFare - totalFare to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> totalFare(
        final Integer totalFare) {
      airlineTravelDetails.setTotalFare(totalFare);
      return this;
    }


    /**
     * Set the totalFee to the current builder instance.
     * @param totalFee - totalFee to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> totalFee(
        final Integer totalFee) {
      airlineTravelDetails.setTotalFee(totalFee);
      return this;
    }


    /**
     * Set the totalTaxes to the current builder instance.
     * @param totalTaxes - totalTaxes to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> totalTaxes(
        final Integer totalTaxes) {
      airlineTravelDetails.setTotalTaxes(totalTaxes);
      return this;
    }


    /**
     * Set the customerReferenceNumber to the current builder instance.
     * @param customerReferenceNumber - customerReferenceNumber to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> customerReferenceNumber(
        final String customerReferenceNumber) {
      airlineTravelDetails.setCustomerReferenceNumber(customerReferenceNumber);
      return this;
    }


    /**
     * Set the ticket to the current builder instance.
     * @param ticket - ticket to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> ticket(
        final Ticket ticket) {
      airlineTravelDetails.setTicket(ticket);
      return this;
    }


    /**
     * Starts a new TicketBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TicketBuilder
     */
    public final Ticket.TicketBuilder<AirlineTravelDetailsBuilder<BLDRT>> ticket() {
      if (ticketBuilder == null) {
        ticketBuilder = new Ticket.TicketBuilder<>(this);
      }
      return ticketBuilder;
    }


    /**
     * Set the passengers to the current builder instance.
     * @param passengers - passengers to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> passengers(
        final Passengers passengers) {
      airlineTravelDetails.setPassengers(passengers);
      return this;
    }

    /**
     * Starts a new PassengersBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengersBuilder
     */
    public final Passengers.PassengersBuilder<AirlineTravelDetailsBuilder<BLDRT>> passengers() {
      if (passengersBuilder == null) {
        passengersBuilder = new Passengers.PassengersBuilder<>(this);
      }
      return passengersBuilder;
    }


    /**
     * Set the travelAgency to the current builder instance.
     * @param travelAgency - travelAgency to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> travelAgency(
        final TravelAgency travelAgency) {
      airlineTravelDetails.setTravelAgency(travelAgency);
      return this;
    }

    /**
     * Starts a new TravelAgencyBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TravelAgencyBuilder
     */
    public final TravelAgency.TravelAgencyBuilder<AirlineTravelDetailsBuilder<BLDRT>> travelAgency() {
      if (travelAgencyBuilder == null) {
        travelAgencyBuilder = new TravelAgency.TravelAgencyBuilder<>(this);
      }
      return travelAgencyBuilder;
    }


    /**
     * Set the tripLegs to the current builder instance.
     * @param tripLegs - passengerNameRecord to set
     * @return the currentBuilder
     */
    public final AirlineTravelDetails.AirlineTravelDetailsBuilder<BLDRT> tripLegs(
        final TripLegs tripLegs) {
      airlineTravelDetails.setTripLegs(tripLegs);
      return this;
    }

    /**
     * Starts a new TripLegsBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TripLegsBuilder
     */
    public final TripLegs.TripLegsBuilder<AirlineTravelDetailsBuilder<BLDRT>> tripLegs() {
      if (tripLegsBuilder == null) {
        tripLegsBuilder = new TripLegs.TripLegsBuilder<>(this);
      }
      return tripLegsBuilder;
    }
  }
}
