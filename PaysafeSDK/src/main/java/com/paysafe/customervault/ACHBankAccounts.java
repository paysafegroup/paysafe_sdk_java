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

import com.google.gson.annotations.Expose;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class ACHBankAccounts.
 * @author manisha.rani  
 * @since
 * 25-02-2016. 
 */
public class ACHBankAccounts implements BaseDomainObject {

	/** The id. */
	private Id<ACHBankAccounts> id;
	
	/** The nick name. */
	@Expose
	private String nickName;
	
	/** The merchant ref num. */
	@Expose
	private String merchantRefNum;
	
	/** The status. */
	@Expose
	private Status status;
	
	/** The status reason. */
	@Expose
	private String statusReason;
	
	/** The account number. */
	@Expose
	private String accountNumber;
	
	/** The account holder name. */
	@Expose
	private String accountHolderName;
	
	/** The routing number. */
	@Expose
	private String routingNumber;
	
	/** The account type. */
	@Expose
	private AccountType accountType;
	
	/** The last digits. */
	@Expose
	private String lastDigits;
	
	/** The billing address id. */
	@Expose
	private Id<Address> billingAddressId;
	
	/** The payment token. */
	@Expose
	private String paymentToken;
	
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
	public Id<ACHBankAccounts> getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(final Id<ACHBankAccounts> id) {
		this.id = id;
	}

	/**
	 * Gets the nick name.
	 *
	 * @return the nick name
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * Sets the nick name.
	 *
	 * @param nickName the new nick name
	 */
	public void setNickName(final String nickName) {
		this.nickName = nickName;
	}

	/**
	 * Gets the merchant ref num.
	 *
	 * @return the merchant ref num
	 */
	public String getMerchantRefNum() {
		return merchantRefNum;
	}

	/**
	 * Sets the merchant ref num.
	 *
	 * @param merchantRefNum the new merchant ref num
	 */
	public void setMerchantRefNum(final String merchantRefNum) {
		this.merchantRefNum = merchantRefNum;
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
	public void setStatus(final Status status) {
		this.status = status;
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
	public void setStatusReason(final String statusReason) {
		this.statusReason = statusReason;
	}

	/**
	 * Gets the account number.
	 *
	 * @return the account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the account number.
	 *
	 * @param accountNumber the new account number
	 */
	public void setAccountNumber(final String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Gets the account holder name.
	 *
	 * @return the account holder name
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * Sets the account holder name.
	 *
	 * @param accountHolderName the new account holder name
	 */
	public void setAccountHolderName(final String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	/**
	 * Gets the routing number.
	 *
	 * @return the routing number
	 */
	public String getRoutingNumber() {
		return routingNumber;
	}

	/**
	 * Sets the routing number.
	 *
	 * @param routingNumber the new routing number
	 */
	public void setRoutingNumber(final String routingNumber) {
		this.routingNumber = routingNumber;
	}

	/**
	 * Gets the account type.
	 *
	 * @return the account type
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * Sets the account type.
	 *
	 * @param accountType the new account type
	 */
	public void setAccountType(final AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * Gets the last digits.
	 *
	 * @return the last digits
	 */
	public String getLastDigits() {
		return lastDigits;
	}

	/**
	 * Sets the last digits.
	 *
	 * @param lastDigits the new last digits
	 */
	public void setLastDigits(final String lastDigits) {
		this.lastDigits = lastDigits;
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
	public void setPaymentToken(final String paymentToken) {
		this.paymentToken = paymentToken;
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
	 * Get a ACHBankAccount builder.
	 *
	 * @return ACHBankAccountBuilder
	 */
	public static final ACHBankAccountBuilder builder() {
		return new ACHBankAccountBuilder();
	}

	/**
	 * The builder class for ACHBankAccounts.
	 */
	public static class ACHBankAccountBuilder extends BaseBuilder<ACHBankAccounts> {

		/** The ach bank accounts. */
		private final ACHBankAccounts achBankAccounts = new ACHBankAccounts();
		
		/**
		 * Build this ACH bank accounts object.
		 *
		 * @return ACHBankAccounts
		 */
		@Override
		public final ACHBankAccounts build() {
			return achBankAccounts;
			
		}

		/**
		 * Set the id property.
		 *
		 * @param id the id
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder id(final Id<ACHBankAccounts> id) {
			achBankAccounts.setId(id);
			return this;
		}

		/**
		 * Set the nickName property.
		 *
		 * @param nickName the nick name
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder nickName(final String nickName) {
			achBankAccounts.setNickName(nickName);
			return this;
		}

		/**
		 * Set the merchantRefNum property.
		 *
		 * @param merchantRefNum the merchant ref num
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder merchantRefNum(final String merchantRefNum) {
			achBankAccounts.setMerchantRefNum(merchantRefNum);
			return this;
		}

		/**
		 * Set the Status property.
		 *
		 * @param status the status
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder status(final Status status) {
			achBankAccounts.setStatus(status);
			return this;
		}

		/**
		 * Set the StatusReason property.
		 *
		 * @param statusReason the status reason
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder statusReason(final String statusReason) {
			achBankAccounts.setStatusReason(statusReason);
			return this;
		}

		/**
		 * Set the accountNumber property.
		 *
		 * @param accountNumber the account number
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder accountNumber(final String accountNumber) {
			achBankAccounts.setAccountNumber(accountNumber);
			return this;
		}

		/**
		 * Set the accountHolderName property.
		 *
		 * @param accountHolderName the account holder name
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder accountHolderName(final String accountHolderName) {
			achBankAccounts.setAccountHolderName(accountHolderName);
			return this;
		}

		/**
		 * Set the routingNumber property.
		 *
		 * @param routingNumber the routing number
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder routingNumber(final String routingNumber) {
			achBankAccounts.setRoutingNumber(routingNumber);
			return this;
		}

		/**
		 * Set the accountType property.
		 *
		 * @param accountType the account type
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder accountType(final AccountType accountType) {
			achBankAccounts.setAccountType(accountType);
			return this;
		}

		/**
		 * Set the lastDigits property.
		 *
		 * @param lastDigits the last digits
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder lastDigits(final String lastDigits) {
			achBankAccounts.setLastDigits(lastDigits);
			return this;
		}

		/**
		 * Set the billingAddressId property.
		 *
		 * @param billingAddressId the billing address id
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder billingAddressId(final Id<Address> billingAddressId) {
			achBankAccounts.setBillingAddressId(billingAddressId);
			return this;
		}

		/**
		 * Set the paymentToken property.
		 *
		 * @param paymentToken the payment token
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder paymentToken(final String paymentToken) {
			achBankAccounts.setPaymentToken(paymentToken);
			return this;
		}

		/**
		 * Set the profileId property.
		 *
		 * @param profileId the profile id
		 * @return ACHBankAccountBuilder
		 */
		public final ACHBankAccountBuilder profileId(final Id<Profile> profileId) {
			achBankAccounts.setProfileId(profileId);
			return this;
		}
	}
}
