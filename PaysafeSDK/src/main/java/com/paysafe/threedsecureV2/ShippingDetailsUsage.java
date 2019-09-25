package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class ShippingDetailsUsage.
 */
public class ShippingDetailsUsage implements DomainObject {

	/** The initial Usage Date. */
	@Expose
	private String initialUsageDate;

	/** The initial Usage Range. */
	@Expose
	private InitialUsageRange initialUsageRange;

	/** The card Holder Name Match. */
	@Expose
	private Boolean cardHolderNameMatch;

	/**
	 * Gets the initialUsageDate.
	 *
	 * @return the initialUsageDate
	 */
	public String getInitialUsageDate() {
		return initialUsageDate;
	}

	/**
	 * Sets the initialUsageDate.
	 *
	 * @param initialUsageDate the new initial Usage Date
	 *            
	 */
	public void setInitialUsageDate(String initialUsageDate) {
		this.initialUsageDate = initialUsageDate;
	}

	/**
	 * Gets the initialUsageRange.
	 *
	 * @return the initialUsageRange
	 */
	public InitialUsageRange getInitialUsageRange() {
		return initialUsageRange;
	}

	/**
	 * Sets the initialUsageRange.
	 *
	 * @param initialUsageRange the new initialUsageRange
	 *            
	 */
	public void setInitialUsageRange(InitialUsageRange initialUsageRange) {
		this.initialUsageRange = initialUsageRange;
	}

	/**
	 * Gets the cardHolderNameMatch.
	 *
	 * @return the card Holder Name Match
	 */
	public Boolean getCardHolderNameMatch() {
		return cardHolderNameMatch;
	}

	/**
	 * Sets the cardHolderNameMatch.
	 *
	 * @param cardHolderNameMatch the new cardHolderNameMatch
	 *           
	 */
	public void setCardHolderNameMatch(Boolean cardHolderNameMatch) {
		this.cardHolderNameMatch = cardHolderNameMatch;
	}

	/**
	 * The builder class for ShippingDetailsUsage.
	 */
	public static class ShippingDetailsUsageBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<ShippingDetailsUsage, BLDRT> {
		public ShippingDetailsUsageBuilder(final BLDRT parent) {
			super(parent);

		}

		private final ShippingDetailsUsage shippingDetailsUsage = new ShippingDetailsUsage();

		@Override
		public ShippingDetailsUsage build() {
			return shippingDetailsUsage;
		}

		/**
		 * Set the initialUsageDate property.
		 *
		 * @param initialUsageDate the initialUsageDate
		 *            
		 * @return ShippingDetailsUsageBuilder
		 */
		public final ShippingDetailsUsageBuilder<BLDRT> initialUsageDate(final String initialUsageDate) {
			shippingDetailsUsage.setInitialUsageDate(initialUsageDate);
			return this;
		}

		/**
		 * Set the initialUsageRange property.
		 *
		 * @param initialUsageRange the initialUsageRange
		 *            
		 * @return ShippingDetailsUsageBuilder
		 */
		public final ShippingDetailsUsageBuilder<BLDRT> initialUsageRange(final InitialUsageRange initialUsageRange) {
			shippingDetailsUsage.setInitialUsageRange(initialUsageRange);
			return this;
		}

		/**
		 * Set the cardHolderNameMatch property.
		 *
		 * @param cardHolderNameMatch the cardHolderNameMatch
		 *            
		 * @return ShippingDetailsUsageBuilder
		 */
		public final ShippingDetailsUsageBuilder<BLDRT> cardHolderNameMatch(final Boolean cardHolderNameMatch) {
			shippingDetailsUsage.setCardHolderNameMatch(cardHolderNameMatch);
			return this;
		}
	}
}
