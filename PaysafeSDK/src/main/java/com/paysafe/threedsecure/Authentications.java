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
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.Link;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;
import com.paysafe.threedsecure.EnrollmentChecks;

// TODO: Auto-generated Javadoc
/**
 * The Class Authentications. 
 * @author sanket.desale
 * @since 05-04-2016. 
 */
 public class Authentications implements BaseDomainObject {

	/** The id. */
	private Id<Authentications> id;
	
	/** The merchant ref num. */
	@Expose
	private String merchantRefNum;
	
	/** The pa res. */
	@Expose
	private String paRes;
	
	/** The customer ip. */
	@Expose
	private String customerIp;
	
	/** The txn time. */
	@Expose
	private String txnTime;
	
	/** The status. */
	@Expose
	private Status status; 
	
	/** The eci. */
	@Expose
	private Integer eci;
	
	/** The cavv. */
	@Expose
	private String cavv;
	
	/** The xid. */
	@Expose
	private String xid;
	
	/** The three d result. */
	@Expose
	private String threeDResult;
	
	/** The signature status. */
	@Expose
	private String signatureStatus;
	
	/** The error. */
	private Error error;
	
	/** The enrollment id. */
	private Id<EnrollmentChecks> enrollmentId;
	
	/** The links. */
	private ArrayList<Link> links;
	
	/** The EnrollmentChecks. */
	private ArrayList<EnrollmentChecks> enrollmentchecks;
		
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Id<Authentications> getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(final Id<Authentications> id) {
		this.id = id;
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
	public final void setEci(final Integer eci) {
		this.eci = eci;
	}

	/**
	 * Gets the cavv.
	 *
	 * @return the cavv
	 */
	public final String getCavv() {
		return cavv;
	}

	/**
	 * Sets the cavv.
	 *
	 * @param cavv the new cavv
	 */
	public final void setCavv(final String cavv) {
		this.cavv = cavv;
	}

	/**
	 * Gets the xid.
	 *
	 * @return the xid
	 */
	public final String getXid() {
		return xid;
	}

	/**
	 * Sets the xid.
	 *
	 * @param xid the new xid
	 */
	public final void setXid(final String xid) {
		this.xid = xid;
	}

	/**
	 * Gets the three d result.
	 *
	 * @return the three d result
	 */
	public final String getThreeDResult() {
		return threeDResult;
	}

	/**
	 * Sets the three d result.
	 *
	 * @param threeDResult the new three d result
	 */
	public final void setThreeDResult(final String threeDResult) {
		this.threeDResult = threeDResult;
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
	 * Gets the signature status.
	 *
	 * @return the signature status
	 */
	public final String getSignatureStatus() {
		return signatureStatus;
	}

	/**
	 * Sets the signature status.
	 *
	 * @param signatureStatus the new signature status
	 */
	public final void setSignatureStatus(final String signatureStatus) {
		this.signatureStatus = signatureStatus;
	}

	/**
	 * Gets the pa res.
	 *
	 * @return the pa res
	 */
	public final String getPaRes() {
		return paRes;
	}

	/**
	 * Sets the pa res.
	 *
	 * @param paRes the new pa res
	 */
	public final void setPaRes(final String paRes) {
		this.paRes = paRes;
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
	 * Gets the enrollmentchecks.
	 *
	 * @return the enrollmentchecks.
	 */
	public ArrayList<EnrollmentChecks> getEnrollmentchecks() {
		return enrollmentchecks;
	}
	
	/**
	 * Sets the enrollmentchecks.
	 *
	 * @param enrollmentchecks the new enrollmentchecks
	 */
	public void setEnrollmentchecks(ArrayList<EnrollmentChecks> enrollmentchecks) {
		this.enrollmentchecks = enrollmentchecks;
	}
  	
  	
  	/**
	 * Gets the enrollment id.
	 *
	 * @return the enrollment id
	 */
	public  Id<EnrollmentChecks> getEnrollmentId() {
		return enrollmentId;
	}

	/**
	 * Sets the enrollment id.
	 *
	 * @param enrollmentId the new enrollment id
	 */
	public void setEnrollmentId(final Id<EnrollmentChecks> enrollmentId) {
		this.enrollmentId = enrollmentId;
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
	 * Get an Authentication builder.
	 *
	 * @return AuthenticationBuilder
	 */
	public static final AuthenticationsBuilder builder() {
		return new AuthenticationsBuilder();
	}
	
	/**
	 * The sub-builder class for Authentication.
	 *
	 */
	public static class AuthenticationsBuilder extends BaseBuilder<Authentications> {

		/** The authentication. */
		private final Authentications authentication = new Authentications();

		/**
		 * Build this authentication object.
		 *
		 * @return Authentication
		 */
		@Override
		public final Authentications build() {
			return authentication;
		}

		/**
		 * Set the id property.
		 *
		 * @param id the id
		 * @return AuthenticationBuilder
		 */
		
		public final AuthenticationsBuilder id(final Id<Authentications> id) {
			authentication.setId(id);
			return this;
		}
		
		/**
		 * Set the eci property.
		 *
		 * @param eci the eci
		 * @return AuthenticationBuilder
		 */

		public final AuthenticationsBuilder eci(final Integer eci) {
			authentication.setEci(eci);
			return this;
		}

		/**
		 * Set the status property.
		 *
		 * @param status the status
		 * @return AuthenticationBuilder
		 */

		public final AuthenticationsBuilder status(final Status status) {
			authentication.setStatus(status);
			return this;
		}
		 
		/**
		 * Set the merchantRefNum property.
		 *
		 * @param merchantRefNum the merchant ref num
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder merchantRefNum(final String merchantRefNum) {
			authentication.setMerchantRefNum(merchantRefNum);
			return this;
		}

		/**
		 * Set the paRes property.
		 *
		 * @param paRes the pa res
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder paRes(final String paRes) {
			authentication.setPaRes(paRes);
			return this;
		}

		/**
		 * Set the txnTime property.
		 *
		 * @param txnTime the txn time
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder txnTime(final String txnTime) {
			authentication.setTxnTime(txnTime);
			return this;
		}

		/**
		 * Set the cavv property.
		 *
		 * @param cavv the cavv
		 * @return AuthenticationBuilder
		 */

		public final AuthenticationsBuilder cavv(final String cavv) {
			authentication.setCavv(cavv);
			return this;
		}

		/**
		 * Set the xid property.
		 *
		 * @param xid the xid
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder xid(final String xid) {
			authentication.setXid(xid);
			return this;
		}

		/**
		 * Set the threeDResult property.
		 *
		 * @param threeDResult the three d result
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder threeDResult(final String threeDResult) {
			authentication.setThreeDResult(threeDResult);
			return this;
		}
		
		/**
		 * Set the threeDResult property.
		 *
		 * @param customerIp the customer ip
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder customerIp(final String customerIp) {
			authentication.setCustomerIp(customerIp);
			return this;
		}
		
		/**
		 * Set the signatureStatus property.
		 *
		 * @param signatureStatus the signature status
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder signatureStatus(final String signatureStatus) {
			authentication.setSignatureStatus(signatureStatus);
			return this;
		}
		
		/**
		 * Set the enrollmentId property.
		 *
		 * @param enrollmentId the enrollment id
		 * @return AuthenticationBuilder
		 */
		public final AuthenticationsBuilder enrollmentId(final Id<EnrollmentChecks> enrollmentId) {
			authentication.setEnrollmentId(enrollmentId);
			return this;
		}
	}

}
