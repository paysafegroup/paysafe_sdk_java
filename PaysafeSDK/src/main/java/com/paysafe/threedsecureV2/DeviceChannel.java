package com.paysafe.threedsecureV2;

import com.google.gson.annotations.SerializedName;

/**
 * Used by Authentications.
 */
public enum DeviceChannel {
	
	/**Indicates the type of channel interface being used to initiate the transaction.*/
	BROWSER,
	SDK,
	@SerializedName("3RI")
	THREE_RI
}
