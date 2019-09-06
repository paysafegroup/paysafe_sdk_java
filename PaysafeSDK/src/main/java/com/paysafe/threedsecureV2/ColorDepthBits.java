package com.paysafe.threedsecureV2;

import com.google.gson.annotations.SerializedName;

/**
 * Used by BrowserDetails.
 */
public enum ColorDepthBits {
	/**Value representing the bit depth of the colour palette for displaying images,
	 *  in bits per pixel.
	 */
	@SerializedName("1")
	ONE,
	@SerializedName("4")
	FOUR,
	@SerializedName("8")
	EIGHT,
	@SerializedName("15")
	FIFTEEN,
	@SerializedName("16")
	SIXTEEN,
	@SerializedName("24")
	TWENTY_FOUR,
	@SerializedName("32")
	THIRTY_TWO,
	@SerializedName("48")
	FOURTY_EIGHT
}
