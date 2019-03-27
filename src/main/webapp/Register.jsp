<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<h1>Registration Form</h1>
	<form action="./CustomerControllerServlet" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="username" size="30" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" size="30" /></td>
			</tr>

			<tr>
				<td>Age :</td>
				<td><input type="text"" name="age" size="30" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" size="30" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="Address" size="30" /></td>
			</tr>
			<tr>
				<td>Mobile No :</td>
				<td><input type="text" name="mobileno" size="30" /></td>
			</tr>
			
		</table>
		<p />
		<input type="submit" value="Register" />
	</form>
</head>
<body>

</body>
</html>