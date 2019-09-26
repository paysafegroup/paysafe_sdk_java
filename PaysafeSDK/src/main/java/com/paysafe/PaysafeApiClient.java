/*
 * Copyright (c) 2016 Paysafe
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.paysafe;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paysafe.cardpayments.CardPaymentsService;
import com.paysafe.common.ApiException;
import com.paysafe.common.EntityNotFoundException;
import com.paysafe.common.Id;
import com.paysafe.common.InvalidCredentialsException;
import com.paysafe.common.InvalidRequestException;
import com.paysafe.common.PaysafeException;
import com.paysafe.common.PermissionException;
import com.paysafe.common.RequestConflictException;
import com.paysafe.common.RequestDeclinedException;
import com.paysafe.common.impl.AddressContainer;
import com.paysafe.common.impl.AddressContainerAdapter;
import com.paysafe.common.impl.BaseDomainObject;
import com.paysafe.common.impl.BooleanAdapter;
import com.paysafe.common.impl.IdAdapter;
import com.paysafe.common.impl.Request;
import com.paysafe.customervault.CustomerVaultService;
import com.paysafe.directdebit.DirectDebitService;
import com.paysafe.threedsecure.ThreeDSecureService;
import com.paysafe.threedsecureV2.ThreeDSecureV2Service;

/**
 * The Class PaysafeApiClient.
 */
public class PaysafeApiClient {

	/**
	 * The api end point.
	 */
	private final String apiEndPoint;

	/**
	 * The environment.
	 */
	private final Environment environment;

	/**
	 * The key id.
	 */
	private final String keyId;

	/**
	 * The key password.
	 */
	private final String keyPassword;

	/**
	 * The account number.
	 */
	private String accountNumber;

	/**
	 * The CardPaymentsService.
	 */
	private CardPaymentsService cardPaymentService;

	/**
	 * The CustomerVaultService.
	 */
	private CustomerVaultService customerVaultService;

	/**
	 * The DirectDebitService.
	 */
	private DirectDebitService directDebitService;

	/**
	 * The ThreeDSecureService.
	 */
	private ThreeDSecureService threeDSecureService;

	/**
	 * The ThreeDSV2Service.
	 */
	private ThreeDSecureV2Service threeDSV2Service;
	/**
	 * The gson object used to deserialize the api response.
	 */
	private final Gson gsonDeserializer;

	/**
	 * Instantiates a new paysafe API client.
	 *
	 * @param keyId the key id
	 *            
	 * @param keyPassword the key password
	 *            
	 * @param environment the environment
	 *           
	 */
	public PaysafeApiClient(final String keyId, final String keyPassword, final Environment environment) {
		this.keyId = keyId;
		this.keyPassword = keyPassword;
		this.environment = environment;
		apiEndPoint = this.environment.getUrl();
		final GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeHierarchyAdapter(AddressContainer.class, new AddressContainerAdapter());
		gsonBuilder.registerTypeHierarchyAdapter(Boolean.class, new BooleanAdapter());
		gsonBuilder.registerTypeHierarchyAdapter(Id.class, new IdAdapter());
		gsonDeserializer = gsonBuilder.create();
	}

	/**
	 * Instantiates a new paysafe API client.
	 *
	 * @param keyId the key id
	 *            
	 * @param keyPassword the key password
	 *            
	 * @param environment the environment
	 *            
	 * @param account the account number
	 *           
	 */
	public PaysafeApiClient(final String keyId, final String keyPassword, final Environment environment,
			final String account) {
		this(keyId, keyPassword, environment);
		this.setAccount(account);
	}

	/**
	 * Card payment service.
	 *
	 * @return the card payment service
	 */
	public final CardPaymentsService cardPaymentService() {
		if (null == cardPaymentService) {
			cardPaymentService = new CardPaymentsService(this);
		}
		return cardPaymentService;
	}

	/**
	 * Customer vault service.
	 *
	 * @return the customer vault service
	 */
	public final CustomerVaultService customerVaultService() {
		if (null == customerVaultService) {
			customerVaultService = new CustomerVaultService(this);
		}
		return customerVaultService;
	}

	/**
	 * directDebitService.
	 *
	 * @return the directDebitService
	 */

	public final DirectDebitService directDebitService() {
		if (null == directDebitService) {
			directDebitService = new DirectDebitService(this);
		}
		return directDebitService;
	}

	/**
	 * ThreeD Secure Service.
	 *
	 * @return the ThreeD Secure Service
	 */
	public final ThreeDSecureService threeDSecureService() {
		if (null == threeDSecureService) {
			threeDSecureService = new ThreeDSecureService(this);
		}
		return threeDSecureService;
	}

	/**
	 * ThreeD SecureV2 Service.
	 *
	 * @return the ThreeDV2 Secure Service
	 */

