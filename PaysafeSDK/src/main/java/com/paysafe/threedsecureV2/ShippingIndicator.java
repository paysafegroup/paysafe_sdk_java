package com.paysafe.threedsecureV2;

/**
 * Used by OrderItemDetails.
 */
public enum ShippingIndicator {
	/**Indicates shipping method chosen for the transaction.*/ 
	SHIP_TO_BILLING_ADDRESS,
	SHIP_TO_VERIFIED_ADDRESS,
	SHIP_TO_DIFFERENT_ADDRESS,
	SHIP_TO_STORE,
	DIGITAL_GOODS,
	TRAVEL_AND_EVENT_TICKETS,
	OTHER
}
