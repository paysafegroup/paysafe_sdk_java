package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class PurchasedGiftCardDetails.
 */
public class PurchasedGiftCardDetails implements DomainObject {

	/** This is the amount of the giftcard. */
	@Expose
	private Long amount;

	/** Total count of individual gift cards. */
	@Expose
	private Integer count;

	/** This is the currency of the gift card. */
	@Expose
	private String currency;

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 *            
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Sets the count.
	 *
	 * @param count the new count
	 *            
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency the new currency
	 *            
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * The builder class for PurchasedGiftCardDetails.
	 */
	public static class PurchasedGiftCardDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<PurchasedGiftCardDetails, BLDRT> {
		public PurchasedGiftCardDetailsBuilder(final BLDRT parent) {
			super(parent);
		}

		private final PurchasedGiftCardDetails purchasedGiftCardDetails = new PurchasedGiftCardDetails();

		@Override
		public PurchasedGiftCardDetails build() {
			return purchasedGiftCardDetails;
		}

		/**
		 * Set the amount property.
		 *
		 * @param amount  the amount
		 *           
		 * @return PurchasedGiftCardDetailsBuilder
		 */
		public final PurchasedGiftCardDetailsBuilder<BLDRT> amount(final Long amount) {
			purchasedGiftCardDetails.setAmount(amount);
			return this;
		}

		/**
		 * Set the count property.
		 *
		 * @param count the count
		 *            
		 * @return PurchasedGiftCardDetailsBuilder
		 */
		public final PurchasedGiftCardDetailsBuilder<BLDRT> count(final Integer count) {
			purchasedGiftCardDetails.setCount(count);
			return this;
		}

		/**
		 * Set the currency property.
		 *
		 * @param currency the currency
		 *            
		 * @return PurchasedGiftCardDetailsBuilder
		 */
		public final PurchasedGiftCardDetailsBuilder<BLDRT> currency(final String currency) {
			purchasedGiftCardDetails.setCurrency(currency);
			return this;
		}
	}
}
