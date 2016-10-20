/*
 * Copyright (c) 2014 Optimal Payments
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
package com.paysafe.common;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;


// TODO: Auto-generated Javadoc
/**
 * The Class AddressDetails.
 */
public class AddressDetails implements DomainObject {

  /** The street. */
  @Expose
  protected String street = null;
  
  /** The street2. */
  @Expose
  protected String street2 = null;
  
  /** The city. */
  @Expose
  protected String city = null;
  
  /** The state. */
  @Expose
  protected String state = null;
  
  /** The country. */
  @Expose
  protected String country = null;
  
  /** The zip. */
  @Expose
  protected String zip = null;
  
  /** The phone. */
  @Expose
  protected String phone = null;

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
  public final String getCountry() {
    return country;
  }

  /**
   * Sets the country.
   *
   * @param country the new country
   */
  public final void setCountry(final String country) {
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
   * Gets the phone.
   *
   * @return the phone
   */
  public final String getPhone() {
    return phone;
  }

  /**
   * Sets the phone.
   *
   * @param phone the new phone
   */
  public final void setPhone(final String phone) {
    this.phone = phone;
  }
}
