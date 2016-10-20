<%@ page import="com.paysafe.common.Error,java.util.UUID,java.util.Calendar" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Paysafe SDK -  3D Secure Simple</title>
  </head>
  <body>
    <h1>3D Secure Simple</h1>

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
 
     <form method="post" action="threeDSecure">
      <fieldset>
        <legend>Order Details</legend>
        <div>
          <label>
            Merchant Ref Number: 
            <input type="input" name="merchant_Ref_Number" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("merchant_Ref_Number") != null) {
              out.print(request.getParameter("merchant_Ref_Number"));
            } else {
              out.print("");
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
            Card Number: 
            <input type="input" name="card_number" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("card_number") != null) {
              out.print(request.getParameter("card_number"));
            } else {
              out.print("");
            }
            %>"/>
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
       
        <div>
          <label>
            PaRes: 
            <input type="input" name="pares" value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("pares") != null) {
              out.print(request.getParameter("pares"));
            } else {
              out.print("");
            }
            %>"/>
          </label>
        </div>
        <div>
          <label>
            Merchant URL 
            <input type="input" name=merchantUrl value="<%
            if (request.getAttribute("isPost") == "true" && request.getParameter("merchantUrl") != null) {
              out.print(request.getParameter("merchantUrl"));
            } else {
              out.print("www.merchat.com");
            }
            %>"/>
          </label>
        </div>
        
   		<br/>
   		<br/>
   		</fieldset>
          <fieldset>
         	 <h4>Enrollment Lookups</h4>
            	 <label>
                       <input type="radio" name="threed_secure" value="submit_enroll" />Submit an Enrollment Lookup Request
                 </label>
            
          </fieldset>
           
           <br/>         
          
          <fieldset>
        
                <h4>Authentications</h4>
                            
                <label>
                      <input type="radio" name="threed_secure" value="authentication_request" />Submit an Authentications Request
                </label>
                <br/>
           </fieldset>
                <br/>
  	     		    
      <input type="submit" />
    </form>
	
  </body>
  
</html>
