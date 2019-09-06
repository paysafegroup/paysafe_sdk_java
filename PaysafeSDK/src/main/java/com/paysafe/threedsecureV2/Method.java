package com.paysafe.threedsecureV2;

/** Used by PriorThreeDSAuthentication from UserAccountDetails */
public enum Method {

	/**Mechanism used by the Cardholder to 
	 * previously authenticate to the 3DS Requestor.
	 * */
	FRICTIONLESS_AUTHENTICATION,
	ACS_CHALLENGE,
	AVS_VERIFIED,
	OTHER_ISSUER_METHOD
}
