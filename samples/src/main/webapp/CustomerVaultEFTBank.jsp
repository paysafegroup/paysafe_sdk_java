<%@page import="com.paysafe.websample.CustomerVaultEFTBank"%>
<html>
<head></head>
<body>
<div>
<form method="post" action="customerVaultEFTBank">
 <fieldset>
            <legend>Customer Vault EFT Bank Create</legend>
<div>
	
	<div>
		<label>NickName</label>
		<input type="text" name="nickName" value="John's RBC Business Bank Account"><br>
	</div>
	<div>
		<label>Account HolderName</label>
		<input type="text" name="accountHolderName" value="XYZ Business"><br>
	</div>
	<div>
		<label>Account Number</label>
		<input type="text" name="accountNumber" value="<%=new CustomerVaultEFTBank().sixDigitRandomNumber()%>"><br>
		
	</div>
	<div>
			<label>Transit Number</label>
			<input type="text" name="transitNumber" value="25039"><br>
	</div>
	<div>
			<label>Institution Id</label>
			<input type="text" name="institutionId" value="001"><br>
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