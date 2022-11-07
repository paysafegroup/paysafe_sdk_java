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

import com.paysafe.common.Gender;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

import com.google.gson.annotations.Expose;

public class Passenger implements DomainObject {

  /**
   * Identifies the ticket for this passenger only.
   */
  @Expose
  private String ticketNumber;

  /**
   * Passenger's first name.
   */
  @Expose
  private String firstName;

  /**
   * Passenger's last name.
   */
  @Expose
  private String lastName;

  /**
   * Passenger's phoneNumber name.
   */
  @Expose
  private String phoneNumber;

  /**
   * Code that identifies a type of passenger. For example 'INF' which indicates a child travelling on parent's lap.
   */
  @Expose
  private String passengerCode;

  /**
   * Passenger's gender.
   *
   * One of:
   * <ul>
   *   <li>M – Male</li>
   *   <li>F – Female</li>
   *   <li>O – Other</li>
   *   <li>N – Not Specified</li>
   * </ul>
   */
  @Expose
  private Gender gender;

  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPassengerCode() {
    return passengerCode;
  }

  public void setPassengerCode(String passengerCode) {
    this.passengerCode = passengerCode;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public static class PassengerBuilder<
      BLDRT extends GenericBuilder> extends
      NestedBuilder<Passenger, BLDRT> {

    private final Passenger passenger = new Passenger();

    public PassengerBuilder(final BLDRT parent) {
      super(parent);
    }

    @Override
    public final Passenger build() {
      return passenger;
    }

    public final Passenger.PassengerBuilder<BLDRT> passengerCode(
        final String passengerCode) {
      passenger.setPassengerCode(passengerCode);
      return this;
    }

    public final Passenger.PassengerBuilder<BLDRT> gender(
        final Gender gender) {
      passenger.setGender(gender);
      return this;
    }

    public final Passenger.PassengerBuilder<BLDRT> firstName(
        final String firstName) {
      passenger.setFirstName(firstName);
      return this;
    }

    public final Passenger.PassengerBuilder<BLDRT> lastName(
        final String lastName) {
      passenger.setLastName(lastName);
      return this;
    }

    public final Passenger.PassengerBuilder<BLDRT> phoneNumber(
        final String phoneNumber) {
      passenger.setPhoneNumber(phoneNumber);
      return this;
    }

    public final Passenger.PassengerBuilder<BLDRT> ticketNumber(
        final String ticketNumber) {
      passenger.setTicketNumber(ticketNumber);
      return this;
    }

  }
}
