<%@page import="com.paysafe.websample.CustomerVaultACHBank"%>
<html>
<head></head>
<body>
<div>
<form method="post" action="direct-debit-sample">

<fieldset>
            <legend>Direct Debit Purchase</legend>
<div>
	
	<div>
		<label>MerchantRefNo</label>
		<input type="text" name="merchantRefNum" value="<%=java.util.UUID.randomUUID().toString()%>"><br>
	</div>
	<div>
		<label>Amount</label>
		<input type="text" name="amount" value="10098"><br>
	</div>
	<div>
		<fieldset>
		<legend>ACH</legend>
		<div>
			<label>Account Holder Name</label>
			<input type="text" name="accountHolderName" value="XYZ Company"><br>
		</div>
		<!-- <div>
			<label>Account Type</label>
			<input type="text" name="accountType"><br>	
		</div> -->
		<div>
			<label>Account Number</label>
			<input type="text" name="accountNumber" value="<%= new CustomerVaultACHBank().sixDigitRandomNumber()%>"><br>	
		</div>
		<div>
			<label>Routing Number</label>
			<input type="text" name="routingNumber" value="211589828"><br>	
		</div>
		</fieldset>
	</div>
	<div>
		<label>Customer Ip</label>
		<input type="text" name="customerIp" value="192.0.126.111"><br>
	</div>
	
	<div>
		<fieldset>
		<legend>Profile</legend>
		
		<div>
			<label>First Name</label>
			<input type="text" name="firstName" value="Joe"><br>	
		</div>
		<div>
			<label>Last Name</label>
			<input type="text" name="lastName" value="Smith"><br>	
		</div>
		<div>
			<label>Email</label>
			<input type="text" name="email" value="Joe.Smith@hotmail.com"><br>	
		</div>
		</fieldset>
	</div>
	<div>
		<fieldset>
		<legend>Billing Address</legend>
		
		<div>
			<label>Street</label><input type="text" name="street" value="100 Queen Street West"><br>
		</div>
		<div>
			<label>City</label>
			<input type="text" name="city" value="Los Angeles"><br>
		</div>
		<div>
			<label>State</label>
			<input type="text" name="state" value="CA"><br>
		</div>
		<div>
			<label>Country</label>
			<input type="text" name="country" value="US"><br>	
		</div>
		<div>
			<label>Zip</label>
			<input type="text" name="zip" value="90210"><br>
		</div>
		<div>
			<label>Phone</label>
			<input type="text" name="phone" value="3102649010"><br>
		</div>
		</fieldset>
	</div>
	
	
</div>
<div>
	<input type="submit" value="Submit">
</div>
  	
  	
</fieldset>	
</form>
</div>

 
</body>
</html>