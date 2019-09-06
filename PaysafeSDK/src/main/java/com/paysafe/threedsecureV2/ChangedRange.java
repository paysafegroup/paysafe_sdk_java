package com.paysafe.threedsecureV2;

/**
 * Used by UserAccountDetails.
 */
public enum ChangedRange {
	/**Length of time since the cardholder’s account information with 
	 * the 3DS Requestor was last changed relative to the API call of the current transaction.
	 * */
	DURING_TRANSACTION,
	LESS_THAN_THIRTY_DAYS,
	THIRTY_TO_SIXTY_DAYS,
	MORE_THAN_SIXTY_DAYS

}
