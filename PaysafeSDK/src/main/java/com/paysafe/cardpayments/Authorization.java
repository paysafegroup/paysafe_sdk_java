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

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.Link;
import com.paysafe.common.ShippingDetails;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Authorization.
 */
public class Authorization implements BaseDomainObject {

  /** The id. */
  private Id<Authorization> id;
  
  /** The merchant ref num. */
  @Expose
  private String merchantRefNum;
  
  /** The amount. */
  @Expose
  private Integer amount;
  
  /** The settle with auth. */
  @Expose
  private Boolean settleWithAuth;
  
  /** The available to settle. */
  private Integer availableToSettle;
  
  /** The child account num. */
  private String childAccountNum;
  
  /** The card. */
  @Expose
  private Card card;
  
  /** The authentication. */
  @Expose
  private Authentication authentication;
  
  /** The auth code. */
  private String authCode;
  
  /** The profile. */
  private Profile profile;
  
  /** The billing details. */
  @Expose
  private BillingDetails billingDetails;
  
  /** The shipping details. */
  @Expose
  private ShippingDetails shippingDetails;
  
  /** The recurring. */
  @Expose
  private Recurring recurring;
  
  /** The customer ip. */
  @Expose
  private String customerIp;
  
  /** The dup check. */
  @Expose
  private Boolean dupCheck;
  
  /** The keywords. */
  private ArrayList<String> keywords;
  
  /** The merchant descriptor. */
  @Expose
  private MerchantDescriptor merchantDescriptor;
  
  /** The accord d. */
  @Expose
  private AccordD accordD;
  
  /** The description. */
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
  @Expose
  private Status status;
  
  /** The risk reason code. */
  private ArrayList<Integer> riskReasonCode;
  
  /** The acquirer response. */
  private AcquirerResponse acquirerResponse;
  
  /** The visa additional auth data. */
  private VisaAdditionalAuthData visaAdditionalAuthData;
  
