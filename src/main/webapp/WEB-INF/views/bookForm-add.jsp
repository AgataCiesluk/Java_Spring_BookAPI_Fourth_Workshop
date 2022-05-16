<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 16.05.2022
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book Form</title>
</head>
<body>
<form:form method="POST" modelAttribute="book">
    Title: <form:input path="title"/><br>
    <form:errors path="title" cssClass="error"/><br>
    ISBN: <form:input path="isbn"/><br>
    <form:errors path="isbn" cssClass="error"/><br>
    Author: <form:input path="author"/><br>
    <form:errors path="author" cssClass="error"/><br>
    Publisher: <form:input path="publisher"/><br>
    <form:errors path="publisher" cssClass="error"/><br>
    Type: <form:input path="type"/><br>
    <form:errors path="type" cssClass="error"/><br>
    <input type="submit"><br>
</form:form>
</body>
</html>
