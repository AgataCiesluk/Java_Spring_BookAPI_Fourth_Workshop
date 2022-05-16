<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 15.05.2022
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book list</title>
</head>
<body>
<table border="1">
    <thead>
    <th>ISBN</th>
    <th>Title</th>
    <th>Author</th>
    <th>Actions</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td>
                <a href="/admin/books/delete-confirm?id=${book.id}">Delete Book</a><br> /
                /Update/ <a href="/admin/books/show-book/${book.id}">Show Info</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p><a href="/admin/books/add">Add Book</a></p>
</body>
</html>
