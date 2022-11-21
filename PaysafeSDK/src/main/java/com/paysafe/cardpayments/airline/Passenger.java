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
   * Retrieve the firstName.
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set the firstName.
   * @param firstName - firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Retrieve the lastName.
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Set the lastName.
   * @param lastName - lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Retrieve the phoneNumber.
   * @return the phoneNumber
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Set the phoneNumber.
   * @param phoneNumber - the phoneNumber
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Retrieve the passengerCode.
   * @return the passengerCode
   */
  public String getPassengerCode() {
    return passengerCode;
  }

  /**
   * Set the passengerCode.
   * @param passengerCode - the passengerCode to set
   */
  public void setPassengerCode(String passengerCode) {
    this.passengerCode = passengerCode;
  }

  /**
   * Retrieve the gender.
   * @return the gender
   */
  public Gender getGender() {
    return gender;
  }

  /**
   * Set the gender.
   * @param gender - gender to set
   */
  public void setGender(Gender gender) {
    this.gender = gender;
  }

  /**
   * The sub-builder class for the Passenger object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class PassengerBuilder<
      BLDRT extends GenericBuilder> extends
      NestedBuilder<Passenger, BLDRT> {

    /**
     * The Passenger object to be created.
     */
    private final Passenger passenger = new Passenger();

    /**
     * Creates a new PassengerBuilder.
     * @param parent the parent builder
     */
    public PassengerBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this Passenger instance.
     * @return the created Passenger object
     */
    @Override
    public final Passenger build() {
      return passenger;
    }


    /**
     * Set the passengerCode to the current builder instance.
     * @param passengerCode - passengerCode to set
     * @return the currentBuilder
     */
    public final Passenger.PassengerBuilder<BLDRT> passengerCode(
        final String passengerCode) {
      passenger.setPassengerCode(passengerCode);
      return this;
    }


    /**
     * Set the gender to the current builder instance.
     * @param gender - gender to set
     * @return the currentBuilder
     */
    public final Passenger.PassengerBuilder<BLDRT> gender(
        final Gender gender) {
      passenger.setGender(gender);
      return this;
    }


    /**
     * Set the firstName to the current builder instance.
     * @param firstName - firstName to set
     * @return the currentBuilder
     */
    public final Passenger.PassengerBuilder<BLDRT> firstName(
        final String firstName) {
      passenger.setFirstName(firstName);
      return this;
    }


    /**
     * Set the lastName to the current builder instance.
     * @param lastName - lastName to set
     * @return the currentBuilder
     */
    public final Passenger.PassengerBuilder<BLDRT> lastName(
        final String lastName) {
      passenger.setLastName(lastName);
      return this;
    }


    /**
     * Set the phoneNumber to the current builder instance.
     * @param phoneNumber - phoneNumber to set
     * @return the currentBuilder
     */
    public final Passenger.PassengerBuilder<BLDRT> phoneNumber(
        final String phoneNumber) {
      passenger.setPhoneNumber(phoneNumber);
      return this;
    }


    /**
     * Set the ticketNumber to the current builder instance.
     * @param ticketNumber - ticketNumber to set
     * @return the currentBuilder
     */
    public final Passenger.PassengerBuilder<BLDRT> ticketNumber(
        final String ticketNumber) {
      passenger.setTicketNumber(ticketNumber);
      return this;
    }

  }
}
