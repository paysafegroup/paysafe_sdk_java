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
package com.paysafe.cardpayments;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class AccordD.
 */
public class AccordD implements DomainObject {

  /** The financing type. */
  @Expose
  private FinancingType financingType;
  
  /** The plan. */
  @Expose
  private String plan;
  
  /** The grace period. */
  @Expose
  private Integer gracePeriod;
  
  /** The term. */
  @Expose
  private Integer term;
  
  /**
   * Gets the financing type.
   *
   * @return the financing type
   */
  public final FinancingType getFinancingType() {
    return financingType;
  }

  /**
   * Sets the financing type.
   *
   * @param financingType the new financing type
   */
  public final void setFinancingType(final FinancingType financingType) {
    this.financingType = financingType;
  }

  /**
   * Gets the plan.
   *
   * @return the plan
   */
  public final String getPlan() {
    return plan;
  }

  /**
   * Sets the plan.
   *
   * @param plan the new plan
   */
  public final void setPlan(final String plan) {
    this.plan = plan;
  }

  /**
   * Gets the grace period.
   *
   * @return the grace period
   */
  public final Integer getGracePeriod() {
    return gracePeriod;
  }

  /**
   * Sets the grace period.
   *
   * @param gracePeriod the new grace period
   */
  public final void setGracePeriod(final Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  /**
   * Gets the term.
   *
   * @return the term
   */
  public final Integer getTerm() {
    return term;
  }

  /**
   * Sets the term.
   *
   * @param term the new term
   */
  public final void setTerm(final Integer term) {
    this.term = term;
  }

  /**
   * The sub-builder class for AccordD.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AccordDBuilder<BLDRT extends GenericBuilder>
          extends NestedBuilder<AccordD, BLDRT> {

    /** The accord d. */
    private final AccordD accordD = new AccordD();

    /**
     * Instantiates a new accord d builder.
     *
     * @param parent the parent
     */
    public AccordDBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this accordD object.
     *
     * @return AccordD
     */
    @Override
    public final AccordD build() {
      return accordD;
    }

    /**
     * Set the financingType property.
     *
     * @param financingType the financing type
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> financingType(final FinancingType financingType) {
      accordD.setFinancingType(financingType);
      return this;
    }

    /**
     * Set the plan property.
     *
     * @param plan the plan
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> plan(
            final String plan) {
      accordD.setPlan(plan);
      return this;
    }

    /**
     * Set the gracePeriod property.
     *
     * @param gracePeriod the grace period
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> gracePeriod(final Integer gracePeriod) {
      accordD.setGracePeriod(gracePeriod);
      return this;
    }

    /**
     * Set the term property.
     *
     * @param term the term
     * @return AccordDBuilder< BLDRT >
     */
    public final AccordDBuilder<BLDRT> term(final Integer term) {
      accordD.setTerm(term);
      return this;
    }
  }
}
