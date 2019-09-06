package com.paysafe.threedsecureV2;

/**
 * Used by Authentications.
 */
public enum TransactionIntent {
	/**Identifies the type of transaction being authenticated.*/
	GOODS_OR_SERVICE_PURCHASE,
	CHECK_ACCEPTANCE, 
	ACCOUNT_FUNDING, 
	QUASI_CASH_TRANSACTION, 
	PREPAID_ACTIVATION 
}
