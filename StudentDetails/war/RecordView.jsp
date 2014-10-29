<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/updateViewJSP" method="post">
<Center><h2>UPDATE YOUR RECORD</h2></Center>
<br>
<br>
<table><center>
<%int rollno=Integer.parseInt(request.getParameter("rollNo")); %>
<%=rollno %>
<%request.setAttribute("RollNo", rollno); %>

	<tr>
		<td></td><td><input type="hidden" name="roll" value="<%=request.getParameter("rollNo")%>""/></td>
	</tr>
	<tr>
		<td>StudentName	</td><td><input type="text" name="name" placeholder="Enter your name"/></td>
	</tr>
	
	<tr>
		<td>Department Name</td><td><input type="text" name="department" placeholder="Department Name"/></td>
	</tr>
	
	<tr>
		<td>College Name</td><td><input type="text" name="collegeName" placeholder="College name" /></td>
	</tr>
	
	<tr>
		<td>Location</td><td><input type="text" name="location" placeholder="Location"/></td>
	</tr>
	<tr>
		<td><center><input type="submit" value="Save"/></center></td>
	</tr>
	</center>
</table>
</form>
</body>
</html>