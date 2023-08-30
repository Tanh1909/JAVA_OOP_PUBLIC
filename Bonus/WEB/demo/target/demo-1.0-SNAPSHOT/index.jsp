<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="./PersonServlet" method="post">
    <input type="text" name="name">
    <input type="text" name="age">
    <input type="text" name="address">
    <button type="submit">submmit</button>
</form>
</body>
</html>