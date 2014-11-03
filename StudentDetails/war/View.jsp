<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form> 
<center><h2>STUDENT DETAILS VIEW</h2></center>
<center>
<br>
<br>
<table>
	<tr>
		<td>Enter Student Roll NO:	</td><td><input type="text" name="rollNo" id="rollId"/></td>
	</tr>
	
</table>
<div id="displayDetails"> Here your record will view</div><br><br>
<div id="displayName"> your name </div>
<br>
<br>
<center><!-- <input type="submit" value="View" /> --> 
<input type="button" value="View" onclick="msg()"/>
</center>
</center>
</form>
<script type="text/javascript">
var req;
var req1;
function msg()	
{
	var v=document.getElementById("rollId").value;
	//alert("this is url"+v);
	var url="/viewJSP?rollNo="+v;
	var url1="/nameView";
	alert("this is url="+url);
	req=new XMLHttpRequest();
	req1=new XMLHttpRequest();
	try
	{
		
		req.onreadystatechange=getInfo;
		console.log("try block")
		req.open("GET",url,true);	//Asynchronous true
		req.send();
		
		req1.onreadystatechange=getInformation;
		req1.open("GET",url1,true);
		req1.send();
		
	}
	catch(e)
	{
		alert("Not working");
	}
	function getInfo()
	{
		console.log("ready state"+req.readyState);
		if(req.readyState==4)
		{
			var data=req.responseText;
			document.getElementById("displayDetails").innerHTML=data;
		}
	}
	function getInformation()
	{
		console.log("ready state"+req1.readyState);
		if(req1.readyState==4)
		{
			var data=req1.responseText;
			document.getElementById("displayName").innerHTML=data;
		}
	}
}
</script> 
</body>
</html>