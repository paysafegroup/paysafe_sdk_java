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

import com.google.gson.annotations.Expose;

public class Passengers implements DomainObject {

  /**
   * Details for the first passenger.
   */
  @Expose
  private Passenger passenger1;

  /**
   * Details for the second passenger.
   */
  @Expose
  private Passenger passenger2;

  /**
   * Details for the third passenger.
   */
  @Expose
  private Passenger passenger3;

  /**
   * Details for the fourth passenger.
   */
  @Expose
  private Passenger passenger4;

  /**
   * Details for the fifth passenger.
   */
  @Expose
  private Passenger passenger5;

  /**
   * Details for the sixth passenger.
   */
  @Expose
  private Passenger passenger6;

  /**
   * Details for the seventh passenger.
   */
  @Expose
  private Passenger passenger7;

  /**
   * Details for the eight passenger.
   */
  @Expose
  private Passenger passenger8;

  /**
   * Details for the ninth passenger.
   */
  @Expose
  private Passenger passenger9;

  /**
   * Details for the tenth passenger.
   */
  @Expose
  private Passenger passenger10;

  public Passenger getPassenger1() {
    return passenger1;
  }

  public void setPassenger1(Passenger passenger1) {
    this.passenger1 = passenger1;
  }

  public Passenger getPassenger2() {
    return passenger2;
  }

  public void setPassenger2(Passenger passenger2) {
    this.passenger2 = passenger2;
  }

  public Passenger getPassenger3() {
    return passenger3;
  }

  public void setPassenger3(Passenger passenger3) {
    this.passenger3 = passenger3;
  }

  public Passenger getPassenger4() {
    return passenger4;
  }

  public void setPassenger4(Passenger passenger4) {
    this.passenger4 = passenger4;
  }

  public Passenger getPassenger5() {
    return passenger5;
  }

  public void setPassenger5(Passenger passenger5) {
    this.passenger5 = passenger5;
  }

  public Passenger getPassenger6() {
    return passenger6;
  }

  public void setPassenger6(Passenger passenger6) {
    this.passenger6 = passenger6;
  }

  public Passenger getPassenger7() {
    return passenger7;
  }

  public void setPassenger7(Passenger passenger7) {
    this.passenger7 = passenger7;
  }

  public Passenger getPassenger8() {
    return passenger8;
  }

  public void setPassenger8(Passenger passenger8) {
    this.passenger8 = passenger8;
  }

  public Passenger getPassenger9() {
    return passenger9;
  }

  public void setPassenger9(Passenger passenger9) {
    this.passenger9 = passenger9;
  }

  public Passenger getPassenger10() {
    return passenger10;
  }

  public void setPassenger10(Passenger passenger10) {
    this.passenger10 = passenger10;
  }
}
