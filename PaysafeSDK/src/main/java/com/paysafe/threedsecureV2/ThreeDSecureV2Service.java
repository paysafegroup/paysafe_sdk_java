package com.paysafe.threedsecureV2;

import java.io.IOException;
import com.paysafe.PaysafeApiClient;
import com.paysafe.common.Id;
import com.paysafe.common.PaysafeException;
import com.paysafe.common.impl.Request;

public class ThreeDSecureV2Service {

	private final PaysafeApiClient client;

	private static final String URI = "threedsecure/v2/accounts/";

	private static final String AUTH_PATH = "/authentications";

	private static final String URI_SEPARATOR = "/";

	public ThreeDSecureV2Service(final PaysafeApiClient client) {
		this.client = client;
	}

	private String prepareUri(final String path) throws PaysafeException {
		if (null == client.getAccount()) {
			throw new PaysafeException("Missing or inavalid account");
		}
		return URI + client.getAccount() + path;
	}

	public final Authentications submit(final Authentications authentications) throws IOException, PaysafeException {
		final Request request = Request.builder().uri(prepareUri(AUTH_PATH)).method(Request.RequestType.POST)
				.body(authentications).build();
		return client.processRequest(request, Authentications.class);
	}

	public final Authentications getAuthenticationV2(final Id<Authentications> id)
			throws IOException, PaysafeException {
		final Request request = Request.builder().uri(prepareUri(AUTH_PATH + URI_SEPARATOR + id))
				.method(Request.RequestType.GET).build();
		return client.processRequest(request, Authentications.class);
	}
}
