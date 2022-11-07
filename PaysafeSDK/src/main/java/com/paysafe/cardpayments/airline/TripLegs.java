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

public class TripLegs implements DomainObject {

  /**
   * Description of first leg of trip.
   */
  @Expose
  private TripLeg tripLeg1;

  /**
   * Description of second leg of trip.
   */
  @Expose
  private TripLeg tripLeg2;

  /**
   * Description of third leg of trip.
   */
  @Expose
  private TripLeg tripLeg3;

  /**
   * Description of fourth leg of trip.
   */
  @Expose
  private TripLeg tripLeg4;

  public TripLeg getTripLeg1() {
    return tripLeg1;
  }

  public void setTripLeg1(TripLeg tripLeg1) {
    this.tripLeg1 = tripLeg1;
  }

  public TripLeg getTripLeg2() {
    return tripLeg2;
  }

  public void setTripLeg2(TripLeg tripLeg2) {
    this.tripLeg2 = tripLeg2;
  }

  public TripLeg getTripLeg3() {
    return tripLeg3;
  }

  public void setTripLeg3(TripLeg tripLeg3) {
    this.tripLeg3 = tripLeg3;
  }

  public TripLeg getTripLeg4() {
    return tripLeg4;
  }

  public void setTripLeg4(TripLeg tripLeg4) {
    this.tripLeg4 = tripLeg4;
  }
}
