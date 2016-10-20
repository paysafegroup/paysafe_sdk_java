<%@ page import="com.paysafe.cardpayments.Authorization" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Paysafe SDK </title>
	</head>
	<body>
		<% if (request.getParameter("payment") != null && request.getParameter("payment").toString().equals("error")) { %>
			<h2>Error Processing Payment</h2>
		<% } else if ((request.getParameter("payment") != null && request.getParameter("payment").toString().equals("success")) || 
			request.getAttribute("payment") != null && request.getAttribute("payment").toString().equals("success")) { %>
			<h2>Successfully completed payment.</h2>
			
			<% if (request.getAttribute("authId") != null ) { 
				Authorization authId = (Authorization) request.getAttribute("authId");
			%>
				<h3>AuthID: <% out.print(authId.getId()); %></h3>
			<% } %>
						  
		<% } %>
	</body>
</html>
