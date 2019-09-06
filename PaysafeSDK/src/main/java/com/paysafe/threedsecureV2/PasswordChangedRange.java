package com.paysafe.threedsecureV2;

/**
 * Used by UserAccountDetails.
 */
public enum PasswordChangedRange {
	/**Indicates the length of time since the cardholder’s account with the 3DS Requestor 
	 * had a password change or account reset relative to the API call of the current transaction.
	 * */
	NO_CHANGE,
	DURING_TRANSACTION,
	LESS_THAN_THIRTY_DAYS,
	THIRTY_TO_SIXTY_DAYS,
	MORE_THAN_SIXTY_DAYS
}
