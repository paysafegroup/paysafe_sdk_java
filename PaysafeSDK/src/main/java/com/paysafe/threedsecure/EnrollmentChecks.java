/*
 * Copyright (c) 2016 PaySafe
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

package com.paysafe.threedsecure;

import java.util.ArrayList;


import com.google.gson.annotations.Expose;
import com.paysafe.cardpayments.Card;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.Link;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class EnrollmentChecks
 * @author sanket.desale
 * @since 06-04-2016.
 * 
 */
 
public class EnrollmentChecks implements BaseDomainObject {
	
	/** The id. */
	private Id<EnrollmentChecks> id;
	
	/** The merchant ref num. */
	@Expose
	private String merchantRefNum;
	
	/** The amount. */
	@Expose
	private Integer amount;
	
	/** The currency. */
	@Expose
	private String currency;
	
	/** The customer ip. */
	@Expose
	private String customerIp;
	
	/** The user agent. */
	@Expose
	private String userAgent;
	
	/** The card. */
	@Expose
	private Card card;
	
	/** The accept header. */
	@Expose
	private String acceptHeader;
	
	/** The merchant url. */
	@Expose
	private String merchantUrl;
	
	/** The txn time. */
	@Expose
	private String txnTime;
	
	/** The error. */
	@Expose
	private Error error;
	
	/** The status. */
	@Expose
	private String status;
	
	/** The acs url. */
	@Expose
	private String acsURL;
	
	/** The pa req. */
	@Expose
	private String paReq;
	
	/** The eci. */
	@Expose
	private Integer eci;
	
	/** The three d enrollment. */
	@Expose
	private String threeDEnrollment;
	
