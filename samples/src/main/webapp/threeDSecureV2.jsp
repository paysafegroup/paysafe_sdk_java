<%@ page import="com.paysafe.common.Error,java.util.UUID,java.util.Calendar" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Paysafe SDK -  3D Secure V2 with card details</title>
  </head>
  <body>
    <h1>3D Secure V2 with card details </h1>

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
          
        </ul>
      <% } %>
 
     <form method="post" action="threeDSecureV2">
      <fieldset>
        <legend>Card Details</legend>
        
       <div>
          <label>
           Device Fingerprinting Id: 
            <input type="input" name="deviceFingerprintingId" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("deviceFingerprintingId") != null) {
              out.print(request.getParameter("deviceFingerprintingId"));
            } else {
              out.print("");
            }
            %>"/>
          </label>
        </div>
        
        <div>
          <label>
            Merchant Ref Number: 
            <input type="input" name="merchantRefNum" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("merchantRefNum") != null) {
              out.print(request.getParameter("merchantRefNum"));
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
              out.print("99999999999");
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
              out.print("USD");
            }
            %>"/>
          </label>
        </div>
        
        <div>
          <label>
            Card holder Name: 
            <input type="input" name="holderName" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("holderName") != null) {
              out.print(request.getParameter("holderName"));
            } else {
              out.print("John Smith");
            }
            %>"/>
          </label>
        </div>
        
       <div>
          <label>
            Card Number: 
            <input type="input" name="cardNum" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("cardNum") != null) {
              out.print(request.getParameter("cardNum"));
            } else {
              out.print("4111111111111111");
            }
            %>"/>
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
        
         <div>
          <label>
            Merchant URL 
            <input type="input" name=merchantUrl value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("merchantUrl") != null) {
              out.print(request.getParameter("merchantUrl"));
            } else {
              out.print("https://mysite.com");
            }
            %>"/>
          </label>
        </div>
        
        <div>
          <label>
            Authentication Purpose: 
            <input type="input"  name="authenticationPurpose" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("authenticationPurpose") != null) {
              out.print(request.getParameter("authenticationPurpose"));
            } else {
              out.print("PAYMENT_TRANSACTION");
            }
            %>"/>
          </label>
        </div>
        
        <div>
          <label>
            Device Channel: 
            <input type="input"  name="deviceChannel" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("deviceChannel") != null) {
              out.print(request.getParameter("deviceChannel"));
            } else {
              out.print("BROWSER");
            }
            %>"/>
          </label>
        </div>
        
        <div>
          <label>
            Message Category: 
            <input type="input"  name="messageCategory" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("messageCategory") != null) {
              out.print(request.getParameter("messageCategory"));
            } else {
              out.print("PAYMENT");
            }
            %>"/>
          </label>
        </div>
       
        <br/>
   		<br/>
    </fieldset>
      <br/>
  	  <input type="submit" name="threedsecureV2" value="Submit" />
    </form>
	
  </body>
  
</html>
