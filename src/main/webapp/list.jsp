<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.*"%>

<%
	UserDao dao = new UserDao();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
</head>
<body>

	<TABLE class="table table-hover" BORDER="2px">
		<tr>
			<th colspan="3" align="center">Users</th>
		</tr>
		<TR>
			<TH>Login</TH>
			<TH>Password</TH>
		</TR>
		<%
			for (User user : dao.list()) {
		%>
		<tr>
			<td><%=user.getLogin()%></td>
			<td><%=user.getPassword()%></td>
		</tr>
		<%
			}
		%>
	</TABLE>

</body>
</html>