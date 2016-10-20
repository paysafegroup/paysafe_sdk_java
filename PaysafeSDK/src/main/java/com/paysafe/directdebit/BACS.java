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
 * The Class BACS.
 * @author bhushan.patil
 * @since 04-04-2016.
 */
public class BACS implements DomainObject {
    
    /** The payment token. */
    @Expose
    private String paymentToken;
    
    /** The account holder name. */
    @Expose
    private String accountHolderName;
    
    /** The sort code. */
    @Expose
    private String sortCode;
    
    /** The account number. */
    @Expose
    private String accountNumber;
    
    /** The mandate reference. */
    @Expose
    private String mandateReference;
    
    /** The last digits. */
    @Expose
    private String lastDigits;
    	
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
	 * Gets the mandate reference.
	 *
	 * @return the mandate reference
	 */
	public String getMandateReference() {
		return mandateReference;
	}

	/**
	 * Sets the mandate reference.
	 *
	 * @param mandateReference the new mandate reference
	 */
	public void setMandateReference(final String mandateReference) {
		this.mandateReference = mandateReference;
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
     * The sub-builder class for BACS.
     *
     * @param <BLDRT> the parent builder
     */
    public static class BACSBuilder<BLDRT extends GenericBuilder>
            extends NestedBuilder<BACS, BLDRT> {

        /** The bacs. */
        private final BACS BACS = new BACS();

        /**
         * Instantiates a new BACS builder.
         *
         * @param parent the parent
         */
        public BACSBuilder(final BLDRT parent) {
            super(parent);
        }

        /**
         * Build this BACS object.
         *
         * @return BACS
         */
        @Override
        public final BACS build() {
            return BACS;
        }

        /**
         * Set the paymentToken property.
         *
         * @param paymentToken the payment token
         * @return BACSBuilder< BLDRT >
         */
        public final BACSBuilder<BLDRT> paymentToken(final String paymentToken) {
            BACS.setPaymentToken(paymentToken);
            return this;
        }
        
        /**
         * Set the accountHolderName property.
         *
         * @param accountHolderName the account holder name
         * @return BACSBuilder< BLDRT >
         */
        public final BACSBuilder<BLDRT> accountHolderName(final String accountHolderName) {
            BACS.setAccountHolderName(accountHolderName);
            return this;
        }
        
        /**
         * Set the sortCode property.
         *
         * @param sortCode the sort code
         * @return BACSBuilder< BLDRT >
         */
        public final BACSBuilder<BLDRT> sortCode(final String sortCode) {
            BACS.setSortCode(sortCode);
            return this;
        }
        
        /**
         * Set the accountNumber property.
         *
         * @param accountNumber the account number
         * @return BACSBuilder< BLDRT >
         */
        public final BACSBuilder<BLDRT> accountNumber(final String accountNumber) {
            BACS.setAccountNumber(accountNumber);
            return this;
        }
        
        /**
         * Set the mandateReference property.
         *
         * @param mandateReference the mandate reference
         * @return BACSBuilder< BLDRT >
         */
        public final BACSBuilder<BLDRT> mandateReference(final String mandateReference) {
            BACS.setMandateReference(mandateReference);
            return this;
        }
        
        /**
         * Set the lastDigits property.
         *
         * @param lastDigits the last digits
         * @return BACSBuilder< BLDRT >
         */
        public final BACSBuilder<BLDRT> lastDigits(final String lastDigits) {
            BACS.setLastDigits(lastDigits);
            return this;
        }
        
        
    }

}
