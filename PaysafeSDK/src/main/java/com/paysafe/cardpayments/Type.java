package com.paysafe.cardpayments;

public enum Type {

	ADHOC,// – Ad hoc consumer-initiated request
	TOPUP,// – Unscheduled merchant-iniitated request when a consumer balance is below a set limit 
	RECURRING, // – Scheduled merchant-initiated recurring request
	
	MC,
	VI,
	AM
}
