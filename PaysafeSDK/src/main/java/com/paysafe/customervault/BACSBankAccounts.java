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
import com.paysafe.common.Id;
import com.paysafe.common.Error;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class BACSBankAccounts.
 * @author manisha.rani  
 * @since
 * 25-02-2016. 
 */

public class BACSBankAccounts implements BaseDomainObject {

    /** The id. */
    private Id<BACSBankAccounts> id;
    
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
    private String statusReason ;
    
    /** The account number. */
    @Expose
    private String accountNumber;
    
    /** The account holder name. */
    @Expose
    private String accountHolderName;
    
    /** The sort code. */
    @Expose
    private String sortCode;
    
    /** The last digits. */
    @Expose
    private String lastDigits;
    
    /** The billing address id. */
    @Expose
    private Id<Address> billingAddressId;
    
    /** The payment token. */
    @Expose
    private String paymentToken;
    
    /** The mandates. */
    @Expose
    private List<Mandates> mandates;
    
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
    public Id<BACSBankAccounts> getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final Id<BACSBankAccounts> id) {
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
     * Gets the sort code.
     *
     * @return the sort code
     */
    public String getSortCode() {
        return sortCode;
    }

    /**
     * Sets the sort code.
     *
     * @param sortCode the new sort code
     */
    public void setSortCode(final String sortCode) {
        this.sortCode = sortCode;
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
    public void setLastDigits(final  String lastDigits) {
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
    public void setMandates(final List<Mandates> mandates) {
        this.mandates = mandates;
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
     * Get a BACS Bank Account builder.
     *
     * @return BACSBankAccountBuilder
     */
    public static final BACSBankAccountBuilder builder() {
        return new BACSBankAccountBuilder();
    }

    /**
     * The builder class for BACSBankAccounts.
     */
    public static class BACSBankAccountBuilder extends BaseBuilder<BACSBankAccounts> {

        /** The bacs bank accounts. */
        private final BACSBankAccounts bacsBankAccounts = new BACSBankAccounts();

        /**
         * Build this BACS Bank Account object.
         *
         * @return BACSBankAccounts
         */
        @Override
        public final BACSBankAccounts build() {
            return bacsBankAccounts;
        }
        
        /**
         * Set the id property.
         *
         * @param id the id
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder id(final Id<BACSBankAccounts> id) {
            bacsBankAccounts.setId(id);
            return this;
        }
        
        /**
         * Set the nickName property.
         *
         * @param nickName the nick name
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder nickName(final String nickName) {
            bacsBankAccounts.setNickName(nickName);
            return this;
        }
        
        /**
         * Set the merchantRefNum property.
         *
         * @param merchantRefNum the merchant ref num
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder merchantRefNum (final String merchantRefNum) {
            bacsBankAccounts.setMerchantRefNum(merchantRefNum);
            return this;
        }
        
        /**
         * Set the Status property.
         *
         * @param status the status
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder status(final Status status) {
            bacsBankAccounts.setStatus(status);
            return this;
        }
        
        /**
         * Set the StatusReason property.
         *
         * @param statusReason the status reason
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder statusReason(final String statusReason) {
            bacsBankAccounts.setStatusReason(statusReason);
            return this;
        }

        /**
         * Set the accountNumber property.
         *
         * @param accountNumber the account number
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder accountNumber(final String accountNumber) {
            bacsBankAccounts.setAccountNumber(accountNumber);
            return this;
        }
        
        /**
         * Set the accountHolderName property.
         *
         * @param accountHolderName the account holder name
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder accountHolderName(final String accountHolderName) {
            bacsBankAccounts.setAccountHolderName(accountHolderName);
            return this;
        }

        /**
         * Set the sortCode property.
         *
         * @param sortCode the sort code
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder sortCode(final String sortCode) {
            bacsBankAccounts.setSortCode(sortCode);
            return this;
        }

        /**
         * Set the lastDigits property.
         *
         * @param lastDigits the last digits
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder lastDigits(final String lastDigits) {
            bacsBankAccounts.setLastDigits(lastDigits);
            return this;
        }


        /**
         * Set the billingAddressId property.
         *
         * @param billingAddressId the billing address id
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder billingAddressId(final Id<Address> billingAddressId) {
            bacsBankAccounts.setBillingAddressId(billingAddressId);
            return this;
        }

        /**
         * Set the paymentToken property.
         *
         * @param paymentToken the payment token
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder paymentToken(final String paymentToken) {
            bacsBankAccounts.setPaymentToken(paymentToken);
            return this;
        }

        /**
         * Set the mandates property.
         *
         * @param mandates the mandates
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder mandates(final List<Mandates> mandates) {
            bacsBankAccounts.setMandates(mandates);
            return this;
        }

        /**
         * Set the profileId property.
         *
         * @param profileId the profile id
         * @return BACSBankAccountBuilder
         */
        public final BACSBankAccountBuilder profileId(final Id<Profile> profileId) {
            bacsBankAccounts.setProfileId(profileId);
            return this;
        }
    }

}
