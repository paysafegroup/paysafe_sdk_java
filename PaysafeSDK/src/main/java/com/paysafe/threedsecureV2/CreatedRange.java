package com.paysafe.threedsecureV2;

/**
 * Used by PaymentAccountDetails from UserAccountDetails.
 */
public enum CreatedRange {
	/** Length of time that the cardholder has had the account with the 3DS Requestor.*/
	NO_ACCOUNT,
	DURING_TRANSACTION,
	LESS_THAN_THIRTY_DAYS,
	THIRTY_TO_SIXTY_DAYS,
	MORE_THAN_SIXTY_DAYS
}
