<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<title>HelloIBM logout</title>
</head>
<body>
<h2>Sample Form Logout</h2>
<form method="POST" action="ibm_security_logout" name="logout">
<BR>
<strong> Please confirm logout -> : </strong>
<input type="submit" name="logout" value="Logout">
<!-- input type="HIDDEN" name="logoutExitPage" value="/login.html"-->
<input type="HIDDEN" name="logoutExitPage" value="/HelloIBM">
</form>
</body>
</html>