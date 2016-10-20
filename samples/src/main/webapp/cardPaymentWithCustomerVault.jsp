<%@ page import="com.paysafe.common.Error,com.paysafe.common.FieldError,java.util.UUID,java.util.Calendar" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Paysafe SDK - Card Payment Simple</title>
  </head>
  <body>
    <h1>Card Payment Simple</h1>

    <% if (request.getAttribute("error") != null) { %>
        <h2>Following errors Occurred</h2>
        <ul>
        <% Error error = (Error) request.getAttribute("error"); %>
          <li><% out.print(error.getMessage()); %></li>
        <%
          for (Object detail : error.getDetails()) {
        %>
            <li><% out.print(detail.toString()); %></li>

        <% } %>
		
		<%
          for (Object tmpObj : error.getFieldErrors()) {
            FieldError field = (FieldError) tmpObj;
        %>
            <li><% out.print(field.getField() + " - " + field.getError()); %></li>

        <% } %>
          
        </ul>
      <% } %>

    <form method="post">
      <fieldset>
        <legend>Billing Details</legend>

        <div>
            <label>
                Merchant Customer Id: 
                <input type="input" name="merchant_customer_id" size="30" value="<%
                  if (request.getAttribute("isPost") != null && request.getParameter("merchant_customer_id") != null) {
                      out.print(request.getParameter("merchant_customer_id"));
                  } else {
                      out.print("cust-" + UUID.randomUUID().toString().substring(0,20));
                  }
                %>"
                />
            </label>
        </div>


        <div>
          <label>
            First Name: 
            <input type="input" name="first_name" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("first_name") != null) {
              out.print(request.getParameter("first_name"));
            } else {
              out.print("First");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Last Name: 
            <input type="input" name="last_name" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("last_name") != null) {
              out.print(request.getParameter("last_name"));
            } else {
              out.print("Last");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Email: 
            <input type="input" name="email" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("email") != null) {
              out.print(request.getParameter("email"));
            } else {
              out.print("test@test.com");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Street: 
            <input type="input" name="street" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("street") != null) {
              out.print(request.getParameter("street"));
            } else {
              out.print("123 Fake St.");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            City: 
            <input type="input" name="city" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("city") != null) {
              out.print(request.getParameter("city"));
            } else {
              out.print("Toronto");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            State/Province: 
            <input type="input" name="state" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("state") != null) {
              out.print(request.getParameter("state"));
            } else {
              out.print("ON");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Country: 
            <select name="country">
              <option value="CA"<%
              if (request.getAttribute("isPost") == "true" && request.getParameter("country") == "CA") {
                out.print(" selected");
              }
              %>>Canada</option>
              <option value="US"<%
              if (request.getAttribute("isPost") == "true" && request.getParameter("country") == "US") {
                out.print(" selected");
              }
              %>>USA</option>
            </select>
          </label>
        </div>
        <div>
          <label>
            Zip/Postal Code: 
            <input type="input" name="zip" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("zip") != null) {
              out.print(request.getParameter("zip"));
            } else {
              out.print("M5H 2N2");
            }
            %>"/>
          </label>
        </div>
      </fieldset>
      <fieldset>
        <legend>Card Details</legend>
        <div>
          <label>
            Card Holder Name: 
            <input type="input" autocomplete="off" name="cardHolderName" value="John Smith"/>
          </label>
        </div>

        <div>
          <label>
            Card Number: 
            <input type="input" autocomplete="off" name="cardNum" value="4444333322221111"/>
          </label>
        </div>
        <div>
          <label>
            CVV: 
            <input type="input" autocomplete="off" name="cvdNumber" value="123"/>
          </label>
        </div>
        <div>
          <label>
            Card Expiry: 
            <select name="cardExpiryMonth">
      <%
              int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
              for ( int i = 1; i <= 12; i++) {
                out.print("<option value='" + i + "'" + (i == currentMonth ? " selected" : "") + ">" + i + "</option>");
              }
             %>
       </select>
          </label>
        </div>
        <div>
          <label>
            Card Expiry: 
            <select name="cardExpiryYear">
      <%
              int currentYear = Calendar.getInstance().get(Calendar.YEAR);
              for (int i = currentYear; i < currentYear + 5; i++) {
                out.print("<option value='" + i + "'" + ">" + i + "</option>");
              }
              %>
            </select>
          </label>
        </div>
      </fieldset>
      
      <fieldset>
        <legend>Order Details</legend>
        <div>
          <label>
            Merchant Ref Num: 
            <input type="input" name="merchant_ref_num" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("merchant_ref_num") != null) {
              out.print(request.getParameter("merchant_ref_num"));
            } else {
              out.print("MerchantRef-" + UUID.randomUUID().toString().substring(0,20));
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Amount: 
            <input type="input" name="amount" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("amount") != null) {
              out.print(request.getParameter("amount"));
            } else {
              out.print("100.00");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Currency: 
            <input type="input" name="currency" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("currency") != null) {
              out.print(request.getParameter("currency"));
            } else {
              out.print(request.getAttribute("currency"));
            }
            %>"/>
          </label>
        </div>
      </fieldset>
      <input type="submit" />
    </form>

  </body>
</html>
