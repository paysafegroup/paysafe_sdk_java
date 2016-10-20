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

import java.util.ArrayList;


import com.google.gson.annotations.Expose;
import com.paysafe.common.Id;
import com.paysafe.common.Error;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;
import com.paysafe.customervault.Status;

// TODO: Auto-generated Javadoc
/**
 * The Class StandaloneCredits.
 * @author deepika.mishra
 * @since 01-04-2016.
 */

public class StandaloneCredits implements BaseDomainObject {

    /** The id. */
    private Id<StandaloneCredits> id;
    
    /** The merchant ref num. */
    @Expose
    private String merchantRefNum;
    
    /** The amount. */
    @Expose
    private Integer amount;
    
    /** The ach. */
    @Expose
    private ACH ach;
    
    /** The achs. */
    @Expose
    private ArrayList<ACH> achs;
    
    /** The eft. */
    @Expose
    private EFT eft;
    
    /** The efts. */
    @Expose
    private ArrayList<EFT> efts;
    
    /** The bacs. */
    @Expose
    private BACS bacs;
    
    /** The bacss. */
    @Expose
    private ArrayList<BACS> bacss;
    
    
	/** The profile. */
	@Expose
    private Profile profile;
    
    /** The billing details. */
    @Expose
    private BillingDetails billingDetails;
    
    /** The shipping details. */
    @Expose
    private ShippingDetails shippingDetails;
    
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
    public Id<StandaloneCredits> getId() {
        return id;
    }
    
