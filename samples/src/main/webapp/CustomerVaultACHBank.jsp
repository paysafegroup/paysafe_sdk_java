<%@page import="com.paysafe.websample.CustomerVaultACHBank"%>
<html>
<head></head>
<body>
<div>
<form method="post" action="customerVaultACHBank">
 <fieldset>
            <legend>Customer Vault ACH Bank Create</legend>
<div>
	
	<div>
		<label>NickName</label>
		<input type="text" name="nickName" value="John's RBC Business Bank Account"><br>
	</div>
	<div>
		<label>Account Number</label>
		<input type="text" name="accountNumber" value="<%=new CustomerVaultACHBank().sixDigitRandomNumber()%>"><br>
	</div>
	<div>
			<label>Routing Number</label>
			<input type="text" name="routingNumber" value="123456789"><br>	
	</div>
	<div>
		<label>Account HolderName</label>
		<input type="text" name="accountHolderName" value="XYZ Business"><br>
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