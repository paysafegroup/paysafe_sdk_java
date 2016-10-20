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
package com.paysafe.customervault;

import com.google.gson.annotations.Expose;
import com.paysafe.common.CardExpiry;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Card.
 * @author manisha.rani  
 * @since
 * 25-02-2016. 
 */
public class Card implements BaseDomainObject {

  /** The id. */
  private Id<Card> id;
  
  /** The nick name. */
  @Expose
  private String nickName;
  
  /** The status. */
  @Expose
  private Status status;
  
  /** The merchant ref num. */
  @Expose
  private String merchantRefNum;
  
  /** The holder name. */
  @Expose
  private String holderName;
  
  /** The card num. */
  @Expose
  private String cardNum;
  
  /** The card bin. */
  private String cardBin;
  
  /** The last digits. */
  private String lastDigits;
  
  /** The card expiry. */
  @Expose
  private CardExpiry cardExpiry;
  
  /** The card type. */
  private String cardType;
  
  /** The billing address id. */
  @Expose
  private Id<Address> billingAddressId;
  
  /** The default card indicator. */
  private Boolean defaultCardIndicator;
  
  /** The payment token. */
  @Expose
  private String paymentToken;
  
  /** The single use token. */
  @Expose
  private String singleUseToken;
  
  /** The error. */
  private Error error;
  
