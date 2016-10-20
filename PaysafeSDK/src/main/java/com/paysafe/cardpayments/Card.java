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
import com.paysafe.common.CardExpiry;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Card.
 */
public class Card implements DomainObject {

  /** The payment token. */
  @Expose
  private String paymentToken;
  
  /** The card num. */
  @Expose
  private String cardNum;
  
  /** The type. */
  @Expose
  private String type;
  
  /** The last digits. */
  @Expose
  private String lastDigits;
  
  /** The card expiry. */
  @Expose
  private CardExpiry cardExpiry;
  
  /** The cvv. */
  @Expose
  private String cvv;
  
  /** The track1. */
  @Expose
  private String track1;
  
  /** The track2. */
  @Expose
  private String track2;

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
   */
  public final void setCardNum(final String cardNum) {
    this.cardNum = cardNum;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public final String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public final void setType(final String type) {
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
   * @param lastDigits the new last digits
   */
  public final void setLastDigits(final String lastDigits) {
    this.lastDigits = lastDigits;
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
   * @param cardExpiry the new card expiry
   */
  public final void setCardExpiry(final CardExpiry cardExpiry) {
    this.cardExpiry = cardExpiry;
  }

  /**
   * Gets the cvv.
   *
   * @return the cvv
   */
  public final String getCvv() {
    return cvv;
  }

  /**
   * Sets the cvv.
   *
   * @param cvv the new cvv
   */
  public final void setCvv(final String cvv) {
    this.cvv = cvv;
  }

  /**
   * Gets the track1.
   *
   * @return the track1
   */
  public final String getTrack1() {
    return track1;
  }

  /**
   * Sets the track1.
   *
   * @param track1 the new track1
   */
  public final void setTrack1(final String track1) {
    this.track1 = track1;
  }

  /**
   * Gets the track2.
   *
   * @return the track2
   */
  public final String getTrack2() {
    return track2;
  }

  /**
   * Sets the track2.
   *
   * @param track2 the new track2
   */
  public final void setTrack2(final String track2) {
    this.track2 = track2;
  }

  /**
   * The sub-builder class for Card.
   *
   * @param <BLDRT> the parent builder
   */
  public static class CardBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<Card, BLDRT> {

    /** The card. */
    private final Card card = new Card();
    
    /** The card expiry builder. */
    private CardExpiry.CardExpiryBuilder<CardBuilder<BLDRT>> cardExpiryBuilder;

    /**
     * Instantiates a new card builder.
     *
     * @param parent the parent
     */
    public CardBuilder(final BLDRT parent) {
      super(parent);
    }
    
    /**
     * Instantiate builder with a customer vault card.
     *
     * @param parent the parent
     * @param c the c
     */
    public CardBuilder(final BLDRT parent, com.paysafe.customervault.Card c) {
      super(parent);
      card.setCardExpiry(c.getCardExpiry());
      card.setCardNum(c.getCardNum());
      card.setType(c.getCardType());
      card.setLastDigits(c.getLastDigits());
      card.setPaymentToken(c.getPaymentToken());
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
     * Set the paymentToken property.
     *
     * @param paymentToken the payment token
     * @return CardBuilder< BLDRT >
     */
    public final CardBuilder<BLDRT> paymentToken(final String paymentToken) {
      card.setPaymentToken(paymentToken);
      return this;
    }

    /**
     * Set the cardNum property.
     *
     * @param cardNum the card num
     * @return CardBuilder< BLDRT >
     */
    public final CardBuilder<BLDRT> cardNum(final String cardNum) {
      card.setCardNum(cardNum);
      return this;
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
     * Set the cvv property.
     *
     * @param cvv the cvv
     * @return CardBuilder< BLDRT >
     */
    public final CardBuilder<BLDRT> cvv(final String cvv) {
      card.setCvv(cvv);
      return this;
    }
  }
}
