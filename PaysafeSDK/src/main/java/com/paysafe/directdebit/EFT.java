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
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class EFT.
 * @author bhushan.patil
 * @since 04-04-2016.
 */
public class EFT implements DomainObject {
    
    /** The payment token. */
    @Expose
    private String paymentToken;
    
    /** The payment descriptor. */
    @Expose
    private String paymentDescriptor;
    
    /** The account holder name. */
    @Expose
    private String accountHolderName;
    
    /** The transit number. */
    @Expose
    private String transitNumber;
    
    /** The institution id. */
    @Expose
    private String institutionId; 
   	
	   /** The last digits. */
	   @Expose
    private String lastDigits; 
    
    /** The account number. */
    @Expose
    private String accountNumber; 
    
	
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
     * Gets the payment descriptor.
     *
     * @return the payment descriptor
     */
    public String getPaymentDescriptor() {
        return paymentDescriptor;
    }

    /**
     * Sets the payment descriptor.
     *
     * @param paymentDescriptor the new payment descriptor
     */
    public void setPaymentDescriptor(final String paymentDescriptor) {
        this.paymentDescriptor = paymentDescriptor;
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
 	 * Gets the institution id.
 	 *
 	 * @return the institution id
 	 */
 	public String getInstitutionId() {
			return institutionId;
	}

	/**
	 * Sets the institution id.
	 *
	 * @param institutionId the new institution id
	 */
	public void setInstitutionId(final String institutionId) {
			this.institutionId = institutionId;
	}
	
	/**
	 * Gets the transit number.
	 *
	 * @return the transit number
	 */
	public String getTransitNumber() {
			return transitNumber;
	}

	/**
	 * Sets the transit number.
	 *
	 * @param transitNumber the new transit number
	 */
	public void setTransitNumber(final String transitNumber) {
			this.transitNumber = transitNumber;
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
     * The sub-builder class for EFT.
     *
     * @param <BLDRT> the parent builder
     */
    public static class EFTBuilder<BLDRT extends GenericBuilder>
            extends NestedBuilder<EFT, BLDRT> {

        /** The eft. */
        private final EFT eft = new EFT();

        /**
         * Instantiates a new EFT builder.
         *
         * @param parent the parent
         */
        public EFTBuilder(final BLDRT parent) {
            super(parent);
        }

        /**
         * Build this EFT object.
         *
         * @return EFT
         */
        @Override
        public final EFT build() {
            return eft;
        }

        /**
         * Set the paymentToken property.
         *
         * @param paymentToken the payment token
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> paymentToken(final String paymentToken) {
            eft.setPaymentToken(paymentToken);
            return this;
        }
        
        /**
         * Set the paymentDescriptor property.
         *
         * @param paymentDescriptor the payment descriptor
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> paymentDescriptor(final String paymentDescriptor) {
            eft.setPaymentDescriptor(paymentDescriptor);
            return this;
        }
        
        /**
         * Set the accountHolderName property.
         *
         * @param accountHolderName the account holder name
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> accountHolderName(final String accountHolderName) {
            eft.setAccountHolderName(accountHolderName);
            return this;
        }
        
        /**
         * Set the accountNumber property.
         *
         * @param accountNumber the account number
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> accountNumber(final String accountNumber) {
            eft.setAccountNumber(accountNumber);
            return this;
        }
        
        /**
         * Set the transitNumber property.
         *
         * @param transitNumber the transit number
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> transitNumber(final String transitNumber) {
            eft.setTransitNumber(transitNumber);
            return this;
        }
        
        /**
         * Set the institutionId property.
         *
         * @param institutionId the institution id
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> institutionId(final String institutionId) {
            eft.setInstitutionId(institutionId);
            return this;
        }
        
        /**
         * Set the lastDigits property.
         *
         * @param lastDigits the last digits
         * @return EFTBuilder< BLDRT >
         */
        public final EFTBuilder<BLDRT> lastDigits(final String lastDigits) {
            eft.setLastDigits(lastDigits);
            return this;
        }
        
        
       
    }

}
