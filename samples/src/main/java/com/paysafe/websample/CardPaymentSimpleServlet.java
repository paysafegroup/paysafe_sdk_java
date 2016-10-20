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

package com.paysafe.websample;

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;

import com.paysafe.Environment;
import com.paysafe.PaysafeApiClient;
import com.paysafe.cardpayments.Authorization;
import com.paysafe.common.PaysafeException;

public class CardPaymentSimpleServlet extends PaysafeServletBase {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    request.setAttribute("isPost", "false");
    request.setAttribute("currency", this.currencyCode);

    RequestDispatcher view = request.getRequestDispatcher("cardPaymentSimple.jsp");
    view.forward(request, response);

  }

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    //Initialize the PaysafeApiClient 
    PaysafeApiClient apiClient = new PaysafeApiClient(this.apiKey, this.apiPassword, Environment.TEST, this.accountNumber);

    int totalAmount = (int) (Double.valueOf(request.getParameter("amount")) * this.currencyMultiplier);

    boolean isSuccess = false;

    try {
      // Build our order object.
      Authorization auth
              = Authorization.builder()
              .merchantRefNum(request.getParameter("merchant_ref_num"))
              .amount(totalAmount)
              .settleWithAuth(true)
              .billingDetails()
                .street(request.getParameter("street"))
                .city(request.getParameter("city"))
                .state(request.getParameter("state"))
                .country(request.getParameter("country"))
                .zip(request.getParameter("zip"))
                .done()
              .card()
                .cardNum(request.getParameter("cardNum"))
                .cvv(request.getParameter("cvdNumber"))
                .cardExpiry()
                  .month(Integer.valueOf(request.getParameter("cardExpiryMonth")))
                  .year(Integer.valueOf(request.getParameter("cardExpiryYear")))
                  .done()
                .done()
              .build();

      Authorization authResponse = apiClient.cardPaymentService().authorize(auth);
      request.setAttribute("isAuth", true);
      request.setAttribute("authId", authResponse.getId());
      request.setAttribute("payment", "success");
      isSuccess = true;

    } catch (PaysafeException ev) {
      request.setAttribute("error", ev.getMessage());
    }

    // Create a new card payment request
    request.setAttribute("isPost", "true");
    request.setAttribute("currency", this.currencyCode);

    if (isSuccess) {
      RequestDispatcher view = request.getRequestDispatcher("status.jsp");
      view.forward(request, response);
    } else {
      RequestDispatcher view = request.getRequestDispatcher("cardPaymentSimple.jsp");
      view.forward(request, response);
    }
  }

}
