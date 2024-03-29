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

public class TripLegs implements DomainObject {

  /**
   * Description of first leg of trip.
   */
  @Expose
  private TripLeg leg1;

  /**
   * Description of second leg of trip.
   */
  @Expose
  private TripLeg leg2;

  /**
   * Description of third leg of trip.
   */
  @Expose
  private TripLeg leg3;

  /**
   * Description of fourth leg of trip.
   */
  @Expose
  private TripLeg leg4;

  /**
   * Retrieve the first tripLeg
   * @return the first tripLeg
   */
  public TripLeg getLeg1() {
    return leg1;
  }

  /**
   * Set the first tripLeg
   * @param tripLeg - tripLeg to set
   */
  public void setLeg1(TripLeg tripLeg) {
    this.leg1 = tripLeg;
  }

  /**
   * Retrieve the second tripLeg
   * @return the second tripLeg
   */
  public TripLeg getLeg2() {
    return leg2;
  }


  /**
   * Set the second tripLeg
   * @param tripLeg - tripLeg to set
   */
  public void setLeg2(TripLeg tripLeg) {
    this.leg2 = tripLeg;
  }

  /**
   * Retrieve the third tripLeg
   * @return the third tripLeg
   */
  public TripLeg getLeg3() {
    return leg3;
  }


  /**
   * Set the second tripLeg
   * @param tripLeg - tripLeg to set
   */
  public void setLeg3(TripLeg tripLeg) {
    this.leg3 = tripLeg;
  }

  /**
   * Retrieve the fourth tripLeg
   * @return the fourth tripLeg
   */
  public TripLeg getLeg4() {
    return leg4;
  }


  /**
   * Set the second tripLeg
   * @param tripLeg - tripLeg to set
   */
  public void setLeg4(TripLeg tripLeg) {
    this.leg4 = tripLeg;
  }

  public static class TripLegsBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<TripLegs, BLDRT> {

    /**
     * The builder for the first tripLeg.
     */
    private TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> tripLeg1Builder;

    /**
     * The builder for the second tripLeg.
     */
    private TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> tripLeg2Builder;

    /**
     * The builder for the third tripLeg.
     */
    private TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> tripLeg3Builder;

    /**
     * The builder for the fourth tripLeg.
     */
    private TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> tripLeg4Builder;

    /**
     * The tripLegs object to be built.
     */
    private final TripLegs tripLegs = new TripLegs();

    /**
     * Creates a new TripLegsBuilder object.
     * @param parent - the parent builder
     */
    public TripLegsBuilder(final BLDRT parent) {
      super(parent);
    }


    /**
     * Build this TripLegs object.
     *
     * @return the created TripLegs object
     */
    @Override
    public final TripLegs build() {
      if (tripLeg1Builder != null) {
        tripLegs.setLeg1(tripLeg1Builder.build());
      }
      if (tripLeg2Builder != null) {
        tripLegs.setLeg2(tripLeg2Builder.build());
      }
      if (tripLeg3Builder != null) {
        tripLegs.setLeg3(tripLeg3Builder.build());
      }
      if (tripLeg4Builder != null) {
        tripLegs.setLeg4(tripLeg4Builder.build());
      }
      return tripLegs;
    }


    /**
     * Set the tripLeg1 to the current builder instance.
     * @param tripLeg - tripLeg1 to set
     * @return the currentBuilder
     */
    public final TripLegs.TripLegsBuilder<BLDRT> leg1(final TripLeg tripLeg) {
      tripLegs.setLeg1(tripLeg);
      return this;
    }

    /**
     * Starts a new TripLegBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TripLegBuilder
     */
    public final TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> leg1() {
      if (tripLeg1Builder == null) {
        tripLeg1Builder = new TripLeg.TripLegBuilder<>(this);
      }
      return tripLeg1Builder;
    }

    /**
     * Set the tripLeg2 to the current builder instance.
     * @param tripLeg - tripLeg2 to set
     * @return the currentBuilder
     */
    public final TripLegs.TripLegsBuilder<BLDRT> leg2(final TripLeg tripLeg) {
      tripLegs.setLeg2(tripLeg);
      return this;
    }

    /**
     * Starts a new TripLegBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TripLegBuilder
     */
    public final TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> leg2() {
      if (tripLeg2Builder == null) {
        tripLeg2Builder = new TripLeg.TripLegBuilder<>(this);
      }
      return tripLeg2Builder;
    }

    /**
     * Set the tripLeg3 to the current builder instance.
     * @param tripLeg - tripLeg3 to set
     * @return the currentBuilder
     */
    public final TripLegs.TripLegsBuilder<BLDRT> leg3(final TripLeg tripLeg) {
      tripLegs.setLeg3(tripLeg);
      return this;
    }

    /**
     * Starts a new TripLegBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TripLegBuilder
     */
    public final TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> leg3() {
      if (tripLeg3Builder == null) {
        tripLeg3Builder = new TripLeg.TripLegBuilder<>(this);
      }
      return tripLeg3Builder;
    }

    /**
     * Set the tripLeg4 to the current builder instance.
     * @param tripLeg - tripLeg4 to set
     * @return the currentBuilder
     */
    public final TripLegs.TripLegsBuilder<BLDRT> leg4(final TripLeg tripLeg) {
      tripLegs.setLeg4(tripLeg);
      return this;
    }

    /**
     * Starts a new TripLegBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new TripLegBuilder
     */
    public final TripLeg.TripLegBuilder<TripLegsBuilder<BLDRT>> leg4() {
      if (tripLeg4Builder == null) {
        tripLeg4Builder = new TripLeg.TripLegBuilder<>(this);
      }
      return tripLeg4Builder;
    }

  }
}
