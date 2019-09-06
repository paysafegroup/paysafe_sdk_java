package com.paysafe.threedsecureV2;

/**
 * Used by ShippingDetailsUsage from UserAccountDetails.
 */
public enum InitialUsageRange {
	
	/**Indicates when the shipping address used for this transaction 
	 * was first used with the 3DS Requestor.
	 */
	CURRENT_TRANSACTION,
	LESS_THAN_THIRTY_DAYS,
	THIRTY_TO_SIXTY_DAYS,
	MORE_THAN_SIXTY_DAYS
}
