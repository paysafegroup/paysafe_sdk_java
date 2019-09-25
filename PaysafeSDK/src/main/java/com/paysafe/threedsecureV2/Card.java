package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.CardExpiry;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class Card.
 */
public class Card implements DomainObject {

	/** The payment token. */
	@Expose
	private String paymentToken;

	/** The holder Name. */
	@Expose
	private String holderName;

	/** The card num. */
	@Expose
	private String cardNum;

	/** The card Bin. */

	private String cardBin;

	/** The card expiry. */
	@Expose
	private CardExpiry cardExpiry;

	/** The type. */
	private Type type;

	/** The last digits. */
	private String lastDigits;

	/**
	 * Gets the payment token.
	 *
	 * @return the payment token
	 */
	public final String getPaymentToken() {
		return paymentToken;
	}

	/**
	 * Sets the payment token.
	 *
	 * @param paymentToken the new payment token
	 *            
	 */
	public final void setPaymentToken(final String paymentToken) {
		this.paymentToken = paymentToken;
	}

	/**
	 * Gets the card num.
	 *
	 * @return the card num
	 */
	public final String getCardNum() {
		return cardNum;
	}

	/**
	 * Sets the card num.
	 * 
	 * @param cardNum the new card num
	 *            
	 */
	public final void setCardNum(final String cardNum) {
		this.cardNum = cardNum;
	}

	/**
	 * Gets the card holderName.
	 *
	 * @return the holder Name
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * Sets the holderName.
	 *
	 * @param holderName the new holder Name
	 *            
	 */
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	/**
	 * Gets the cardBin.
	 *
	 * @return the cardBin
	 */
	public String getCardBin() {
		return cardBin;
	}

	/**
	 * Sets the cardBin.
	 *
	 * @param cardBin the new card Bin
	 *            
	 */
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	/**
	 * Gets the card expiry.
	 *
	 * @return the card expiry
	 */
	public final CardExpiry getCardExpiry() {
		return cardExpiry;
	}

	/**
	 * Sets the card expiry.
	 *
	 * @param cardExpiry
	 *            the new card expiry
	 */
	public final void setCardExpiry(final CardExpiry cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public final Type getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
	public final void setType(final Type type) {
		this.type = type;
	}

	/**
	 * Gets the last digits.
	 *
	 * @return the last digits
	 */
	public final String getLastDigits() {
		return lastDigits;
	}

	/**
	 * Sets the last digits.
	 *
	 * @param lastDigits
	 *            the new last digits
	 */
	public final void setLastDigits(final String lastDigits) {
		this.lastDigits = lastDigits;
	}

	/**
	 * The sub-builder class for Card.
	 *
	 * @param <BLDRT>
	 *            the parent builder
	 */
	public static class CardBuilder<BLDRT extends GenericBuilder> extends NestedBuilder<Card, BLDRT> {

		/** The card. */
		private final Card card = new Card();

		/** The card expiry builder. */
		private CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>> cardExpiryBuilder;

		/**
		 * Instantiates a new card builder.
		 *
		 * @param parent
		 *            the parent
		 */
		public CardBuilder(final BLDRT parent) {
			super(parent);
		}

		/**
		 * Build this card object.
		 *
		 * @return Card
		 */
		@Override
		public final Card build() {
			if (null != cardExpiryBuilder) {
				card.setCardExpiry(cardExpiryBuilder.build());
			}
			return card;
		}

		/**
		 * Build a cardExpiry within this card.
		 *
		 * @return CardExpiry.CardExpiryBuilder< CardBuilder< BLDRT > >
		 */
		public final CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>> cardExpiry() {
			if (null == cardExpiryBuilder) {
				cardExpiryBuilder = new CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>>(this);
			}
			return cardExpiryBuilder;
		}

		/**
		 * Set the paymentToken property.
		 *
		 * @param paymentToken
		 *            the payment token
		 * @return CardBuilder< BLDRT >
		 */
		public final CardBuilder<BLDRT> paymentToken(final String paymentToken) {
			card.setPaymentToken(paymentToken);
			return this;
		}

		/**
		 * Set the cardNum property.
		 *
		 * @param cardNum
		 *            the card num
		 * @return CardBuilder< BLDRT >
		 */
		public final CardBuilder<BLDRT> cardNum(final String cardNum) {
			card.setCardNum(cardNum);
			return this;
		}

		/**
		 * Set the holderName property.
		 *
		 * @param holderName
		 *            the holderName
		 * @return CardBuilder< BLDRT >
		 */
		public final CardBuilder<BLDRT> holderName(final String holderName) {
			card.setHolderName(holderName);
			return this;
		}
	}
}
