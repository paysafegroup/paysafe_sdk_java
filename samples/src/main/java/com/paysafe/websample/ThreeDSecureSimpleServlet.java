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

package com.paysafe.websample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paysafe.Environment;
import com.paysafe.PaysafeApiClient;
import com.paysafe.common.Id;
import com.paysafe.common.PaysafeException;
import com.paysafe.threedsecure.Authentications;
import com.paysafe.threedsecure.EnrollmentChecks;

public class ThreeDSecureSimpleServlet extends PaysafeServletBase {

	  
	  private static final long serialVersionUID = 1L;
	  
	  @Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	    request.setAttribute("isPost", "false");
	    request.setAttribute("currency", this.currencyCode);

	    RequestDispatcher view = request.getRequestDispatcher("threeDSecureSimple.jsp");
	    view.forward(request, response); 

	  }
	  
	  @Override
	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	   
		  PaysafeApiClient apiClient = new PaysafeApiClient(this.apiKey, this.apiPassword, Environment.TEST, this.accountNumber);
	    
	    PrintWriter out = response.getWriter();
	  	     
	    String threedsecure=request.getParameter("threed_secure");
	    
	   
	    		 if(threedsecure.equals("submit_enroll"))
	    		 	{
		    			 
		    			 try{
		    				   			 	
		    				 	EnrollmentChecks responses = EnrollmentChecks.builder()
		    				 			.merchantRefNum(request.getParameter("merchant_Ref_Number"))
		    				 			.amount(99999999)
		    				 			.currency(request.getParameter("currency"))
		    				 			.customerIp("204.91.0.12")
		    				 			.userAgent(
		    				 					"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.125 Safari/537.36")
		    				 			.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*;q=0.8")
		    				 			.merchantUrl("https://www.merchant.com")
		    				 			.card()
		    				 				.cardNum("4107857757053670")
		    				 				.cardExpiry()
		    				 				.month(10)
		    				 				.year(2018)
		    				 				.done()
		    				 				.done()
		    				 			.build();
						
		    				 	EnrollmentChecks enroll_responses;
				
		    				 	enroll_responses = apiClient.threeDSecureService()
		    				 			.submit(responses);
		    				 			out.println("-------"+enroll_responses.getId());
		    				 			final GsonBuilder gsonBuilder = new GsonBuilder();
		    				 			gsonBuilder.excludeFieldsWithoutExposeAnnotation();
		    				 			final Gson gson = gsonBuilder.create();
			        
		    				 			out.println("response"+gson.toJson(enroll_responses));
		    			 }
		    			 catch (PaysafeException e) {
		    					e.printStackTrace();
		    					out.println(e.getMessage());
		    				}
		    			 
	    		 	}
	    		 
	    		
	    	if(threedsecure.equals("authentication_request"))
	    	 {
	    		 try
	    		 { 
	    			 EnrollmentChecks enroll_response = 
									EnrollmentChecks.builder()
								    .merchantRefNum(request.getParameter("merchantRefNum"))
								    .amount(99999999)
								    .currency(request.getParameter("USD"))
								    .customerIp("204.91.0.12")
								    .userAgent(
								                           "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.125 Safari/537.36")
							    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
								                 .merchantUrl(request.getParameter("https://www.merchant.com"))
								                   .card()
								                     .cardNum("4107857757053670")
								                     .cardExpiry()
								                     .month(10)
								                     .year(2018)
								                     .done()
								                    .done()
								                 .build();
					 enroll_response.setId(Id.create("390d8d32-cff5-4887-a96f-554fed7e1722",EnrollmentChecks.class));
						
							 Authentications auth_response = (Authentications.builder()
					                               .merchantRefNum(java.util.UUID.randomUUID().toString())
					                                .paRes("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")
					                                .enrollmentId(enroll_response.getId())
					                                .build());
							 				
							 
							 auth_response = apiClient.threeDSecureService().submit(auth_response);
								out.println("-------"+auth_response.getId());
								final GsonBuilder gsonBuilder1 = new GsonBuilder();
						        gsonBuilder1.excludeFieldsWithoutExposeAnnotation();
						        final Gson gson1 = gsonBuilder1.create();
						        out.println("response"+gson1.toJson(auth_response));
						        
	    	 }
	    		 catch (PaysafeException e) {
						
						e.printStackTrace();
						out.println(e.getMessage());
					}	
	    	 }
	    	  
	    
	    }		
	}	   