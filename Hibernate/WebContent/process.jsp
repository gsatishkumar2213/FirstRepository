<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>arithmetic</title>
</head>
<body>
	<%int i = Integer.parseInt(request.getParameter("n1"));
int j = Integer.parseInt(request.getParameter("n2"));
double k = i/j;
out.print("result is " +k);
%>



</body>
</html>