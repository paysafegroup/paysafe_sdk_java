/*
 * Copyright (c) 2016 PaySafe
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
package com.paysafe.threedsecure;

import java.io.IOException;
import java.util.HashMap;

import com.paysafe.PaysafeApiClient;
import com.paysafe.common.PaysafeException;
import com.paysafe.common.impl.Monitor;
import com.paysafe.common.impl.Request;
import com.paysafe.threedsecure.EnrollmentChecks;

// TODO: Auto-generated Javadoc
/**
 * The Class ThreeDSecureService.
 * @author sanket.desale
 * @since 07-04-2016.
 */

public class ThreeDSecureService {
 
	/**
	 * The client.
	 */
	private final PaysafeApiClient client;

	/**
	 * The paths to different features in the API.
	 */
	private static final String URI = "threedsecure/v1";
	
	/** The Constant AUTH_PATH. */
	private static final String AUTH_PATH = "/authentications";
	
	/** The Constant URI_SEPARATOR. */
	private static final String URI_SEPARATOR = "/";
	
	/** The Constant ENROLLMENT_CHECKS. */
	private static final String ENROLLMENT_CHECKS = "/enrollmentchecks/";
	/**
	 * Instantiates a new 3D Secure service.
	 *
	 * @param client
	 *            the client
	 */
	public ThreeDSecureService(final PaysafeApiClient client) {
		this.client = client;
	}	  
	 

	  /**
  	 * Prepare uri.
  	 *
  	 * @param path the path
  	 * @return the string
  	 * @throws PaysafeException the paysafe exception
  	 */
	  private String prepareUri(final String path) throws PaysafeException {
	    if (null == client.getAccount()) {
	      throw new PaysafeException("Missing or invalid account.");
	    }
	    return URI + "/accounts/" + client.getAccount() + path;
	  } // end of prepareUri()

	
	  /**
  	 * Monitor.
  	 *
  	 * @return true, if successful
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 * @throws PaysafeException the paysafe exception
  	 */
	  
	  public final boolean monitor() throws IOException, PaysafeException {

	    final Request request = Request.builder()
	            .uri("threedsecure/monitor")
	            .method(Request.RequestType.GET)
	            .build();

	    Monitor status = client.processRequest(request, Monitor.class);
	    return ("READY".equals(status.getStatus()));
	  } 
	  
	  /**
  	 * Submit an Enrollment Lookup Request.
  	 *
  	 * @param enrollmentChecks the enrollment checks
  	 * @return EnrollmentChecks
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 * @throws PaysafeException the paysafe exception
  	 */
	  public final EnrollmentChecks submit(final EnrollmentChecks enrollmentChecks)
	          throws IOException, PaysafeException {

	    final Request request = Request.builder()
	            .uri(prepareUri(ENROLLMENT_CHECKS))
	            .method(Request.RequestType.POST)
	            .body(enrollmentChecks)
	            .build();

	    return client.processRequest(request, EnrollmentChecks.class);
	  } // end of submitRequest()
	 
	 
	  /**
  	 * Look Up an Enrollment Lookup Using an ID.
  	 *
  	 * @param enrollmentChecks the enrollment checks
  	 * @return EnrollmentChecks
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 * @throws PaysafeException the paysafe exception
  	 */
	  public final EnrollmentChecks get(final EnrollmentChecks enrollmentChecks)
	          throws IOException, PaysafeException {

	    final Request request = Request.builder()
	            .uri(prepareUri(ENROLLMENT_CHECKS + enrollmentChecks.getId()))
	            .method(Request.RequestType.GET)
	            .build();

	    return client.processRequest(request, EnrollmentChecks.class);
	  } // end of lookupUsingId()
	  
	 
	  /**
  	 * Submit an Authentications Request.
  	 *
  	 * @param authentications the authentications
  	 * @return Authentications
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 * @throws PaysafeException the paysafe exception
  	 */
	  public final Authentications submit(final Authentications authentications)
	          throws IOException, PaysafeException {
		  
	    final Request request = Request.builder()
	            .uri(prepareUri(ENROLLMENT_CHECKS + authentications.getEnrollmentId() + AUTH_PATH))
	            .method(Request.RequestType.POST)
	            .body(authentications)
	            .build();
	    
	    return client.processRequest(request, Authentications.class);
	  } // end of submitRequest()
		 
	  
	  /**
  	 * Look Up an Authentication Using an ID.
  	 *
  	 * @param authentications the authentications
  	 * @return Authentications
  	 * @throws IOException Signals that an I/O exception has occurred.
  	 * @throws PaysafeException the paysafe exception
  	 */
	  public final Authentications get(final Authentications authentications)
	          throws IOException, PaysafeException {

	    final Request request = Request.builder()
	            .uri(prepareUri(AUTH_PATH + URI_SEPARATOR + authentications.getId()))
	            .method(Request.RequestType.GET)
	            .build();
	    		
	    return client.processRequest(request, Authentications.class);
	  } // end of lookupUsingId()
	  
	   /**
   	 * Look Up an Authentication and Corresponding Enrollment Check.
   	 *
   	 * @param authentications the authentications
   	 * @param includeEnrollments the include enrollments
   	 * @return Authentications
   	 * @throws IOException Signals that an I/O exception has occurred.
   	 * @throws PaysafeException the paysafe exception
   	 */
	  public final Authentications get(final Authentications authentications, final boolean includeEnrollments )
	          throws IOException, PaysafeException {

		  final HashMap<String, String> queryStr = new HashMap<String, String>();
		   
		  final StringBuilder toInclude = new StringBuilder();
		    if (includeEnrollments) {
		    	 toInclude.append("enrollmentchecks");
		    }
		    if (toInclude.length() > 0) {
		      queryStr.put("fields", toInclude.toString());
		    }  
		  
	    final Request request = Request.builder()
	            .uri(prepareUri(AUTH_PATH+URI_SEPARATOR+authentications.getId()))
	            .method(Request.RequestType.GET)
	            .queryStr(queryStr)
	            .build();

	    return client.processRequest(request, Authentications.class);
	  } // end of LookupEnrollAuthId()
	 	  
	 }