    /**
     * Gets the pageable array key.
     *
     * @return the pageable array key
     */
    public static String getPageableArrayKey()
    {
        return "standaloneCredits";
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final Id<StandaloneCredits> id) {
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
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     *
     * @param amount the new amount
     */
    public void setAmount(final Integer amount) {
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
     * Gets the achs.
     *
     * @return the achs
     */
    public final ArrayList<ACH> getAchs() {
		return achs;
	}

	/**
	 * Sets the achs.
	 *
	 * @param achs the new achs
	 */
	public final void setAchs(ArrayList<ACH> achs) {
		this.achs = achs;
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
     * Gets the shipping details.
     *
     * @return the shipping details
     */
    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the shipping details.
     *
     * @param shippingDetails the new shipping details
     */
    public void setShippingDetails(final ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
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
    public void setError(Error error) {
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
	public void setEft(EFT eft) {
		this.eft = eft;
	}
	
	/**
	 * Gets the efts.
	 *
	 * @return the efts
	 */
	public ArrayList<EFT> getEfts() {
		return efts;
	}

	/**
	 * Sets the efts.
	 *
	 * @param efts the new efts
	 */
	public void setEfts(ArrayList<EFT> efts) {
		this.efts = efts;
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
	public void setBacs(BACS bacs) {
		this.bacs = bacs;
	}
	
	/**
	 * Gets the bacss.
	 *
	 * @return the bacss
	 */
	public ArrayList<BACS> getBacss() {
		return bacss;
	}

	/**
	 * Sets the bacss.
	 *
	 * @param bacss the new bacss
	 */
	public void setBacss(ArrayList<BACS> bacss) {
		this.bacss = bacss;
	}
	


    /**
     * Get an StandaloneCredits builder.
     *
     * @return StandaloneCreditsBuilder
     */
    public static final StandaloneCreditsBuilder builder() {
        return new StandaloneCreditsBuilder();
    }

    /**
     * The builder class for StandaloneCredits.
     */
    public static class StandaloneCreditsBuilder extends BaseBuilder<StandaloneCredits> {

        /** The profile builder. */
        private Profile.ProfileBuilder<StandaloneCreditsBuilder> profileBuilder;
        
        /** The billing details builder. */
        private BillingDetails.BillingDetailsBuilder<StandaloneCreditsBuilder> billingDetailsBuilder;
        
        /** The shipping details builder. */
        private ShippingDetails.ShippingDetailsBuilder<StandaloneCreditsBuilder> shippingDetailsBuilder;
        
        /** The ach builder. */
        private ACH.ACHBuilder<StandaloneCreditsBuilder> achBuilder;
        
        /** The eft builder. */
        private EFT.EFTBuilder<StandaloneCreditsBuilder> eftBuilder;
        
        /** The bacs builder. */
        private BACS.BACSBuilder<StandaloneCreditsBuilder> bacsBuilder;

        /** The standalonecredits. */
        private final StandaloneCredits standalonecredits = new StandaloneCredits();

        /**
         * Build this StandaloneCredits object.
         *
         * @return standalonecredits
         */
        @Override
        public final StandaloneCredits build() {
            if (null != profileBuilder) {
            	standalonecredits.setProfile(profileBuilder.build());
            }
            if (null != billingDetailsBuilder) {
            	standalonecredits.setBillingDetails(billingDetailsBuilder.build());
            }
            if (null != shippingDetailsBuilder) {
            	standalonecredits.setShippingDetails(shippingDetailsBuilder.build());
            }
            if (null != achBuilder) {
            	standalonecredits.setAch(achBuilder.build());
            }
            if (null != eftBuilder) {
            	standalonecredits.setEft(eftBuilder.build());
            }
            if (null != bacsBuilder) {
            	standalonecredits.setBacs(bacsBuilder.build());
            }
            
            return standalonecredits;
        }

        /**
         * Set the id property.
         *
         * @param id the id
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder id(final Id<StandaloneCredits> id) {
        	standalonecredits.setId(id);
            return this;
        }

        /**
         * Set the merchantRefNum property.
         *
         * @param merchantRefNum the merchant ref num
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder merchantRefNum(final String merchantRefNum) {
        	standalonecredits.setMerchantRefNum(merchantRefNum);
            return this;
        }

        /**
         * Set the amount property.
         *
         * @param amount the amount
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder amount(final Integer amount) {
        	standalonecredits.setAmount(amount);
            return this;
        }



        /**
         * Build a billingDetails within this standalonecredits.
         *
         * @return BillingDetails.BillingDetailsBuilder< StandaloneCreditsBuilder >
         */
        public final BillingDetails.BillingDetailsBuilder<StandaloneCreditsBuilder> billingDetails() {
            if (null == billingDetailsBuilder) {
                billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<StandaloneCreditsBuilder>(this);
            }
            return billingDetailsBuilder;
        }
        
        /**
         * Add details from a customer vault address to this BillingDetails object.
         *
         * @param a the a
         * @return StandaloneCreditsBuilder
         * //TODO
         */
        public final StandaloneCreditsBuilder billingDetails(final com.paysafe.customervault.Address a) {
            billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<StandaloneCreditsBuilder>(this, a);
            return this;
        }
        
        /**
         * Build a shippingDetails within this standalonecredits.
         *
         * @return ShippingDetails.ShippingDetailsBuilder< StandaloneCreditsBuilder >
         */
        public final ShippingDetails.ShippingDetailsBuilder<StandaloneCreditsBuilder> shippingDetails() {
            if (null == shippingDetailsBuilder) {
            	shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<StandaloneCreditsBuilder>(this);
            }
            return shippingDetailsBuilder;
        }
        
        /**
         * Add details from a customer vault address to this shippingDetails object.
         *
         * @param a the a
         * @return StandaloneCreditsBuilder
         * //TODO
         */
        public final StandaloneCreditsBuilder shippingDetails(final com.paysafe.customervault.Address a) {
        	shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<StandaloneCreditsBuilder>(this, a);
            return this;
        }

        /**
         * Set the customerIp property.
         *
         * @param customerIp the customer ip
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder customerIp(final String customerIp) {
        	standalonecredits.setCustomerIp(customerIp);
            return this;
        }

        /**
         * Set the dupCheck property.
         *
         * @param dupCheck the dup check
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder dupCheck(final Boolean dupCheck) {
        	standalonecredits.setDupCheck(dupCheck);
            return this;
        }

        /**
         * Build an ACH within this standalonecredits.
         *
         * @return ACH.ACHBuilde< StandaloneCreditsBuilder >
         */
        public final ACH.ACHBuilder<StandaloneCreditsBuilder> ach() {
            if (null == achBuilder) {
                achBuilder = new ACH.ACHBuilder<StandaloneCreditsBuilder>(this);
            }
            return achBuilder;
        }
        /**
         * Build an Profile within this standalonecredits.
         *
         * @return Profile.ProfileBuilder< StandaloneCreditsBuilder >
         */
        public final Profile.ProfileBuilder<StandaloneCreditsBuilder> profile() {
            if (null == profileBuilder) {
            	profileBuilder = new Profile.ProfileBuilder<StandaloneCreditsBuilder>(this);
            }
            return profileBuilder;
        }
        /**
         * Build an EFT within this standalonecredits.
         *
         * @return EFT.EFTBuilder< StandaloneCreditsBuilder >
         */
        public final EFT.EFTBuilder<StandaloneCreditsBuilder> eft() {
            if (null == eftBuilder) {
            	eftBuilder = new EFT.EFTBuilder<StandaloneCreditsBuilder>(this);
            }
            return eftBuilder;
        }
        /**
         * Build an BACS within this standalonecredits.
         *
         * @return BACS.BACSBuilder< StandaloneCreditsBuilder >
         */
        public final BACS.BACSBuilder<StandaloneCreditsBuilder> bacs() {
            if (null == bacsBuilder) {
            	bacsBuilder = new BACS.BACSBuilder<StandaloneCreditsBuilder>(this);
            }
            return bacsBuilder;
        }
        

        /**
         * Set the txnTime property.
         *
         * @param txnTime the txn time
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder txnTime(final String txnTime) {
        	standalonecredits.setTxnTime(txnTime);
            return this;
        }

        /**
         * Set the currencyCode property.
         *
         * @param currencyCode the currency code
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder currencyCode(final String currencyCode) {
        	standalonecredits.setCurrencyCode(currencyCode);
            return this;
        }

        /**
         * Set the error property.
         *
         * @param error the error
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder error(final Error error) {
        	standalonecredits.setError(error);
            return this;
        }

        /**
         * Set the status property.
         *
         * @param status the status
         * @return StandaloneCreditsBuilder
         */
        public final StandaloneCreditsBuilder status(final Status status) {
        	standalonecredits.setStatus(status);
            return this;
        }
    }
}



