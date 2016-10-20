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
public class SEPA implements DomainObject {
    
    /** The payment token. */
    @Expose
    private String paymentToken;
    
    /** The mandate reference. */
    @Expose
    private String mandateReference;
    
    /** The account holder name. */
    @Expose
    private String accountHolderName;
    
    /** The iban. */
    @Expose
    private String iban;
    
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
     * The sub-builder class for SEPA.
     *
     * @param <BLDRT> the parent builder
     */
    public static class SEPABuilder<BLDRT extends GenericBuilder>
            extends NestedBuilder<SEPA, BLDRT> {

        /** The sepa. */
        private final SEPA SEPA = new SEPA();

        /**
         * Instantiates a new SEPA builder.
         *
         * @param parent the parent
         */
        public SEPABuilder(final BLDRT parent) {
            super(parent);
        }

        /**
         * Build this SEPA object.
         *
         * @return SEPA
         */
        @Override
        public final SEPA build() {
            return SEPA;
        }

        /**
         * Set the paymentToken property.
         *
         * @param paymentToken the payment token
         * @return SEPABuilder< BLDRT >
         */
        public final SEPABuilder<BLDRT> paymentToken(final String paymentToken) {
        	SEPA.setPaymentToken(paymentToken);
            return this;
        }
        
        /**
         * Set the mandateReference property.
         *
         * @param mandateReference the mandate reference
         * @return SEPABuilder< BLDRT >
         */
        public final SEPABuilder<BLDRT> mandateReference(final String mandateReference) {
        	SEPA.setMandateReference(mandateReference);
            return this;
        }
        
        /**
         * Set the accountHolderName property.
         *
         * @param accountHolderName the account holder name
         * @return SEPABuilder< BLDRT >
         */
        public final SEPABuilder<BLDRT> accountHolderName(final String accountHolderName) {
        	SEPA.setAccountHolderName(accountHolderName);
            return this;
        }
        
        /**
         * Set the iban property.
         *
         * @param iban the iban
         * @return SEPABuilder< BLDRT >
         */
        public final SEPABuilder<BLDRT> iban(final String iban) {
        	SEPA.setIban(iban);
            return this;
        }
        
        /**
         * Set the lastDigits property.
         *
         * @param lastDigits the last digits
         * @return SEPABuilder< BLDRT >
         */
        public final SEPABuilder<BLDRT> lastDigits(final String lastDigits) {
        	SEPA.setLastDigits(lastDigits);
            return this;
        }
        
    }

}
