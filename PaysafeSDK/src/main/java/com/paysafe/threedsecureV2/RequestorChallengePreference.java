package com.paysafe.threedsecureV2;
/**
 * Used by Authentications.
 */
public enum RequestorChallengePreference {
	/**Indicates whether a challenge is requested for this transaction.*/ 
	NO_PREFERENCE,
	CHALLENGE_REQUESTED,
	CHALLENGE_MANDATED
}
