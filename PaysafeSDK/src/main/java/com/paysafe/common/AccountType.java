package com.paysafe.common;

import com.google.gson.annotations.SerializedName;

// TODO: Auto-generated Javadoc
/**
 * Created by manisha.rani on 25-02-2016.
 * used by create bank account
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