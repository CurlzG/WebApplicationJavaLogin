<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="formDiv">
<form method=get action="Login">
<p class="title"> Please Login </p>
<p class='input-label'>Last Name </p>
<input type="text" class="input-field"  id="LastName" placeholder="Write here" name="LastName"  onclick="clearText()" value="LastName" />
<p class='input-label'>Password </p>
<input type="text" class="input-field" id="Password" placeholder="Write here" name="Password"  onclick="clearText()" value="Password" />
<div style="padding:20px">
<input type="submit" value="Login" name="Login" class="input-del">
</div>
<% if(request.getAttribute("allowed") != null){ %>
<%boolean allow = (boolean)request.getAttribute("allowed"); %>
<%if(allow){ %>
<p> <b> Allowed </b> </p>
<% } else if(!allow) { %>
<p> <b> Not Allowed </b> </p>
<% } else { %>
<p>  </p>
<% }} %>
</form>
</div>


</body>
<script>
function clearText()  
{
    if(document.getElementById('LastName').value == "LastName"){
    	document.getElementById('LastName').value = "";
    }else {
    	if(document.getElementById('Password').value == "Password"){
        	document.getElementById('Password').value = "";
        }	
    }
    
}  
</script>
</html>