package com.paysafe.threedsecureV2;
/**
 * Used by UserLogin from UserAccountDetails.
 */
public enum AuthenticationMethod {
	/**Mechanism used by the Cardholder to authenticate to the 3DS Requestor.
	 * */
	NO_LOGIN,
	INTERNAL_CREDENTIALS,
	FEDERATED_ID,
	ISSUER_CREDENTIALS,
	THIRD_PARTY_AUTHENTICATION,
	FIDO_AUTHENTICATOR
}
