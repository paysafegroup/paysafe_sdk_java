/*
 * Copyright (c) 2016 Paysafe
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

import java.util.Date;
import com.google.gson.annotations.Expose;
import com.paysafe.common.Id;
import com.paysafe.common.Error;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Mandates.
 * @author bhushan.patil  
 * @since
 * 04-04-2016.
 */

public class Mandates implements BaseDomainObject 
{
	
	/** The id. */
	@Expose
	private Id<Mandates> id;
	
	/** The reference. */
	@Expose
	private String reference;
	
	/** The bank account id. */
	@Expose
	private String bankAccountId;
	
	/** The status. */
	@Expose
	private Status status;
	
	/** The payment token. */
	@Expose
	private String paymentToken;
	
	/** The status change date. */
	@Expose
	private Date statusChangeDate;
	
	/** The status reason code. */
	@Expose
	private String statusReasonCode;
	
	/** The status reason. */
	@Expose
	private String statusReason;
	
	/** The profile id. */
	@Expose
	private Id<Profile> profileId;
	
	/** The bacs bank account id. */
	@Expose
	private Id<BACSBankAccounts> bacsBankAccountId;
	
	/** The sepa bank account id. */
	@Expose
	private Id<SEPABankAccounts> sepaBankAccountId;
	
	
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Id<Mandates> getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Id<Mandates> id) {
		this.id = id;
	}

	/**
	 * Gets the reference.
	 *
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Sets the reference.
	 *
	 * @param reference the new reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Gets the bank account id.
	 *
	 * @return the bank account id
	 */
	public String getBankAccountId() {
		return bankAccountId;
	}

	/**
	 * Sets the bank account id.
	 *
	 * @param bankAccountId the new bank account id
	 */
	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Gets the payment token.
	 *
	 * @return the payment token
	 */
	public String getPaymentToken() {
		return paymentToken;
	}

	/**
	 * Sets the payment token.
	 *
	 * @param paymentToken the new payment token
	 */
	public void setPaymentToken(String paymentToken) {
		this.paymentToken = paymentToken;
	}

	/**
	 * Gets the status change date.
	 *
	 * @return the status change date
	 */
	public Date getStatusChangeDate() {
		return statusChangeDate;
	}

	/**
	 * Sets the status change date.
	 *
	 * @param statusChangeDate the new status change date
	 */
	public void setStatusChangeDate(Date statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}

	/**
	 * Gets the status reason code.
	 *
	 * @return the status reason code
	 */
	public String getStatusReasonCode() {
		return statusReasonCode;
	}

	/**
	 * Sets the status reason code.
	 *
	 * @param statusReasonCode the new status reason code
	 */
	public void setStatusReasonCode(String statusReasonCode) {
		this.statusReasonCode = statusReasonCode;
	}

	/**
	 * Gets the status reason.
	 *
	 * @return the status reason
	 */
	public String getStatusReason() {
		return statusReason;
	}

	/**
	 * Sets the status reason.
	 *
	 * @param statusReason the new status reason
	 */
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	
	/**
	 * Gets the profile id.
	 *
	 * @return the profile id
	 */
	public Id<Profile> getProfileId() {
		return profileId;
	}

	/**
	 * Sets the profile id.
	 *
	 * @param profileId the new profile id
	 */
	public void setProfileId(Id<Profile> profileId) {
		this.profileId = profileId;
	}
	
	/**
	 * Gets the bacs bank account id.
	 *
	 * @return the bacs bank account id
	 */
	public Id<BACSBankAccounts> getBacsBankAccountId() {
		return bacsBankAccountId;
	}

	/**
	 * Sets the bacs bank account id.
	 *
	 * @param bacsBankAccountId the new bacs bank account id
	 */
	public void setBacsBankAccountId(Id<BACSBankAccounts> bacsBankAccountId) {
		this.bacsBankAccountId = bacsBankAccountId;
	}
	
	/**
	 * Gets the sepa bank account id.
	 *
	 * @return the sepa bank account id
	 */
	public Id<SEPABankAccounts> getSepaBankAccountId() {
		return sepaBankAccountId;
	}

	/**
	 * Sets the sepa bank account id.
	 *
	 * @param sepaBankAccountId the new sepa bank account id
	 */
	public void setSepaBankAccountId(Id<SEPABankAccounts> sepaBankAccountId) {
		this.sepaBankAccountId = sepaBankAccountId;
	}
	

	/* (non-Javadoc)
	 * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
	 */
	@Override
	public Error getError() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Get a MandatesBuilder builder.
	 *
	 * @return MandatesBuilder
	 */
	public static final MandatesBuilder builder() {
		return new MandatesBuilder();
	}
	/**
	 * The builder class for Mandates.
	 */
	public static class MandatesBuilder extends BaseBuilder<Mandates> {

		/** The mandates. */
		private final Mandates mandates = new Mandates();
		
		/**
		 * Build this Mandates object.
		 *
		 * @return Mandates
		 */
		@Override
		public final Mandates build() {
			return mandates;
			
		}

		/**
		 * Set the id property.
		 *
		 * @param id the id
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder id(final Id<Mandates> id) {
			mandates.setId(id);
			return this;
		}
		
		/**
		 * Set the reference property.
		 *
		 * @param reference the reference
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder reference(final String reference) {
			mandates.setReference(reference);
			return this;
		}
		
		/**
		 * Set the bankAccountId property.
		 *
		 * @param bankAccountId the bank account id
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder bankAccountId(final String bankAccountId) {
			mandates.setBankAccountId(bankAccountId);
			return this;
		}
		
		/**
		 * Set the status property.
		 *
		 * @param status the status
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder status(final Status status) {
			mandates.setStatus(status);
			return this;
		}
		
		/**
		 * Set the paymentToken property.
		 *
		 * @param paymentToken the payment token
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder paymentToken(final String paymentToken) {
			mandates.setPaymentToken(paymentToken);
			return this;
		}
		
		/**
		 * Set the statusChangeDate property.
		 *
		 * @param statusChangeDate the status change date
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder statusChangeDate(final Date statusChangeDate) {
			mandates.setStatusChangeDate(statusChangeDate);
			return this;
		}
		
		/**
		 * Set the statusReasonCode property.
		 *
		 * @param statusReasonCode the status reason code
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder statusReasonCode(final String statusReasonCode) {
			mandates.setStatusReasonCode(statusReasonCode);
			return this;
		}
		
		/**
		 * Set the statusReason property.
		 *
		 * @param statusReason the status reason
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder statusReason(final String statusReason) {
			mandates.setStatusReason(statusReason);
			return this;
		}
		
		/**
		 * Set the profileId property.
		 *
		 * @param profileId the profile id
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder profileId(final Id<Profile> profileId) {
			mandates.setProfileId(profileId);
			return this;
		}
		
		/**
		 * Set the bacsBankAccountId property.
		 *
		 * @param bacsBankAccountId the bacs bank account id
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder bacsBankAccountId(final Id<BACSBankAccounts> bacsBankAccountId) {
			mandates.setBacsBankAccountId(bacsBankAccountId);
			return this;
		}
		
		/**
		 * Set the sepaBankAccountId property.
		 *
		 * @param sepaBankAccountId the sepa bank account id
		 * @return MandatesBuilder
		 */
		public final MandatesBuilder sepaBankAccountId(final Id<SEPABankAccounts> sepaBankAccountId) {
			mandates.setSepaBankAccountId(sepaBankAccountId);
			return this;
		}
		
	}

}
   