<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 16.05.2022
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book info</title>
</head>
<body>
ID: ${book.id}<br>
Title: ${book.title}<br>
ISBN: ${book.isbn}<br>
Author: ${book.author}<br>
Publisher: ${book.publisher}<br>
Type: ${book.type}<br>

<p><a href="/admin/books/all">Show all</a></p>
</body>
</html>
