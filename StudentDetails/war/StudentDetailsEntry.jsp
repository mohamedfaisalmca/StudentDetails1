<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/entryJSP" method="post">
<Center><h2>STUDENT DETAILS ENTRY FORM</h2></Center>
<br>
<br>
<center>
<table>
	<tr>
		<td>StudentName	</td><td><input type="text" name="name" placeholder="Enter student name"/></td>
	</tr>
	<tr>
		<td>RollNo	</td><td><input type="text" name="rollNo" placeholder="Roll number"/></td>
	</tr>
	<tr>
		<td>Department Name</td><td><input type="text" name="department" placeholder="Department name"/></td>
	</tr>
	<tr>
		<td>College Name</td><td><input type="text" name="collegeName" placeholder="College name"/></td>
	</tr>
	<tr>
		<td>Location</td><td><input type="text" name="location" placeholder="Location"/></td>
	</tr>	
</table>
<br>
<center><input type="submit" value="Save"/></center>
</center>
</form>
</body>
</html>