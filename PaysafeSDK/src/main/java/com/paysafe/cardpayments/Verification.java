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

import java.util.ArrayList;

import com.paysafe.cardpayments.Authorization.AuthorizationBuilder;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.Link;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Verification.
 */
public class Verification implements BaseDomainObject {

  /** The id. */
  private Id<Verification> id;
  
  /** The merchant ref num. */
  @Expose
  private String merchantRefNum;
  
  /** The child account num. */
  private String childAccountNum;
  
  /** The card. */
  @Expose
  private Card card;
  
  /** The auth code. */
  private String authCode;
  
  /** The profile. */
  @Expose
  private Profile profile;
  
  /** The billing details. */
  @Expose
  private BillingDetails billingDetails;
  
  /** The customer ip. */
  @Expose
  private String customerIp;
  
  /** The dup check. */
  @Expose
  private Boolean dupCheck;
  
  /** The merchant descriptor. */
  private MerchantDescriptor merchantDescriptor;
  
  /** The description. */
  @Expose
  private String description;
  
  /** The master pass. */
  private MasterPass masterPass;
  
  /** The txn time. */
  private String txnTime;
  
  /** The currency code. */
  private String currencyCode;
  
  /** The avs response. */
  private AvsResponse avsResponse;
  
  /** The cvv verification. */
  private CvvVerification cvvVerification;
  
  /** The status. */
  private Status status;
  
  /** The risk reason code. */
  private ArrayList<Integer> riskReasonCode;
  
  /** The acquirer response. */
  private AcquirerResponse acquirerResponse;
  
  /** The error. */
  private Error error;
  
  /** The links. */
  private ArrayList<Link> links;
  