	public final ThreeDSecureV2Service threeDSecureV2Service() {
		if (threeDSV2Service == null) {
			threeDSV2Service = new ThreeDSecureV2Service(this);
		}
		return threeDSV2Service;
	}

	/**
	 * Process error.
	 *
	 * @param code the response code
	 *            
	 * @param obj the obj
	 *             
	 * @param cause the original exception
	 *            
	 * @return the exception
	 */
	private PaysafeException getException(final int code, final BaseDomainObject obj, final IOException cause) {
		switch (code) {
		case 400:
			return new InvalidRequestException(obj, cause);
		case 401:
			return new InvalidCredentialsException(obj, cause);
		case 402:
			return new RequestDeclinedException(obj, cause);
		case 403:
			return new PermissionException(obj, cause);
		case 404:
			return new EntityNotFoundException(obj, cause);
		case 409:
			return new RequestConflictException(obj, cause);
		case 406:
		case 415:
		default:
			return new ApiException(obj, cause);
		}
	}

	/**
	 * Create a connection from a request and return a specified type.
	 *
	 * @param <T> an extension of BaseDomainObject          
	 * @param request the Request object to be processed           
	 * @param returnType the class that will be returned           
	 * @return the t          
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws PaysafeException the paysafe exception
	 *             
	 */
	public final <T extends BaseDomainObject> T processRequest(final Request request, Class<T> returnType)
			throws IOException, PaysafeException {
		final URL url = new URL(request.buildUrl(apiEndPoint));
	    final HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		try {
			connection.setRequestProperty("Authorization", "Basic " + getAuthenticatedString());
			connection.setRequestMethod(request.getMethod().toString());
			connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
			connection.setRequestProperty("SDK-Type", "Paysafe_Java_SDK");

			// Write to the stream if we can
			if (request.getMethod().equals(Request.RequestType.POST)
					|| (request.getMethod().equals(Request.RequestType.PUT))) {
				connection.setDoOutput(true);

				final OutputStream os = connection.getOutputStream();
				final DataOutputStream dos = new DataOutputStream(os);
				try {
					dos.write(serializeObject(request, returnType).getBytes(StandardCharsets.UTF_8));
					dos.flush();
				} finally {
					dos.close();
					os.close();
				}
			}
			
			return getReturnObject(connection, returnType);
		} finally {
			connection.disconnect();
		}
	}

	/**
	 * Get the return object back from the connection.
	 *
	 * @param <T>an extension of BaseDomainObject
	 * @param connection HttpsURLConnection
	 * @param returnType the class that will be returned
	 * @return the return object
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws PaysafeException the paysafe exception
	 */
	private <T extends BaseDomainObject> T getReturnObject(HttpsURLConnection connection, Class<T> returnType)
			throws IOException, PaysafeException {
		try {
			InputStream is = connection.getInputStream();

			try {
				return deserializeStream(is, returnType);
			} finally {
				is.close();
			}
		} catch (IOException cause) {
			// store the cause so we know to throw an exception after parsing
			// the response
			InputStream is = connection.getErrorStream();
			try {
				throw getException(connection.getResponseCode(), deserializeStream(is, returnType), cause);
			} finally {
				is.close();
			}
		}
	}

	/**
	 * Take an input stream and return the gson deserialized version.
	 *
	 * @param <T> an extension of BaseDomainObject
	 * @param is the input stream
	 * @param returnType the class that will be returned
	 * @return the t
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private <T extends BaseDomainObject> T deserializeStream(InputStream is, Class<T> returnType) throws IOException {
		final InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		try {
			return gsonDeserializer.fromJson(isr, returnType);
		} finally {
			isr.close();
		}
	}

	/**
	 * Take a domain object, and json serialize it.
	 *
	 * @param request the request
	 * @param returnType the return type
	 * @return json encoding of the request object
	 */
	private String serializeObject(Request request, Class<?> returnType) {
		final GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.excludeFieldsWithoutExposeAnnotation();
		gsonBuilder.registerTypeHierarchyAdapter(AddressContainer.class, new AddressContainerAdapter());
		gsonBuilder.registerTypeHierarchyAdapter(Id.class, new IdAdapter());
		if (null != request.getSerializer()) {
			gsonBuilder.registerTypeAdapter(returnType, request.getSerializer());
		}
		final Gson gson = gsonBuilder.create();
		return gson.toJson(request.getBody());
	}

	/**
	 * Sets the account.
	 *
	 * @param accountNumber the new account
	 */
	public final void setAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Gets the account.
	 *
	 * @return the account
	 */
	public final String getAccount() {
		return accountNumber;
	}

	/**
	 * Gets the base 64 encoded authenticated string.
	 *
	 * @return the authenticated string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private String getAuthenticatedString() throws IOException {
		return javax.xml.bind.DatatypeConverter.printBase64Binary((keyId + ':' + keyPassword).getBytes("UTF-8"));
	}
}
