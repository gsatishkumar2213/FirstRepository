<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Depo |  Sing up Here</title>
</head>
<body>
<h1>Sign up</h1>
<form action="RegisterController" method="get">

    <table cellpadding="5" cellspacing="5">
        <tr>
            <td>Name</td>
            <td>
                <input type="text" name="name"/>
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="text" name="mail"/>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <input type="password" name="pw"/>
            </td>
        </tr>

        <tr >
            <td><a href="index.jsp">Sign in</a></td>

            <td align="right">
                <input align="right" type="submit" value="Register">
            </td>
        </tr>


    </table>
</form>


</body>
</html>