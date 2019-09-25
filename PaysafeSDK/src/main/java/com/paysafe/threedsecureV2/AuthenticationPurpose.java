package com.paysafe.threedsecureV2;

/**
 * Used by Authentications.
 */
public enum AuthenticationPurpose {
	/**Indicates the type of Authentication request.
	 *  This data element provides additional information to the ACS 
	 *  to determine the best approach for handing an authentication request.
	 */ 
	PAYMENT_TRANSACTION,
	RECURRING_TRANSACTION,
	INSTALMENT_TRANSACTION,
	ADD_CARD,
	MAINTAIN_CARD,
	EMV_TOKEN_VERIFICATION
}