  /**The StoredCredential. */
  @Expose
  private StoredCredential storedCredential;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Verification> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Verification> id) {
    this.id = id;
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
   * Gets the child account num.
   *
   * @return the child account num
   */
  public final String getChildAccountNum() {
    return childAccountNum;
  }

  /**
   * Sets the child account num.
   *
   * @param childAccountNum the new child account num
   */
  public final void setChildAccountNum(final String childAccountNum) {
    this.childAccountNum = childAccountNum;
  }

  /**
   * Gets the card.
   *
   * @return the card
   */
  public final Card getCard() {
    return card;
  }

  /**
   * Sets the card.
   *
   * @param card the new card
   */
  public final void setCard(final Card card) {
    this.card = card;
  }

  /**
   * Gets the auth code.
   *
   * @return the auth code
   */
  public final String getAuthCode() {
    return authCode;
  }

  /**
   * Sets the auth code.
   *
   * @param authCode the new auth code
   */
  public final void setAuthCode(final String authCode) {
    this.authCode = authCode;
  }

  /**
   * Gets the profile.
   *
   * @return the profile
   */
  public final Profile getProfile() {
    return profile;
  }

  /**
   * Sets the profile.
   *
   * @param profile the new profile
   */
  public final void setProfile(final Profile profile) {
    this.profile = profile;
  }

  /**
   * Gets the billing details.
   *
   * @return the billing details
   */
  public final BillingDetails getBillingDetails() {
    return billingDetails;
  }

  /**
   * Sets the billing details.
   *
   * @param billingDetails the new billing details
   */
  public final void setBillingDetails(final BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }

  /**
   * Gets the customer ip.
   *
   * @return the customer ip
   */
  public final String getCustomerIp() {
    return customerIp;
  }

  /**
   * Sets the customer ip.
   *
   * @param customerIp the new customer ip
   */
  public final void setCustomerIp(final String customerIp) {
    this.customerIp = customerIp;
  }

  /**
   * Gets the dup check.
   *
   * @return the dup check
   */
  public final Boolean getDupCheck() {
    return dupCheck;
  }

  /**
   * Sets the dup check.
   *
   * @param dupCheck the new dup check
   */
  public final void setDupCheck(final Boolean dupCheck) {
    this.dupCheck = dupCheck;
  }

  /**
   * Gets the merchant descriptor.
   *
   * @return the merchant descriptor
   */
  public final MerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  /**
   * Sets the merchant descriptor.
   *
   * @param merchantDescriptor the new merchant descriptor
   */
  public final void setMerchantDescriptor(final MerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public final String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public final void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Gets the master pass.
   *
   * @return the master pass
   */
  public final MasterPass getMasterPass() {
    return masterPass;
  }

  /**
   * Sets the master pass.
   *
   * @param masterPass the new master pass
   */
  public final void setMasterPass(final MasterPass masterPass) {
    this.masterPass = masterPass;
  }

  /**
   * Gets the txn time.
   *
   * @return the txn time
   */
  public final String getTxnTime() {
    return txnTime;
  }

  /**
   * Sets the txn time.
   *
   * @param txnTime the new txn time
   */
  public final void setTxnTime(final String txnTime) {
    this.txnTime = txnTime;
  }

  /**
   * Gets the currency code.
   *
   * @return the currency code
   */
  public final String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the currency code.
   *
   * @param currencyCode the new currency code
   */
  public final void setCurrencyCode(final String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Gets the avs response.
   *
   * @return the avs response
   */
  public final AvsResponse getAvsResponse() {
    return avsResponse;
  }

  /**
   * Sets the avs response.
   *
   * @param avsResponse the new avs response
   */
  public final void setAvsResponse(final AvsResponse avsResponse) {
    this.avsResponse = avsResponse;
  }

  /**
   * Gets the cvv verification.
   *
   * @return the cvv verification
   */
  public final CvvVerification getCvvVerification() {
    return cvvVerification;
  }

  /**
   * Sets the cvv verification.
   *
   * @param cvvVerification the new cvv verification
   */
  public final void setCvvVerification(final CvvVerification cvvVerification) {
    this.cvvVerification = cvvVerification;
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
   * Gets the risk reason code.
   *
   * @return the risk reason code
   */
  public final ArrayList<Integer> getRiskReasonCode() {
    return riskReasonCode;
  }

  /**
   * Sets the risk reason code.
   *
   * @param riskReasonCode the new risk reason code
   */
  public final void setRiskReasonCode(final ArrayList<Integer> riskReasonCode) {
    this.riskReasonCode = riskReasonCode;
  }

  /**
   * Gets the acquirer response.
   *
   * @return the acquirer response
   */
  public final AcquirerResponse getAcquirerResponse() {
    return acquirerResponse;
  }

  /**
   * Sets the acquirer response.
   *
   * @param acquirerResponse the new acquirer response
   */
  public final void setAcquirerResponse(final AcquirerResponse acquirerResponse) {
    this.acquirerResponse = acquirerResponse;
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
   * Gets the links.
   *
   * @return the links
   */
  public final ArrayList<Link> getLinks() {
    return links;
  }

  /**
   * Sets the links.
   *
   * @param links the new links
   */
  public final void setLinks(final ArrayList<Link> links) {
    this.links = links;
  }
  
  /**
   * Gets the storedCredential.
   *
   * @return the storedCredential
   */
  public final StoredCredential getStoredCredential() {
	return storedCredential;
}
/**
   * Sets the storedCredential.
   *
   * @param storedCredential the new storedCredential
   */
public final void setStoredCredentials(StoredCredential storedCredential) {
	this.storedCredential = storedCredential;
}

  /**
   * Get a Verification builder.
   *
   * @return VerificationBuilder
   */
  public static final VerificationBuilder builder() {
    return new VerificationBuilder();
  }

  /**
   * The builder class for Verification.
   */
  public static class VerificationBuilder extends BaseBuilder<Verification> {

    /** The verification. */
    private final Verification verification = new Verification();
    
    /** The card builder. */
    private Card.CardBuilder<VerificationBuilder> cardBuilder;
    
    /** The profile builder. */
    private Profile.ProfileBuilder<VerificationBuilder> profileBuilder;
    
    /** The billing details builder. */
    private BillingDetails.BillingDetailsBuilder<VerificationBuilder> billingDetailsBuilder;
    
    /** The merchant descriptor builder. */
    private MerchantDescriptor.MerchantDescriptorBuilder<VerificationBuilder> merchantDescriptorBuilder;
    /**The Stored Credential Builder. */
    private StoredCredential.StoredCredentialBuilder<VerificationBuilder>storedCredentialBuilder;


    /**
     * Build this Verification object.
     *
     * @return Verification
     */
    @Override
    public final Verification build() {
      if (null != cardBuilder) {
        verification.setCard(cardBuilder.build());
      }
      if (null != billingDetailsBuilder) {
        verification.setBillingDetails(billingDetailsBuilder.build());
      }
      if (null != merchantDescriptorBuilder) {
        verification.setMerchantDescriptor(merchantDescriptorBuilder.build());
      }
      if(null !=storedCredentialBuilder){
    	  verification.setStoredCredentials(storedCredentialBuilder.build());
      }
      return verification;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return VerificationBuilder
     */
    public final VerificationBuilder id(final Id<Verification> id) {
      verification.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant ref num
     * @return AuuthorizationBuilder
     */
    public final VerificationBuilder merchantRefNum(final String merchantRefNum) {
      verification.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Build a card within this Verification.
     *
     * @return Card.CardBuilder< VerificationBuilder >
     */
    public final Card.CardBuilder<VerificationBuilder> card() {
      if (null == cardBuilder) {
        cardBuilder = new Card.CardBuilder<VerificationBuilder>(this);
      }
      return cardBuilder;
    }
    
    /**
     * Add details from a customer vault card to this card object.
     *
     * @param c the c
     * @return AuthorizationBuilder
     */
    public final VerificationBuilder card(final com.paysafe.customervault.Card c) {
      cardBuilder = new Card.CardBuilder<VerificationBuilder>(this, c);
      return this;
    }

    /**
     * Build a profile within this Verification.
     *
     * @return Profile.ProfileBuilder< VerificationBuilder >
     */
    public final Profile.ProfileBuilder<VerificationBuilder> profile() {
      if (null == profileBuilder) {
        profileBuilder = new Profile.ProfileBuilder<VerificationBuilder>(this);
      }
      return profileBuilder;
    }
    
    /**
     * Add details from a customer vault profile to this Profile object.
     *
     * @param p the p
     * @return VerificationBuilder
     */
    public final VerificationBuilder profile(
            final com.paysafe.customervault.Profile p) {
      profileBuilder = new Profile.ProfileBuilder<
                VerificationBuilder>(this, p);
      return this;
    }

    /**
     * Build a billingDetails within this Verification.
     *
     * @return BillingDetails.BillingDetailsBuilder< VerificationBuilder >
     */
    public final BillingDetails.BillingDetailsBuilder<VerificationBuilder> billingDetails() {
      if (null == billingDetailsBuilder) {
        billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                VerificationBuilder>(this);
      }
      return billingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this BillingDetails object.
     *
     * @param a the a
     * @return VerificationBuilder
     */
    public final VerificationBuilder billingDetails(
            final com.paysafe.customervault.Address a) {
      billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                VerificationBuilder>(this, a);
      return this;
    }

    /**
     * Customer ip.
     *
     * @param customerIp the customer ip
     * @return the verification builder
     */
    public final VerificationBuilder customerIp(final String customerIp) {
      verification.setCustomerIp(customerIp);
      return this;
    }

    /**
     * Dup check.
     *
     * @param dupCheck the dup check
     * @return the verification builder
     */
    public final VerificationBuilder dupCheck(final Boolean dupCheck) {
      verification.setDupCheck(dupCheck);
      return this;
    }

    /**
     * Build a merchantDescriptor within this Verification.
     *
     * @return MerchantDescriptor.MerchantDescriptorBuilder< VerificationBuilder
     * >
     */
    public final MerchantDescriptor.MerchantDescriptorBuilder<VerificationBuilder>
            merchantDescriptor() {
      if (null == merchantDescriptorBuilder) {
        merchantDescriptorBuilder
                = new MerchantDescriptor.MerchantDescriptorBuilder<
                        VerificationBuilder>(this);
      }
      return merchantDescriptorBuilder;
    }

    /**
     * Description.
     *
     * @param description the description
     * @return the verification builder
     */
    public final VerificationBuilder description(final String description) {
      verification.setDescription(description);
      return this;
    }
    
    /**
     * Add details from a Stored credentials to this Stored credentials object.
     *
     * @param a the a
     * @return VerificationBuilder
     */	
    public final StoredCredential.StoredCredentialBuilder<VerificationBuilder> storedCredential(){
    	if(null==storedCredentialBuilder){
    		storedCredentialBuilder=new StoredCredential.StoredCredentialBuilder<VerificationBuilder>(this);
    	}
    	return storedCredentialBuilder;
    }
  }
}