	/** The links. */
	private ArrayList<Link> links;
	
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Id<EnrollmentChecks> getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public final void setId(final Id<EnrollmentChecks> id) {
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
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public final String getCurrency() {
		return currency;
	}
	
	/**
	 * Sets the currency.
	 *
	 * @param currency the new currency
	 */
	public final void setCurrency(final String currency) {
		this.currency = currency;
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
	 * Gets the user agent.
	 *
	 * @return the user agent
	 */
	public final String getUserAgent() {
		return userAgent;
	}
	
	/**
	 * Sets the user agent.
	 *
	 * @param userAgent the new user agent
	 */
	public final void setUserAgent(final String userAgent) {
		this.userAgent = userAgent;
	}
	
	/**
	 * Gets the accept header.
	 *
	 * @return the accept header
	 */
	public final String getAcceptHeader() {
		return acceptHeader;
	}
	
	/**
	 * Sets the accept header.
	 *
	 * @param acceptHeader the new accept header
	 */
	public final void setAcceptHeader(final String acceptHeader) {
		this.acceptHeader = acceptHeader;
	}
	
	/**
	 * Gets the merchant url.
	 *
	 * @return the merchant url
	 */
	public final String getMerchantUrl() {
		return merchantUrl;
	}
	
	/**
	 * Sets the merchant url.
	 *
	 * @param merchantUrl the new merchant url
	 */
	public final void setMerchantUrl(final String merchantUrl) {
		this.merchantUrl = merchantUrl;
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
	 * Gets the status.
	 *
	 * @return the status
	 */
	public final String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public final void setStatus(final String status) {
		this.status = status;
	}


	/**
	 * Gets the acs url.
	 *
	 * @return the acs url
	 */
	public final String getAcsURL() {
		return acsURL;
	}
	
	/**
	 * Sets the acs url.
	 *
	 * @param acsURL the new acs url
	 */
	public final void setAcsURL( final String acsURL) {
		this.acsURL = acsURL;
	}
	
	/**
	 * Gets the pa req.
	 *
	 * @return the pa req
	 */
	public final String getPaReq() {
		return paReq;
	}
	
	/**
	 * Sets the pa req.
	 *
	 * @param paReq the new pa req
	 */
	public final void setPaReq( final String paReq) {
		this.paReq = paReq;
	}
	
	/**
	 * Gets the eci.
	 *
	 * @return the eci
	 */
	public final Integer getEci() {
		return eci;
	}
	
	/**
	 * Sets the eci.
	 *
	 * @param eci the new eci
	 */
	public final void setEci( final Integer eci) {
		this.eci = eci;
	}
	
	/**
	 * Gets the three d enrollment.
	 *
	 * @return the three d enrollment
	 */
	public final String getThreeDEnrollment() {
		return threeDEnrollment;
	}
	
	/**
	 * Sets the three d enrollment.
	 *
	 * @param threeDEnrollment the new three d enrollment
	 */
	public final void setThreeDEnrollment( final String threeDEnrollment) {
		this.threeDEnrollment = threeDEnrollment;
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
	 * Get a EnrollmentChecks builder.
	 *
	 * @return ProfileBuilder
	 */
	public static final EnrollmentCheckBuilder builder() {
		return new EnrollmentCheckBuilder();
	}
	  
	/**
	 * The sub-builder class for EnrollmentChecks.
	 *
	 */
	public static class EnrollmentCheckBuilder extends BaseBuilder<EnrollmentChecks> {

		/** The enrollment. */
		private final EnrollmentChecks enrollment = new EnrollmentChecks();
		
		/** The card builder. */
		private Card.CardBuilder<EnrollmentCheckBuilder> cardBuilder;
		/**
		 * Build this authentication object.
		 *
		 * @return EnrollmentChecks
		 */
		public EnrollmentChecks build() {
			
			if (null != cardBuilder) {
				enrollment.setCard((cardBuilder.build()));
			}
			return enrollment;
		}
		
		/**
		 * Set the id property.
		 *
		 * @param id the id
		 * @return EnrollmentCheckBuilder
		 */
		
		public final EnrollmentCheckBuilder id(final Id<EnrollmentChecks> id) {
			enrollment.setId(id);
			return this;
		}
		
		/**
		 * Set the merchantRefNum property.
		 *
		 * @param merchantRefNum the merchant ref num
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder merchantRefNum(final String merchantRefNum) {
			enrollment.setMerchantRefNum(merchantRefNum);
			return this;
		}
		
		/**
		 * Set the currency property.
		 *
		 * @param currency the currency
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder currency(final String currency) {
			enrollment.setCurrency(currency);
			return this;
		}
		
		/**
		 * Set the customerIp property.
		 *
		 * @param customerIp the customer ip
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder customerIp(final String customerIp) {
			enrollment.setCustomerIp(customerIp);
			return this;
		}
		
		/**
		 * Set the userAgent property.
		 *
		 * @param userAgent the user agent
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder userAgent(final String userAgent) {
			enrollment.setUserAgent(userAgent);
			return this;
		}
		
		/**
		 * Set the acceptHeader property.
		 *
		 * @param acceptHeader the accept header
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder acceptHeader(final String acceptHeader) {
			enrollment.setAcceptHeader(acceptHeader);
			return this;
		}
		
		/**
		 * Set the merchantUrl property.
		 *
		 * @param merchantUrl the merchant url
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder merchantUrl(final String merchantUrl) {
			enrollment.setMerchantUrl(merchantUrl);
			return this;
		}
		
		/**
		 * Set the txnTime property.
		 *
		 * @param txnTime the txn time
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder txnTime(final String txnTime) {
			enrollment.setTxnTime(txnTime);
			return this;
		}
		
		/**
		 * Set the status property.
		 *
		 * @param status the status
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder status(final String status) {
			enrollment.setStatus(status);
			return this;
		}
		
		/**
		 * Set the acsURL property.
		 *
		 * @param acsURL the acs url
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder acsURL(final String acsURL) {
			enrollment.setAcsURL(acsURL);
			return this;
		}
		
		/**
		 * Set the paReq property.
		 *
		 * @param paReq the pa req
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder paReq(final String paReq) {
			enrollment.setPaReq(paReq);
			return this;
		}
		
		/**
		 * Set the eci property.
		 *
		 * @param eci the eci
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder eci(final Integer eci) {
			enrollment.setEci(eci);
			return this;
		}
		
		/**
		 * Set the threeDEnrollment property.
		 *
		 * @param threeDEnrollment the three d enrollment
		 * @return EnrollmentCheckBuilder
		 */
		public final EnrollmentCheckBuilder threeDEnrollment(final String threeDEnrollment) {
			enrollment.setThreeDEnrollment(threeDEnrollment);
			return this;
		}
		
		/**
		 * Set the card property.
		 *
		 * @return EnrollmentCheckBuilder
		 */
		public final Card.CardBuilder<EnrollmentCheckBuilder> card() {
			if(null == cardBuilder)
				cardBuilder = new Card.CardBuilder<EnrollmentCheckBuilder>(this);
			return cardBuilder;
		}
		
		/**
		 * set the amount property.
		 *
		 * @param amount the amount
		 * @return EnrollmentCheckBuilder
		 */
		
		public final EnrollmentCheckBuilder amount(final Integer amount) {
				enrollment.setAmount(amount);
				return this;
		}
	} // end of class EnrollmentCheckBuilder

		
}

