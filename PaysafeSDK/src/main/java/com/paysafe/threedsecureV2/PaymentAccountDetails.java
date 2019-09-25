package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class PaymentAccountDetails.
 */
public class PaymentAccountDetails implements DomainObject {

	/** The created Date. */
	@Expose
	private String createdDate;

	/** The created Range. */
	@Expose
	private CreatedRange createdRange;

	/**
	 * Gets the createdDate.
	 *
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the createdDate.
	 *
	 * @param createdDate the new createdDate
	 *            
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the createdRange.
	 *
	 * @return the createdRange
	 */
	public CreatedRange getCreatedRange() {
		return createdRange;
	}

	/**
	 * Sets the createdRange.
	 *
	 * @param createdRange the new createdRange
	 *            
	 */
	public void setCreatedRange(CreatedRange createdRange) {
		this.createdRange = createdRange;
	}

	/**
	 * The builder class for Payment Account Details.
	 */
	public static class PaymentAccountDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<PaymentAccountDetails, BLDRT> {

		private final PaymentAccountDetails paymentAccountDetails = new PaymentAccountDetails();

		public PaymentAccountDetailsBuilder(final BLDRT parent) {
			super(parent);

		}

		@Override
		public PaymentAccountDetails build() {
			// TODO Auto-generated method stub
			return paymentAccountDetails;
		}

		/**
		 * Set the createdDate property.
		 * 
		 * @param createdDate the createdDate
		 *           
		 * @return paymentAccountDetails
		 */
		public final PaymentAccountDetailsBuilder<BLDRT> createdDate(final String createdDate) {
			paymentAccountDetails.setCreatedDate(createdDate);
			return this;
		}

		/**
		 * Set the createdRange property.
		 *
		 * @param createdRange the createdRange
		 *            
		 * @return paymentAccountDetails
		 */
		public final PaymentAccountDetailsBuilder<BLDRT> createdRange(final CreatedRange createdRange) {
			paymentAccountDetails.setCreatedRange(createdRange);
			return this;
		}
	}
}
