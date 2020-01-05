<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h2>Registration From</h2>
	<form action="/FirstApplication/register" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" required="required"/></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name="name" required="required"/></td>
			</tr>

			<tr>
				<td>Submit</td>
				<td><input type="submit" /></td>
			</tr>
			<tr>
				<td>Reset</td>
				<td><input type="reset" /></td>
			</tr>
		</table>
	</form>
</body>
</html>