package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class BillingCycle.
 */
public class BillingCycle implements DomainObject {

	/** The endDate. */
	@Expose
	private String endDate;

	/** The frequency. */
	@Expose
	private Integer frequency;

	/**
	 * Gets the endDate.
	 *
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Sets the endDate.
	 *
	 * @param endDate the new endDate
	 *            
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the frequency.
	 *
	 * @return the frequency
	 */
	public Integer getFrequency() {
		return frequency;
	}

	/**
	 * Sets the frequency.
	 *
	 * @param frequency the new frequency
	 *            
	 */
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	/**
	 * The builder class for BillingCycle.
	 */
	public static class BillingCycleBuilder<BLDRT extends GenericBuilder> extends NestedBuilder<BillingCycle, BLDRT> {

		public BillingCycleBuilder(final BLDRT parent) {
			super(parent);
		}

		private final BillingCycle billingCycle = new BillingCycle();

		@Override
		public BillingCycle build() {
			return billingCycle;
		}

		/**
		 * Set the endDate property.
		 *
		 * @param endDate the endDate
		 *            
		 * @return BillingCycleBuilder
		 */
		public final BillingCycleBuilder<BLDRT> endDate(final String endDate) {
			billingCycle.setEndDate(endDate);
			return this;
		}

		/**
		 * Set the frequency property.
		 *
		 * @param frequency the frequency
		 *            
		 * @return BillingCycleBuilder
		 */
		public final BillingCycleBuilder<BLDRT> frequency(final Integer frequency) {
			billingCycle.setFrequency(frequency);
			return this;
		}
	}
}