  /** The settlements. */
  private ArrayList<Settlement> settlements;
  
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
  public final Id<Authorization> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Authorization> id) {
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
   * Gets the amount.
   *
   * @return the amount
   */
  public final Integer getAmount() {
    return amount;
  }

  /**
   * Sets the amount.
   *
   * @param amount the new amount
   */
  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  /**
   * Gets the settle with auth.
   *
   * @return the settle with auth
   */
  public final Boolean getSettleWithAuth() {
    return settleWithAuth;
  }

  /**
   * Sets the settle with auth.
   *
   * @param settleWithAuth the new settle with auth
   */
  public final void setSettleWithAuth(final Boolean settleWithAuth) {
    this.settleWithAuth = settleWithAuth;
  }

  /**
   * Gets the available to settle.
   *
   * @return the available to settle
   */
  public final Integer getAvailableToSettle() {
    return availableToSettle;
  }

  /**
   * Sets the available to settle.
   *
   * @param availableToSettle the new available to settle
   */
  public final void setAvailableToSettle(final Integer availableToSettle) {
    this.availableToSettle = availableToSettle;
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
   * Gets the authentication.
   *
   * @return the authentication
   */
  public final Authentication getAuthentication() {
    return authentication;
  }

  /**
   * Sets the authentication.
   *
   * @param authentication the new authentication
   */
  public final void setAuthentication(final Authentication authentication) {
    this.authentication = authentication;
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
   * Gets the shipping details.
   *
   * @return the shipping details
   */
  public final ShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  /**
   * Sets the shipping details.
   *
   * @param shippingDetails the new shipping details
   */
  public final void setShippingDetails(final ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  /**
   * Gets the recurring.
   *
   * @return the recurring
   */
  public final Recurring getRecurring() {
    return recurring;
  }

  /**
   * Sets the recurring.
   *
   * @param recurring the new recurring
   */
  public final void setRecurring(final Recurring recurring) {
    this.recurring = recurring;
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
   * Gets the keywords.
   *
   * @return the keywords
   */
  public final ArrayList<String> getKeywords() {
    return keywords;
  }

  /**
   * Gets the keywords.
   *
   * @param keywords the keywords
   */
  public final void getKeywords(final ArrayList<String> keywords) {
    this.keywords = keywords;
  }

  /**
   * Gets the merchant descriptor.
   *
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
   * Gets the accord d.
   *
   * @return the accord d
   */
  public final AccordD getAccordD() {
    return accordD;
  }

  /**
   * Sets the accord d.
   *
   * @param accordD the new accord d
   */
  public final void setAccordD(final AccordD accordD) {
    this.accordD = accordD;
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

  /**
   * Gets the visa additional auth data.
   *
   * @return the visa additional auth data
   */
  public final VisaAdditionalAuthData getVisaAdditionalAuthData() {
    return visaAdditionalAuthData;
  }

  /**
   * Sets the visa additional auth data.
   *
   * @param visaAdditionalAuthData the new visa additional auth data
   */
  public final void setVisaAdditionalAuthData(
          final VisaAdditionalAuthData visaAdditionalAuthData) {
    this.visaAdditionalAuthData = visaAdditionalAuthData;
  }

  /**
   * Gets the settlements.
   *
   * @return the settlements
   */
  public final ArrayList<Settlement> getSettlements() {
    return settlements;
  }

  /**
   * Sets the settlements.
   *
   * @param settlements the new settlements
   */
  public final void setSettlements(final ArrayList<Settlement> settlements) {
    this.settlements = settlements;
  }

  /* (non-Javadoc)
   * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
   */
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
   * Get an authorization builder.
   *
   * @return AuthorizationBuilder
   */
  public static final AuthorizationBuilder builder() {
    return new AuthorizationBuilder();
  }

  /**
   * The builder class for Authorization.
   */
  public static class AuthorizationBuilder extends BaseBuilder<Authorization> {

    /** The card builder. */
    private Card.CardBuilder<AuthorizationBuilder> cardBuilder;
    
    /** The authentication builder. */
    private Authentication.AuthenticationBuilder<AuthorizationBuilder> authenticationBuilder;
    
    /** The billing details builder. */
    private BillingDetails.BillingDetailsBuilder<AuthorizationBuilder> billingDetailsBuilder;
    
    /** The shipping details builder. */
    private ShippingDetails.ShippingDetailsBuilder<AuthorizationBuilder> shippingDetailsBuilder;
   
    /** The merchant descriptor builder. */
    private MerchantDescriptor.MerchantDescriptorBuilder<AuthorizationBuilder> merchantDescriptorBuilder;
    
    /** The accord d builder. */
    private AccordD.AccordDBuilder<AuthorizationBuilder> accordDBuilder;
    
	/**The Stored Credential Builder. */
    private StoredCredential.StoredCredentialBuilder<AuthorizationBuilder>storedCredentialBuilder;
    
     /** The authorization. */
    private final Authorization authorization = new Authorization();

    /**
     * Build this authorization object.
     *
     * @return Authorization
     */
    @Override
    public final Authorization build() {
      if (null != cardBuilder) {
        authorization.setCard(cardBuilder.build());
      }
      if (null != authenticationBuilder) {
        authorization.setAuthentication(authenticationBuilder.build());
      }
      if (null != billingDetailsBuilder) {
        authorization.setBillingDetails(billingDetailsBuilder.build());
      }
      if (null != shippingDetailsBuilder) {
        authorization.setShippingDetails(shippingDetailsBuilder.build());
      }
      if (null != merchantDescriptorBuilder) {
        authorization.setMerchantDescriptor(merchantDescriptorBuilder.build());
      }
      if (null != accordDBuilder) {
        authorization.setAccordD(accordDBuilder.build());
      }
      if(null !=storedCredentialBuilder){
    	  authorization.setStoredCredentials(storedCredentialBuilder.build());
      }
      return authorization;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder id(final Id<Authorization> id) {
      authorization.setId(id);
      return this;
    }

    /**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant ref num
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder merchantRefNum(final String merchantRefNum) {
      authorization.setMerchantRefNum(merchantRefNum);
      return this;
    }

    /**
     * Set the amount property.
     *
     * @param amount the amount
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder amount(final Integer amount) {
      authorization.setAmount(amount);
      return this;
    }

    /**
     * Set the settleWithAuth property.
     *
     * @param settleWithAuth the settle with auth
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder settleWithAuth(final Boolean settleWithAuth) {
      authorization.setSettleWithAuth(settleWithAuth);
      return this;
    }

    /**
     * Build a card within this authorization.
     *
     * @return Card.CardBuilder< AuthorizationBuilder >
     */
    public final Card.CardBuilder<AuthorizationBuilder> card() {
      if (null == cardBuilder) {
        cardBuilder = new Card.CardBuilder<AuthorizationBuilder>(this);
      }
      return cardBuilder;
    }
    
    /**
     * Add details from a customer vault card to this card object.
     *
     * @param c the c
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder card(final com.paysafe.customervault.Card c) {
      cardBuilder = new Card.CardBuilder<AuthorizationBuilder>(this, c);
      return this;
    }

    /**
     * Build an authentication within this authorization.
     *
     * @return Authentication.AuthenticationBuilder< AuthorizationBuilder >
     */
    public final Authentication.AuthenticationBuilder<AuthorizationBuilder> authentication() {
      if (null == authenticationBuilder) {
        authenticationBuilder = new Authentication.AuthenticationBuilder<
                        AuthorizationBuilder>(this);
      }
      return authenticationBuilder;
    }

    /**
     * Build a billingDetails within this authorization.
     *
     * @return BillingDetails.BillingDetailsBuilder< AuthorizationBuilder >
     */
    public final BillingDetails.BillingDetailsBuilder<AuthorizationBuilder> billingDetails() {
      if (null == billingDetailsBuilder) {
        billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                AuthorizationBuilder>(this);
      }
      return billingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this BillingDetails object.
     *
     * @param a the a
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder billingDetails(
            final com.paysafe.customervault.Address a) {
      billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<
                AuthorizationBuilder>(this, a);
      return this;
    }

    /**
     * Build a shippingDetails within this authorization.
     *
     * @return ShippingDetails.ShippingDetailsBuilder< AuthorizationBuilder >
     */
    public final ShippingDetails.ShippingDetailsBuilder<AuthorizationBuilder> shippingDetails() {
      if (null == shippingDetailsBuilder) {
        shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<
                AuthorizationBuilder>(this);
      }
      return shippingDetailsBuilder;
    }
    
    /**
     * Add details from a customer vault address to this ShippingDetails object.
     *
     * @param a the a
     * @return AuthorizationBuilder
     */
    public final AuthorizationBuilder shippingDetails(
            final com.paysafe.customervault.Address a) {
      shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<
                AuthorizationBuilder>(this, a);
      return this;
    }
	
	 /**
     * Add details from a Stored credentials to this Stored credentials object.
     *
     * @param a the a
     * @return AuthorizationBuilder
     */	
    public final StoredCredential.StoredCredentialBuilder<AuthorizationBuilder> storedCredential(){
    	if(null==storedCredentialBuilder){
    		storedCredentialBuilder=new StoredCredential.StoredCredentialBuilder<AuthorizationBuilder>(this);
    	}
    	return storedCredentialBuilder;
    }

    /**
     * Set the recurring property.
     *
     * @param recurring the recurring
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder recurring(final Recurring recurring) {
      authorization.setRecurring(recurring);
      return this;
    }

    /**
     * Set the customerIp property.
     *
     * @param customerIp the customer ip
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder customerIp(final String customerIp) {
      authorization.setCustomerIp(customerIp);
      return this;
    }

    /**
     * Set the dupCheck property.
     *
     * @param dupCheck the dup check
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder dupCheck(final Boolean dupCheck) {
      authorization.setDupCheck(dupCheck);
      return this;
    }

    /**
     * Build a merchantDescriptor within this authorization.
     *
     * @return MerchantDescriptor.MerchantDescriptorBuilder
     * < AuthorizationBuilder >
     */
    public final MerchantDescriptor.MerchantDescriptorBuilder<AuthorizationBuilder>
            merchantDescriptor() {
      if (null == merchantDescriptorBuilder) {
        merchantDescriptorBuilder = new MerchantDescriptor.MerchantDescriptorBuilder<
                        AuthorizationBuilder>(this);
      }
      return merchantDescriptorBuilder;
    }

    /**
     * Build an accordD within this authorization.
     *
     * @return AccordD.AccordDBuilder< AuthorizationBuilder >
     */
    public final AccordD.AccordDBuilder<AuthorizationBuilder> accordD() {
      if (null == accordDBuilder) {
        accordDBuilder = new AccordD.AccordDBuilder<AuthorizationBuilder>(this);
      }
      return accordDBuilder;
    }

    /**
     * Set the description property.
     *
     * @param description the description
     * @return AuuthorizationBuilder
     */
    public final AuthorizationBuilder description(final String description) {
      authorization.setDescription(description);
      return this;
    }
  }
}
