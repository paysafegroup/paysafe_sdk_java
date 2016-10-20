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

import java.util.List;

import com.google.gson.annotations.Expose;
import com.paysafe.common.Id;
import com.paysafe.common.Error;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class SEPABankAccounts.
 * @author manisha.rani  
 * @since
 * 25-02-2016. 
 */
public class SEPABankAccounts implements BaseDomainObject {

    /** The id. */
    private Id<SEPABankAccounts> id;
    
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
    
    /** The iban. */
    @Expose
    private String iban;
    
    /** The bic. */
    @Expose
    private String bic;
    
    /** The account holder name. */
    @Expose
    private String accountHolderName;
    
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
    @Expose
    private Error error;
    
    /** The profile id. */
    @Expose
    private Id<Profile> profileId;
    
    /** The mandates. */
    @Expose
    private List<Mandates> mandates;
   

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Id<SEPABankAccounts> getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final Id<SEPABankAccounts> id) {
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
     * Gets the iban.
     *
     * @return the iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the iban.
     *
     * @param iban the new iban
     */
    public void setIban(final String iban) {
        this.iban = iban;
    }

    /**
     * Gets the bic.
     *
     * @return the bic
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the bic.
     *
     * @param bic the new bic
     */
    public void setBic(final String bic) {
        this.bic = bic;
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
    public Id<Address> getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Sets the billing address id.
     *
     * @param billingAddressId the new billing address id
     */
    public void setBillingAddressId(final Id<Address> billingAddressId) {
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
    public Error getError() {
        return error;
    }

    /**
     * Sets the error.
     *
     * @param error the new error
     */
    public void setError(final Error error) {
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
    public void setProfileId(final Id<Profile> profileId) {
        this.profileId = profileId;
    }
    
    /**
     * Gets the mandates.
     *
     * @return the mandates
     */
    public List<Mandates> getMandates() {
		return mandates;
	}

	/**
	 * Sets the mandates.
	 *
	 * @param mandates the new mandates
	 */
	public void setMandates(List<Mandates> mandates) {
		this.mandates = mandates;
	}

    /**
     * Get a SEPABankAccount builder.
     *
     * @return SEPABankAccountBuilder
     */
    public static final SEPABankAccountBuilder builder() {
        return new SEPABankAccountBuilder();
    }

    /**
     * The builder class for SEPABankAccounts.
     */
    public static class SEPABankAccountBuilder extends BaseBuilder<SEPABankAccounts> {

        /** The sepa bank accounts. */
        private final SEPABankAccounts sepaBankAccounts = new SEPABankAccounts();

        /**
         * Build this SEPA bank accounts object.
         *
         * @return SEPABankAccounts
         */
        @Override
        public final SEPABankAccounts build() {
            return sepaBankAccounts;
        }
        
        /**
         * Set the id property.
         *
         * @param id the id
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder id(final Id<SEPABankAccounts> id) {
            sepaBankAccounts.setId(id);
            return this;
        }
        
        /**
         * Set the nickName property.
         *
         * @param nickName the nick name
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder nickName(final String nickName) {
            sepaBankAccounts.setNickName(nickName);
            return this;
        }
        
        /**
         * Set the merchantRefNum property.
         *
         * @param merchantRefNum the merchant ref num
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder merchantRefNum (final String merchantRefNum) {
            sepaBankAccounts.setMerchantRefNum(merchantRefNum);
            return this;
        }
        
        /**
         * Set the Status property.
         *
         * @param status the status
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder status(final Status status) {
            sepaBankAccounts.setStatus(status);
            return this;
        }
        
        /**
         * Set the StatusReason property.
         *
         * @param statusReason the status reason
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder statusReason(final String statusReason) {
            sepaBankAccounts.setStatusReason(statusReason);
            return this;
        }

        /**
         * Set the iban property.
         *
         * @param iban the iban
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder iban(final String iban) {
            sepaBankAccounts.setIban(iban);
            return this;
        }
        
        /**
         * Set the bic property.
         *
         * @param bic the bic
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder bic(final String bic) {
            sepaBankAccounts.setBic(bic);
            return this;
        }
        
        /**
         * Set the accountHolderName property.
         *
         * @param accountHolderName the account holder name
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder accountHolderName(final String accountHolderName) {
            sepaBankAccounts.setAccountHolderName(accountHolderName);
            return this;
        }
        
        /**
         * Set the lastDigits property.
         *
         * @param lastDigits the last digits
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder lastDigits(final String lastDigits) {
            sepaBankAccounts.setLastDigits(lastDigits);
            return this;
        }

        /**
         * Set the billingAddressId property.
         *
         * @param billingAddressId the billing address id
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder billingAddressId(final Id<Address> billingAddressId) {
            sepaBankAccounts.setBillingAddressId(billingAddressId);
            return this;
        }

        /**
         * Set the paymentToken property.
         *
         * @param paymentToken the payment token
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder paymentToken(final String paymentToken) {
            sepaBankAccounts.setPaymentToken(paymentToken);
            return this;
        }
        
        /**
         * Set the profileId property.
         *
         * @param profileId the profile id
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder profileId(final Id<Profile> profileId) {
            sepaBankAccounts.setProfileId(profileId);
            return this;
        }
        
        /**
         * Set the mandates property.
         *
         * @param mandates the mandates
         * @return SEPABankAccountBuilder
         */
        public final SEPABankAccountBuilder mandates(final List<Mandates> mandates) {
            sepaBankAccounts.setMandates(mandates);
            return this;
        }
    }
}