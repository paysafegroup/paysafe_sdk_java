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

public class Flight implements DomainObject {

  /**
   * The standard abbreviation code indicating name of the operating carrier (United Airlines, Jet Blue, etc.).
   */
  @Expose
  private String carrierCode;

  /**
   * The full airline name.
   */
  @Expose
  private String airlineName;

  /**
   * The airline ICAO code.
   */
  @Expose
  private String airlineIcaoCode;

  /**
   * Number of the airline flight to be taken on Leg of the trip (excluding the carrier code).
   */
  @Expose
  private String flightNumber;

  /**
   * Retrieve the carrierCode.
   * @return the carrierCode
   */
  public String getCarrierCode() {
    return carrierCode;
  }

  /**
   * Set the carrierCode.
   * @param carrierCode - carrierCode to set
   */
  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  /**
   * Retrieve the airlineName.
   * @return the airlineName
   */
  public String getAirlineName() {
    return airlineName;
  }

  /**
   * Set the airlineName.
   * @param airlineName - airlineName to set
   */
  public void setAirlineName(String airlineName) {
    this.airlineName = airlineName;
  }

  /**
   * Retrieve the airlineIcaoCode.
   * @return the airlineIcaoCode
   */
  public String getAirlineIcaoCode() {
    return airlineIcaoCode;
  }

  /**
   * Set teh airlineIcaoCode.
   * @param airlineIcaoCode - airlineIcaoCode to set
   */
  public void setAirlineIcaoCode(String airlineIcaoCode) {
    this.airlineIcaoCode = airlineIcaoCode;
  }

  /**
   * Retrieve the flightNumber.
   * @return the flightNumber
   */
  public String getFlightNumber() {
    return flightNumber;
  }

  /**
   * Set the flightNumber.
   * @param flightNumber - flightNumber to set
   */
  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  /**
   * The sub-builder class for the Flight object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class FlightBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<Flight, BLDRT> {

    /**
     * The Flight object to be created
     */
    private final Flight flight = new Flight();

    /**
     * Creates a new FlightBuilder.
     * @param parent - the parent builder
     */
    public FlightBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this Flight object.
     *
     * @return the created Flight object
     */
    @Override
    public final Flight build() {
      return flight;
    }



    /**
     * Set the flightNumber to the current builder instance.
     * @param flightNumber - flightNumber to set
     * @return the currentBuilder
     */
    public final Flight.FlightBuilder<BLDRT> flightNumber(
        final String flightNumber) {
      flight.setFlightNumber(flightNumber);
      return this;
    }


    /**
     * Set the airlineIcaoCode to the current builder instance.
     * @param airlineIcaoCode - airlineIcaoCode to set
     * @return the currentBuilder
     */
    public final Flight.FlightBuilder<BLDRT> airlineIcaoCode(
        final String airlineIcaoCode) {
      flight.setAirlineIcaoCode(airlineIcaoCode);
      return this;
    }


    /**
     * Set the carrierCode to the current builder instance.
     * @param carrierCode - carrierCode to set
     * @return the currentBuilder
     */
    public final Flight.FlightBuilder<BLDRT> carrierCode(
        final String carrierCode) {
      flight.setCarrierCode(carrierCode);
      return this;
    }


    /**
     * Set the airlineName to the current builder instance.
     * @param airlineName - airlineName to set
     * @return the currentBuilder
     */
    public final Flight.FlightBuilder<BLDRT> airlineName(
        final String airlineName) {
      flight.setAirlineName(airlineName);
      return this;
    }
  }
}
