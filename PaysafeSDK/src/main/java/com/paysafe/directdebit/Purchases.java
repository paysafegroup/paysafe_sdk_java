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
package com.paysafe.directdebit;

import com.google.gson.annotations.Expose;
import com.paysafe.common.Id;
import com.paysafe.common.Error;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;
import com.paysafe.customervault.Status;
import com.paysafe.directdebit.EFT;
// TODO: Auto-generated Javadoc
/**
 * The Class Purchase.
 * @author  bhushan.patil
 * @since 02-03-2016.
 */
public class Purchases implements BaseDomainObject {

    /** The id. */
    private Id<Purchases> id;
    
    /** The merchant ref num. */
    @Expose
    private String merchantRefNum;
    
    /** The amount. */
    @Expose
    private int amount;
    
    /** The ach. */
    @Expose
    private ACH ach;
    
    /** The eft. */
    @Expose
    private EFT eft;
    
    /** The bacs. */
    @Expose
    private BACS bacs;
    
    /** The sepa. */
    @Expose
    private SEPA sepa;
    
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
    
    /** The txn time. */
    @Expose
    private String  txnTime;
    
    /** The currency code. */
    @Expose
    private String currencyCode;
    
    /** The status. */
    @Expose
    private Status status;
    
    /** The error. */
    private Error error;


