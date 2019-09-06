package com.paysafe.threedsecureV2;

public enum KycStatus {
	/*This is the kyc status of the consumer at the merchant.*/
	UNVERIFIED,// - consumer details are not verified
	PARTIALLY_VERIFIED,// - some consumer details are verified - e.g only name and dob
	VERIFIED //- consumer is fully verified - name, dob, address, phone, email

}
