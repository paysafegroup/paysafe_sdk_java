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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paysafe.Environment;
import com.paysafe.PaysafeApiClient;
import com.paysafe.common.PaysafeException;
import com.paysafe.threedsecureV2.AuthenticationPurpose;
import com.paysafe.threedsecureV2.Authentications;
import com.paysafe.threedsecureV2.DeviceChannel;
import com.paysafe.threedsecureV2.MessageCategory;

public class ThreeDSecureV2Servlet extends PaysafeServletBase {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		request.setAttribute("isPost", "false");
		request.setAttribute("currency", this.currencyCode);

		RequestDispatcher view = request.getRequestDispatcher("threeDSecureV2.jsp");
		view.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PaysafeApiClient apiClient = new PaysafeApiClient(this.apiKey, this.apiPassword, Environment.TEST,
				this.accountNumber);

		PrintWriter out = response.getWriter();

		try {
			Authentications auth_response1 = (Authentications.builder()
					.deviceFingerprintingId(request.getParameter("deviceFingerprintingId"))
					.merchantRefNum(request.getParameter("merchantRefNum"))
					.amount(99999999999L)
					.currency(request.getParameter("currency"))
					.card()
					.holderName(request.getParameter("holderName"))
					.cardNum(request.getParameter("cardNum"))
						.cardExpiry()
						.month(Integer.valueOf(request.getParameter("cardExpiryMonth")))
						.year(Integer.valueOf(request.getParameter("cardExpiryYear")))
						.done()
					.done()
					.merchantUrl("https://mysite.com")
					.authenticationPurpose(AuthenticationPurpose.PAYMENT_TRANSACTION)
					.deviceChannel(DeviceChannel.BROWSER)
					.messageCategory(MessageCategory.PAYMENT)
					.build());

			auth_response1 = apiClient.threeDSecureV2Service().submit(auth_response1);

			out.println("Auth Id :" + auth_response1.getId());
			final GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.excludeFieldsWithoutExposeAnnotation();
			final Gson gson = gsonBuilder.create();
			out.println("Response==>" + gson.toJson(auth_response1));
			
		} catch (PaysafeException e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}

	}

}
