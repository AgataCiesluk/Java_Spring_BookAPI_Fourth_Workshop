<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 16.05.2022
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Confirmation</title>
</head>
<body>
Are you sure, that you want to delete this book: ${bookToDelete.title}?
<a href="/admin/books/delete/${bookToDelete.id}">Confirm</a>
<a href="/admin/books/all">Cancel</a>
</body>
</html>