    /**
     * Gets the id.
     *
     * @return the id
     */
    public Id<Purchases> getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final Id<Purchases> id) {
        this.id = id;
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
     * Gets the amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     *
     * @param amount the new amount
     */
    public void setAmount(final int amount) {
        this.amount = amount;
    }

    /**
     * Gets the ach.
     *
     * @return the ach
     */
    public ACH getAch() {
        return ach;
    }

    /**
     * Sets the ach.
     *
     * @param ach the new ach
     */
    public void setAch(final ACH ach) {
        this.ach = ach;
    }
    
    /**
     * Gets the profile.
     *
     * @return the profile
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * Sets the profile.
     *
     * @param profile the new profile
     */
    public void setProfile(final Profile profile) {
        this.profile = profile;
    }

    /**
     * Gets the billing details.
     *
     * @return the billing details
     */
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the billing details.
     *
     * @param billingDetails the new billing details
     */
    public void setBillingDetails(final BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }
    
    /**
     * Gets the customer ip.
     *
     * @return the customer ip
     */
    public String getCustomerIp() {
        return customerIp;
    }

    /**
     * Sets the customer ip.
     *
     * @param customerIp the new customer ip
     */
    public void setCustomerIp(final String customerIp) {
        this.customerIp = customerIp;
    }

    /**
     * Gets the dup check.
     *
     * @return the dup check
     */
    public Boolean getDupCheck() {
        return dupCheck;
    }

    /**
     * Sets the dup check.
     *
     * @param dupCheck the new dup check
     */
    public void setDupCheck(final Boolean dupCheck) {
        this.dupCheck = dupCheck;
    }

    /**
     * Gets the txn time.
     *
     * @return the txn time
     */
    public String getTxnTime() {
        return txnTime;
    }

    /**
     * Sets the txn time.
     *
     * @param txnTime the new txn time
     */
    public void setTxnTime(final String txnTime) {
        this.txnTime = txnTime;
    }


    /**
     * Gets the currency code.
     *
     * @return the currency code
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     *
     * @param currencyCode the new currency code
     */
    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
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
     * Gets the eft.
     *
     * @return the eft
     */
    public EFT getEft() {
		return eft;
	}

	/**
	 * Sets the eft.
	 *
	 * @param eft the new eft
	 */
	public void setEft(final EFT eft) {
		this.eft = eft;
	}
	
	/**
	 * Gets the bacs.
	 *
	 * @return the bacs
	 */
	public BACS getBacs() {
		return bacs;
	}

	/**
	 * Sets the bacs.
	 *
	 * @param bacs the new bacs
	 */
	public void setBacs(final BACS bacs) {
		this.bacs = bacs;
	}
	
	/**
	 * Gets the sepa.
	 *
	 * @return the sepa
	 */
	public SEPA getSepa() {
		return sepa;
	}

	/**
	 * Sets the sepa.
	 *
	 * @param sepa the new sepa
	 */
	public void setSepa(final SEPA sepa) {
		this.sepa = sepa;
	}
	 /**
     * Get an Purchase builder.
     *
     * @return PurchaseBuilder
     */
    public static final PurchaseBuilder builder() {
        return new PurchaseBuilder();
    }

    /**
     * The builder class for Purchase.
     */
    public static class PurchaseBuilder extends BaseBuilder<Purchases> {

        /** The profile builder. */
        private Profile.ProfileBuilder<PurchaseBuilder> profileBuilder;
        
        /** The billing details builder. */
        private BillingDetails.BillingDetailsBuilder<PurchaseBuilder> billingDetailsBuilder;
        
        /** The ach builder. */
        private ACH.ACHBuilder<PurchaseBuilder> achBuilder;
        
        /** The eft builder. */
        private EFT.EFTBuilder<PurchaseBuilder> eftBuilder;
        
        /** The bacs builder. */
        private BACS.BACSBuilder<PurchaseBuilder> bacsBuilder;
        
        /** The sepa builder. */
        private SEPA.SEPABuilder<PurchaseBuilder> sepaBuilder;
        
        /** The purchases. */
        private final Purchases purchases = new Purchases();

        /**
         * Build this Purchase object.
         *
         * @return Purchase
         */
        @Override
        public final Purchases build() {
            if (null != profileBuilder) {
            	purchases.setProfile(profileBuilder.build());
            }
            if (null != billingDetailsBuilder) {
            	purchases.setBillingDetails(billingDetailsBuilder.build());
            }
            if (null != billingDetailsBuilder) {
            	purchases.setBillingDetails(billingDetailsBuilder.build());
            }
            if (null != achBuilder) {
            	purchases.setAch(achBuilder.build());
            }
            if (null != eftBuilder) {
            	purchases.setEft(eftBuilder.build());
            }
            if (null != bacsBuilder) {
            	purchases.setBacs(bacsBuilder.build());
            }
            if (null != sepaBuilder) {
            	purchases.setSepa(sepaBuilder.build());
            }
            return purchases;
        }

        /**
         * Set the id property.
         *
         * @param id the id
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder id(final Id<Purchases> id) {
        	purchases.setId(id);
            return this;
        }

        /**
         * Set the merchantRefNum property.
         *
         * @param merchantRefNum the merchant ref num
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder merchantRefNum(final String merchantRefNum) {
        	purchases.setMerchantRefNum(merchantRefNum);
            return this;
        }

        /**
         * Set the amount property.
         *
         * @param amount the amount
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder amount(final int amount) {
        	purchases.setAmount(amount);
            return this;
        }

       /**
         * Build a billingDetails within this Purchase.
         *
         * @return BillingDetails.BillingDetailsBuilder< PurchaseBuilder >
         */
        public final BillingDetails.BillingDetailsBuilder<PurchaseBuilder> billingDetails() {
            if (null == billingDetailsBuilder) {
                billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<PurchaseBuilder>(this);
            }
            return billingDetailsBuilder;
        }

        /**
         * Add details from a customer vault address to this BillingDetails object.
         *
         * @param address the address
         * @return PurchaseBuilder
         * //TODO
         */
        public final PurchaseBuilder billingDetails(final com.paysafe.customervault.Address address) {
            billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<PurchaseBuilder>(this, address);
            return this;
        }

        /**
         * Set the customerIp property.
         *
         * @param customerIp the customer ip
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder customerIp(final String customerIp) {
        	purchases.setCustomerIp(customerIp);
            return this;
        }

        /**
         * Set the dupCheck property.
         *
         * @param dupCheck the dup check
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder dupCheck(final Boolean dupCheck) {
        	purchases.setDupCheck(dupCheck);
            return this;
        }

        /**
         * Build an ACH within this Purchase.
         *
         * @return ACH.ACHBuilder< PurchaseBuilder >
         */
        public final ACH.ACHBuilder<PurchaseBuilder> ach() {
            if (null == achBuilder) {
                achBuilder = new ACH.ACHBuilder<PurchaseBuilder>(this);
            }
            return achBuilder;
        }
        
        /**
         * Build an Profile within this Purchase.
         *
         * @return Profile.ProfileBuilder< PurchaseBuilder >
         */
        public final Profile.ProfileBuilder<PurchaseBuilder> profile() {
            if (null == profileBuilder) {
            	profileBuilder = new Profile.ProfileBuilder<PurchaseBuilder>(this);
            }
            return profileBuilder;
        }
        
        /**
         * Build an EFT within this Purchase.
         *
         * @return EFT.EFTBuilder< PurchaseBuilder >
         */
        public final EFT.EFTBuilder<PurchaseBuilder> eft() {
            if (null == eftBuilder) {
            	eftBuilder = new EFT.EFTBuilder<PurchaseBuilder>(this);
            }
            return eftBuilder;
        }
        
        /**
         * Build an BACS within this Purchase.
         *
         * @return BACS.BACSBuilder< PurchaseBuilder >
         */
        public final BACS.BACSBuilder<PurchaseBuilder> bacs() {
            if (null == bacsBuilder) {
            	bacsBuilder = new BACS.BACSBuilder<PurchaseBuilder>(this);
            }
            return bacsBuilder;
        }
        
        /**
         * Build an SEPA within this Purchase.
         *
         * @return SEPA.SEPABuilder< PurchaseBuilder >
         */
        
        public final SEPA.SEPABuilder<PurchaseBuilder> sepa() {
            if (null == sepaBuilder) {
            	sepaBuilder = new SEPA.SEPABuilder<PurchaseBuilder>(this);
            }
            return sepaBuilder;
        }

        /**
         * Set the txnTime property.
         *
         * @param txnTime the txn time
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder txnTime(final String txnTime) {
        	purchases.setTxnTime(txnTime);
            return this;
        }

        /**
         * Set the currencyCode property.
         *
         * @param currencyCode the currency code
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder currencyCode(final String currencyCode) {
        	purchases.setCurrencyCode(currencyCode);
            return this;
        }

        /**
         * Set the error property.
         *
         * @param error the error
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder error(final Error error) {
        	purchases.setError(error);
            return this;
        }

        /**
         * Set the status property.
         *
         * @param status the status
         * @return PurchaseBuilder
         */
        public final PurchaseBuilder status(final Status status) {
        	purchases.setStatus(status);
            return this;
        }
    }
}