  /** The profile id. */
  @Expose
  private Id<Profile> profileId;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Card> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Card> id) {
    this.id = id;
  }

  /**
   * Gets the nick name.
   *
   * @return the nick name
   */
  public final String getNickName() {
    return nickName;
  }

  /**
   * Sets the nick name.
   *
   * @param nickName the new nick name
   */
  public final void setNickName(final String nickName) {
    this.nickName = nickName;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public final Status getStatus() {
    return status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public final void setStatus(final Status status) {
    this.status = status;
  }

  /**
   * Gets the merchant ref num.
   *
   * @return the merchant ref num
   */
  public final String getMerchantRefNum() {
    return merchantRefNum;
  }

  /**
   * Sets the merchant ref num.
   *
   * @param merchantRefNum the new merchant ref num
   */
  public final void setMerchantRefNum(final String merchantRefNum) {
    this.merchantRefNum = merchantRefNum;
  }

  /**
   * Gets the holder name.
   *
   * @return the holder name
   */
  public final String getHolderName() {
    return holderName;
  }

  /**
   * Sets the holder name.
   *
   * @param holderName the new holder name
   */
  public final void setHolderName(final String holderName) {
    this.holderName = holderName;
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
   * Gets the card bin.
   *
   * @return the card bin
   */
  public final String getCardBin() {
    return cardBin;
  }

  /**
   * Sets the card bin.
   *
   * @param cardBin the new card bin
   */
  public final void setCardBin(final String cardBin) {
    this.cardBin = cardBin;
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
   * Gets the card type.
   *
   * @return the card type
   */
  public final String getCardType() {
    return cardType;
  }

  /**
   * Sets the card type.
   *
   * @param cardType the new card type
   */
  public final void setCardType(final String cardType) {
    this.cardType = cardType;
  }

  /**
   * Gets the billing address id.
   *
   * @return the billing address id
   */
  public final Id<Address> getBillingAddressId() {
    return billingAddressId;
  }

  /**
   * Sets the billing address id.
   *
   * @param billingAddressId the new billing address id
   */
  public final void setBillingAddressId(final Id<Address> billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  /**
   * Gets the default card indicator.
   *
   * @return the default card indicator
   */
  public final Boolean getDefaultCardIndicator() {
    return defaultCardIndicator;
  }

  /**
   * Sets the default card indicator.
   *
   * @param defaultCardIndicator the new default card indicator
   */
  public final void setDefaultCardIndicator(final Boolean defaultCardIndicator) {
    this.defaultCardIndicator = defaultCardIndicator;
  }

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
   * Gets the single use token.
   *
   * @return the single use token
   */
  public final String getSingleUseToken() {
    return singleUseToken;
  }

  /**
   * Sets the single use token.
   *
   * @param singleUseToken the new single use token
   */
  public final void setSingleUseToken(final String singleUseToken) {
    this.singleUseToken = singleUseToken;
  }

  /* (non-Javadoc)
   * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
   */
  @Override
  public final Error getError() {
    return error;
  }

  /**
   * Sets the error.
   *
   * @param error the new error
   */
  public final void setError(final Error error) {
    this.error = error;
  }

  /**
   * Gets the profile id.
   *
   * @return the profile id
   */
  public final Id<Profile> getProfileId() {
    return profileId;
  }

  /**
   * Sets the profile id.
   *
   * @param profileId the new profile id
   */
  public final void setProfileId(final Id<Profile> profileId) {
    this.profileId = profileId;
  }

  /**
   * Get a card builder.
   *
   * @return CardBuilder
   */
  public static final CardBuilder builder() {
    return new CardBuilder();
  }

  /**
   * The builder class for Card.
   */
  public static class CardBuilder extends BaseBuilder<Card> {

    /** The card. */
    private final Card card = new Card();
    
    /** The card expiry builder. */
    private CardExpiry.CardExpiryBuilder<CardBuilder> cardExpiryBuilder;

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
     * Set the id property.
     *
     * @param id the id
     * @return CardBuilder
     */
    
    public final CardBuilder id(final Id<Card> id) {
      card.setId(id);
      return this;
    }

    /**
     * Set the nickName property.
     *
     * @param nickName the nick name
     * @return CardBuilder
     */
    public final CardBuilder nickName(final String nickName) {
      card.setNickName(nickName);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant ref num
     * @return CardBuilder
     */
    public final CardBuilder merchantRefNum(final String merchantRefNum) {
      card.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the holderName property.
     *
     * @param holderName the holder name
     * @return CardBuilder
     */
    public final CardBuilder holderName(final String holderName) {
      card.setHolderName(holderName);
      return this;
    }

    /**
     * Set the cardNum property.
     *
     * @param cardNum the card num
     * @return CardBuilder
     */
    public final CardBuilder cardNum(final String cardNum) {
      card.setCardNum(cardNum);
      return this;
    }

    /**
     * Build a cardExpiry within this card.
     *
     * @return CardExpiry.CardExpiryBuilder< CardBuilder >
     */
    public final CardExpiry.CardExpiryBuilder<CardBuilder> cardExpiry() {
      if (null == cardExpiryBuilder) {
        cardExpiryBuilder = new CardExpiry.CardExpiryBuilder<CardBuilder>(this);
      }
      return cardExpiryBuilder;
    }
    
    /**
     * Set the billingAddressId property.
     *
     * @param billingAddressId the billing address id
     * @return CardBuilder
     */

    public final CardBuilder billingAddressId(final Id<Address> billingAddressId) {
      card.setBillingAddressId(billingAddressId);
      return this;
    }
    
    /**
     * Set the profileId property.
     *
     * @param profileId the profile id
     * @return CardBuilder
     */

    public final CardBuilder profileId(final Id<Profile> profileId) {
      card.setProfileId(profileId);
      return this;
    }
  }

  /**
   * The builder class for Card.
   *
   * @param <BLDRT> the generic type
   */
  public static class CardBuilderSingleUse<BLDRT extends GenericBuilder> extends
          NestedBuilder<Card, BLDRT> {

    /** The card. */
    private final Card card = new Card();

    /**
     * Instantiates a new card builder single use.
     *
     * @param parent the parent
     */
    public CardBuilderSingleUse(BLDRT parent) {
      super(parent);
    }

    /* (non-Javadoc)
     * @see com.optimalpayments.common.impl.BaseBuilder#build()
     */
    @Override
    public Card build() {
      return card;
    }

    /**
     * Single use token.
     *
     * @param singleUseToken the single use token
     * @return CardBuilderSingleUse
     */
    public final CardBuilderSingleUse<BLDRT> singleUseToken(final String singleUseToken) {
      card.setSingleUseToken(singleUseToken);
      return this;
    }

  }
}