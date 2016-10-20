package com.paysafe.customervault;

import com.google.gson.annotations.SerializedName;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountType.
 * used by create bank account
 * @author manisha.rani
 * @since   25-02-2016. 
 */
public enum AccountType {

    /** The checking. */
    @SerializedName("CHECKING")
    CHECKING,
    
    /** The loan. */
    @SerializedName("LOAN")
    LOAN,
    
    /** The savings. */
    @SerializedName("SAVINGS")
    SAVINGS
}