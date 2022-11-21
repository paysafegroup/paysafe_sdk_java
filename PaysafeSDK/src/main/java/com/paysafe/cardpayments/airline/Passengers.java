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

  /**
   * Retrieve the first passenger.
   * @return the first passenger
   */
  public Passenger getPassenger1() {
    return passenger1;
  }

  /**
   * Set the first passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger1(Passenger passenger) {
    this.passenger1 = passenger;
  }

  /**
   * Retrieve the second passenger.
   * @return the second passenger
   */
  public Passenger getPassenger2() {
    return passenger2;
  }

  /**
   * Set the second passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger2(Passenger passenger) {
    this.passenger2 = passenger;
  }

  /**
   * Retrieve the third passenger.
   * @return the third passenger
   */
  public Passenger getPassenger3() {
    return passenger3;
  }


  /**
   * Set the third passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger3(Passenger passenger) {
    this.passenger3 = passenger;
  }

  /**
   * Retrieve the fourth passenger.
   * @return the fourth passenger
   */
  public Passenger getPassenger4() {
    return passenger4;
  }

  /**
   * Set the fourth passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger4(Passenger passenger) {
    this.passenger4 = passenger;
  }

  /**
   * Retrieve the fifth passenger.
   * @return the fifth passenger
   */
  public Passenger getPassenger5() {
    return passenger5;
  }

  /**
   * Set the fifth passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger5(Passenger passenger) {
    this.passenger5 = passenger;
  }

  /**
   * Retrieve the sixth passenger.
   * @return the sixth passenger
   */
  public Passenger getPassenger6() {
    return passenger6;
  }

  /**
   * Set the sixth passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger6(Passenger passenger) {
    this.passenger6 = passenger;
  }

  /**
   * Retrieve the seventh passenger.
   * @return the seventh passenger
   */
  public Passenger getPassenger7() {
    return passenger7;
  }

  /**
   * Set the seventh passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger7(Passenger passenger) {
    this.passenger7 = passenger;
  }

  /**
   * Retrieve the eight passenger.
   * @return the eight passenger
   */
  public Passenger getPassenger8() {
    return passenger8;
  }

  /**
   * Set the eight passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger8(Passenger passenger) {
    this.passenger8 = passenger;
  }

  /**
   * Retrieve the ninth passenger.
   * @return the ninth passenger
   */
  public Passenger getPassenger9() {
    return passenger9;
  }

  /**
   * Set the ninth passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger9(Passenger passenger) {
    this.passenger9 = passenger;
  }

  /**
   * Retrieve the tenth passenger.
   * @return the tenth passenger
   */
  public Passenger getPassenger10() {
    return passenger10;
  }

  /**
   * Set the tenth passenger.
   * @param passenger - passenger to be set
   */
  public void setPassenger10(Passenger passenger) {
    this.passenger10 = passenger;
  }

  /**
   * The sub-builder class for the Passengers object.
   *
   * @param <BLDRT> the parent builder
   */
  public static class PassengersBuilder<BLDRT extends GenericBuilder>
      extends NestedBuilder<Passengers, BLDRT> {

    /**
     * The builder for the first passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger1Builder;

    /**
     * The builder for the second passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger2Builder;

    /**
     * The builder for the third passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger3Builder;

    /**
     * The builder for the fourth passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger4Builder;

    /**
     * The builder for the fifth passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger5Builder;

    /**
     * The builder for the sixth passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger6Builder;

    /**
     * The builder for the seventh passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger7Builder;

    /**
     * The builder for the eight passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger8Builder;

    /**
     * The builder for the ninth passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger9Builder;

    /**
     * The builder for the tenth passenger.
     */
    private Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger10Builder;

    /**
     * The passenger object to be built.
     */
    private final Passengers passengers = new Passengers();

    /**
     * Creates a new PassengersBuilder object.
     * @param parent - the parent builder
     */
    public PassengersBuilder(final BLDRT parent) {
      super(parent);
    }


    /**
     * Build this Passengers object.
     *
     * @return the created Passengers object
     */
    @Override
    public final Passengers build() {
      if (passenger1Builder != null) {
        passengers.setPassenger1(passenger1Builder.build());
      }
      if (passenger2Builder != null) {
        passengers.setPassenger2(passenger2Builder.build());
      }
      if (passenger3Builder != null) {
        passengers.setPassenger3(passenger3Builder.build());
      }
      if (passenger4Builder != null) {
        passengers.setPassenger4(passenger4Builder.build());
      }
      if (passenger5Builder != null) {
        passengers.setPassenger5(passenger5Builder.build());
      }
      if (passenger6Builder != null) {
        passengers.setPassenger6(passenger6Builder.build());
      }
      if (passenger7Builder != null) {
        passengers.setPassenger7(passenger7Builder.build());
      }
      if (passenger8Builder != null) {
        passengers.setPassenger8(passenger8Builder.build());
      }
      if (passenger9Builder != null) {
        passengers.setPassenger9(passenger9Builder.build());
      }
      if (passenger10Builder != null) {
        passengers.setPassenger10(passenger10Builder.build());
      }
      return passengers;
    }



    /**
     * Set the first passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger1(final Passenger passenger) {
      passengers.setPassenger1(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger1() {
      if (passenger1Builder == null) {
        passenger1Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger1Builder;
    }

    /**
     * Set the second passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger2(final Passenger passenger) {
      passengers.setPassenger2(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger2() {
      if (passenger2Builder == null) {
        passenger2Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger2Builder;
    }

    /**
     * Set the third passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger3(final Passenger passenger) {
      passengers.setPassenger3(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger3() {
      if (passenger3Builder == null) {
        passenger3Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger3Builder;
    }

    /**
     * Set the fourth passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger4(final Passenger passenger) {
      passengers.setPassenger4(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger4() {
      if (passenger4Builder == null) {
        passenger4Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger4Builder;
    }

    /**
     * Set the fifth passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger5(final Passenger passenger) {
      passengers.setPassenger5(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger5() {
      if (passenger5Builder == null) {
        passenger5Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger5Builder;
    }

    /**
     * Set the sixth passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger6(final Passenger passenger) {
      passengers.setPassenger6(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger6() {
      if (passenger6Builder == null) {
        passenger6Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger6Builder;
    }

    /**
     * Set the seventh passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger7(final Passenger passenger) {
      passengers.setPassenger7(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger7() {
      if (passenger7Builder == null) {
        passenger7Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger7Builder;
    }

    /**
     * Set the eight passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger8(final Passenger passenger) {
      passengers.setPassenger8(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger8() {
      if (passenger8Builder == null) {
        passenger8Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger8Builder;
    }

    /**
     * Set the ninth passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger9(final Passenger passenger) {
      passengers.setPassenger9(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger9() {
      if (passenger9Builder == null) {
        passenger9Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger9Builder;
    }

    /**
     * Set the tenth passenger to the current builder instance.
     * @param passenger - passenger to set
     * @return the currentBuilder
     */
    public final Passengers.PassengersBuilder<BLDRT> passenger10(final Passenger passenger) {
      passengers.setPassenger10(passenger);
      return this;
    }

    /**
     * Starts a new PassengerBuilder chain until the {@link NestedBuilder#done()} method is called.
     * @return the new PassengerBuilder
     */
    public final Passenger.PassengerBuilder<PassengersBuilder<BLDRT>> passenger10() {
      if (passenger10Builder == null) {
        passenger10Builder = new Passenger.PassengerBuilder<>(this);
      }
      return passenger10Builder;
    }

  }
}
