<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<h2>Create New Account</h2>

<form action="saveReg" method="post">

First-Name : <input type="text" name="FIRST_NAME"/>
Last-Name : <input type="text" name="LAST_NAME"/>
Email : <input type="text" name="EMAIL"/>
Password : <input type="text" name="PASSWORD"/>

<input type="submit" value="save"/>

</form>

</body>
</html>