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

public class Ticket implements DomainObject {

  /**
   * Airline Ticket Number
   */
  @Expose
  private String ticketNumber;

  /**
   * Indicates whether this ticket is non-refundable.
   * This entry should be supplied on CPS/Passenger Transport 1 or 2
   * transactions if the ticket was purchased as a non-refundable ticket.
   *
   * <p>Valid values are:
   *   <ul>
   *     <li>false - No restriction (default)</li>
   *     <li>true - Restricted (non-refundable) ticket</li>
   *   </ul>
   * </p>
   */
  @Expose
  private Boolean isRestrictedTicket;

  /**
   * Place of issue for the ticket for this passenger
   */
  @Expose
  private String cityOfTicketIssuing;

  /**
   * Way of delivering the ticket.
   *
   * <p>One of:
   *  <ol>
   *    <li>E_TICKET</li>
   *    <li>CITY_TICKET_OFFICE</li>
   *    <li>AIRPORT_TICKET_OFFICE</li>
   *    <li>TICKET_BY_MAIL</li>
   *    <li>TICKET_ON_DEPARTURE</li>
   *  </ol>
   * </p>
   */
  @Expose
  private TicketDeliveryMethod ticketDeliveryMethod;

  /**
   * Price for one ticket.
   */
  @Expose
  private Integer ticketPrice;

  /**
   * Ticket's issue date. Sometime it is different that the date of the transaction (can be before that). <br>
   *
   * <b>Date format = YYYY-MM-DD, ISO 8601</b>
   * <p>Example:  2021-01-26</p>
   */
  @Expose
  private String ticketIssueDate;

  /**
   * Specifies whether the purchaser is the ticket holder or agency.
   */
  @Expose
  private Boolean isAgencyCard;

  /**
   * The number of the passengers which tickets are with the same PNR.
   */
  @Expose
  private Integer numberOfPax;

  /**
   * Retrieve the ticketNumber.
   * @return the ticketNumber
   */
  public String getTicketNumber() {
    return ticketNumber;
  }

  /**
   * Set the ticketNumber.
   * @param ticketNumber - ticketNumber to set
   */
  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  /**
   * Retrieve whether the ticket is restricted
   * @return true if restricted
   */
  public Boolean getRestrictedTicket() {
    return isRestrictedTicket;
  }

  /**
   * Set whether the ticket is restricted
   * @param restrictedTicket - true if restricted
   */
  public void setRestrictedTicket(Boolean restrictedTicket) {
    isRestrictedTicket = restrictedTicket;
  }

  /**
   * Retrieve the cityOfTicketIssuing.
   * @return the cityOfTicketIssuing
   */
  public String getCityOfTicketIssuing() {
    return cityOfTicketIssuing;
  }

  /**
   * Set the cityOfTicketIssuing.
   * @param cityOfTicketIssuing - the cityOfTicketIssuing to set
   */
  public void setCityOfTicketIssuing(String cityOfTicketIssuing) {
    this.cityOfTicketIssuing = cityOfTicketIssuing;
  }

  /**
   * Retrieve the ticketDeliveryMethod.
   * @return the ticketDeliveryMethod
   */
  public TicketDeliveryMethod getTicketDeliveryMethod() {
    return ticketDeliveryMethod;
  }

  /**
   * Set the ticketDeliveryMethod.
   * @param ticketDeliveryMethod - the ticketDeliveryMethod to set
   */
  public void setTicketDeliveryMethod(TicketDeliveryMethod ticketDeliveryMethod) {
    this.ticketDeliveryMethod = ticketDeliveryMethod;
  }

  /**
   * Retrieve the ticketPrice.
   * @return the ticketPrice
   */
  public Integer getTicketPrice() {
    return ticketPrice;
  }

  /**
   * Set the ticketPrice.
   * @param ticketPrice - the ticketPrice to set
   */
  public void setTicketPrice(Integer ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  /**
   * Retrieve the ticketIssueDate.
   * @return the ticketIssueDate
   */
  public String getTicketIssueDate() {
    return ticketIssueDate;
  }

  /**
   * Set the ticketIssueDate.
   * @param ticketIssueDate - the ticketIssueDate to set.
   */
  public void setTicketIssueDate(String ticketIssueDate) {
    this.ticketIssueDate = ticketIssueDate;
  }

  /**
   * Retrieve whether this is an agency card.
   * @return true if agency card
   */
  public Boolean getAgencyCard() {
    return isAgencyCard;
  }

  /**
   * Set whether this is an agency card.
   * @param agencyCard - true if agency card
   */
  public void setAgencyCard(Boolean agencyCard) {
    isAgencyCard = agencyCard;
  }

  /**
   * Retrieve the numberOfPax.
   * @return the numberOfPax
   */
  public Integer getNumberOfPax() {
    return numberOfPax;
  }

  /**
   * Set the numberOfPax.
   * @param numberOfPax - the numberOfPax to set
   */
  public void setNumberOfPax(Integer numberOfPax) {
    this.numberOfPax = numberOfPax;
  }


  /**
   * The sub-builder class for the Ticket object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class TicketBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<Ticket, BLDRT> {

    /**
     * The ticket object to be built.
     */
    private final Ticket ticket = new Ticket();

    /**
     * Creates a new TicketBuilder object.
     * @param parent - the parent builder
     */
    public TicketBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this Ticket object.
     *
     * @return the created Ticket object
     */
    @Override
    public final Ticket build() {
      return ticket;
    }

    /**
     * Set the restrictedTicket to the current builder instance.
     * @param restrictedTicket - restrictedTicket to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> restrictedTicket(
        final Boolean restrictedTicket) {
      ticket.setRestrictedTicket(restrictedTicket);
      return this;
    }

    /**
     * Set the ticketPrice to the current builder instance.
     * @param ticketPrice - ticketPrice to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> ticketPrice(
        final Integer ticketPrice) {
      ticket.setTicketPrice(ticketPrice);
      return this;
    }

    /**
     * Set the ticketNumber to the current builder instance.
     * @param ticketNumber - ticketNumber to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> ticketNumber(
        final String ticketNumber) {
      ticket.setTicketNumber(ticketNumber);
      return this;
    }

    /**
     * Set the cityOfTicketIssuing to the current builder instance.
     * @param cityOfTicketIssuing - cityOfTicketIssuing to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> cityOfTicketIssuing(
        final String cityOfTicketIssuing) {
      ticket.setCityOfTicketIssuing(cityOfTicketIssuing);
      return this;
    }

    /**
     * Set the ticketIssueDate to the current builder instance.
     * @param ticketIssueDate - ticketIssueDate to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> ticketIssueDate(
        final String ticketIssueDate) {
      ticket.setTicketIssueDate(ticketIssueDate);
      return this;
    }

    /**
     * Set the agencyCard to the current builder instance.
     * @param agencyCard - agencyCard to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> agencyCard(
        final Boolean agencyCard) {
      ticket.setAgencyCard(agencyCard);
      return this;
    }

    /**
     * Set the numberOfPax to the current builder instance.
     * @param numberOfPax - numberOfPax to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> numberOfPax(
        final Integer numberOfPax) {
      ticket.setNumberOfPax(numberOfPax);
      return this;
    }

    /**
     * Set the ticketDeliveryMethod to the current builder instance.
     * @param ticketDeliveryMethod - ticketDeliveryMethod to set
     * @return the currentBuilder
     */
    public final Ticket.TicketBuilder<BLDRT> ticketDeliveryMethod(
        final TicketDeliveryMethod ticketDeliveryMethod) {
      ticket.setTicketDeliveryMethod(ticketDeliveryMethod);
      return this;
    }

  }
}
