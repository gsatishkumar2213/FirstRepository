<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here | <%=application.getInitParameter("appName") %></title>
</head>
<body>
	<form action="register.jsp" method="post">
		<table>
			<tr>
				<td><input type="text" name="uname" />UserName</td>

			</tr>
			<tr>
				<td><input type="password" name="password" />Password</td>

			</tr>
			<tr>
				<td><input type="text" name="mail" />Email</td>

			</tr>
			<tr>
				<td><input type="submit" value="register" /></td>

			</tr>


		</table>



	</form>


</body>
</html>