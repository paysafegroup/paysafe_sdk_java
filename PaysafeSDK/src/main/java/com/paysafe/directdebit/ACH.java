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
import com.paysafe.common.*;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;
import com.paysafe.customervault.AccountType;

// TODO: Auto-generated Javadoc
/**
 * The Class ACH.
 * @author bhushan.patil
 * @since 04-04-2016. 
 */
public class ACH implements DomainObject {
    
    /** The payment token. */
    @Expose
    private String paymentToken;
    
    /** The pay method. */
    @Expose
    private PayMethod payMethod;
    
    /** The payment descriptor. */
    @Expose
    private String paymentDescriptor;
    
    /** The account holder name. */
    @Expose
    private String accountHolderName;
    
    /** The account type. */
    @Expose
    private AccountType accountType;
    
    /** The account number. */
    @Expose
    private String accountNumber;
   	
	   /** The routing number. */
	   @Expose
    private String routingNumber;
   	
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
     * Gets the pay method.
     *
     * @return the pay method
     */
    public PayMethod getPayMethod() {
        return payMethod;
    }

    /**
     * Sets the pay method.
     *
     * @param payMethod the new pay method
     */
    public void setPayMethod(final PayMethod payMethod) {
        this.payMethod = payMethod;
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
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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
     * The sub-builder class for ACH.
     *
     * @param <BLDRT> the parent builder
     */
    public static class ACHBuilder<BLDRT extends GenericBuilder>
            extends NestedBuilder<ACH, BLDRT> {

        /** The ach. */
        private final ACH ACH = new ACH();

        /**
         * Instantiates a new ACH builder.
         *
         * @param parent the parent
         */
        public ACHBuilder(final BLDRT parent) {
            super(parent);
        }

        /**
         * Build this ACH object.
         *
         * @return ACH
         */
        @Override
        public final ACH build() {
            return ACH;
        }

        /**
         * Set the paymentToken property.
         *
         * @param paymentToken the payment token
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> paymentToken(final String paymentToken) {
            ACH.setPaymentToken(paymentToken);
            return this;
        }
        
        /**
         * Set the payMethod property.
         *
         * @param payMethod the pay method
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> payMethod(final PayMethod payMethod) {
            ACH.setPayMethod(payMethod);
            return this;
        }

        /**
         * Set the paymentDescriptor property.
         *
         * @param paymentDescriptor the payment descriptor
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> paymentDescriptor(final String paymentDescriptor) {
            ACH.setPaymentDescriptor(paymentDescriptor);
            return this;
        }
        
        /**
         * Set the accountHolderName property.
         *
         * @param accountHolderName the account holder name
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> accountHolderName(final String accountHolderName) {
            ACH.setAccountHolderName(accountHolderName);
            return this;
        }
        
        /**
         * Set the accountType property.
         *
         * @param accountType the account type
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> accountType(final AccountType accountType) {
            ACH.setAccountType(accountType);
            return this;
        }
        
        /**
         * Set the accountNumber property.
         *
         * @param accountNumber the account number
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> accountNumber(final String accountNumber) {
            ACH.setAccountNumber(accountNumber);
            return this;
        }
        
        /**
         * Set the routingNumber property.
         *
         * @param routingNumber the routing number
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> routingNumber(final String routingNumber) {
            ACH.setRoutingNumber(routingNumber);
            return this;
        }
        
        /**
         * Set the lastDigits property.
         *
         * @param lastDigits the last digits
         * @return ACHBuilder< BLDRT >
         */
        public final ACHBuilder<BLDRT> lastDigits(final String lastDigits) {
            ACH.setLastDigits(lastDigits);
            return this;
        }
        
                
    }

}
