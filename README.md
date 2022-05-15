# Java_Spring_BookAPI_Fourth_Workshop
<br>

In this workshop I've created Book API to maintain books added to ```List<Book>``` - add book, delete, change, view all books or praticular one by ID.<br> 

To start the app you will need to run Tomcat and install cURL.<br>

Whole code is based on Spring MVC framework (Java). In the future, project can be developed to use MySQL instead of ```List<Book>```.


|HTTP Method	  |URL	                               |Expected action|
|---------------|------------------------------------|----------------|
|GET	          |```http://localhost:8080/books```	       |Returns ```List<Book>``` that contains all books (can be tested in web browser).|
|POST	          |```http://localhost:8080/books```	       |Creates new Book from given information (can be tested with cURL).|
|GET	          |```http://localhost:8080/books/{id}```	   |Shows info about book with given id (can be tested in web browser).|
|PUT	          |```http://localhost:8080/books```	       |Changes info about the book with given id (can be tested with cURL).|
|DELETE	        |```http://localhost:8080/books/{id}```	   |Removes book with given id from the ```List<Book>``` (can be tested with cURL).|

## Testing:
1. GET methods can be tested directly in web browser by using one of above URL address dedicated to GET method.
2. POST, PUT and DELETE can be tested by using below exemplary cURLs (for example in Postman or in your terminal):
- POST:<br>
```curl -X POST -i -H "Content-Type: application/json" -d '{"isbn":"34321","title":"Thinking in Java", "publisher":"Helion","type":"programming", "author":"Bruce Eckel"}' http://localhost:8080/books```<br><br>
Created object Book:<br>
```
{
id: 4,
isbn: "34321",
title: "Thinking in Java",
author: "Bruce Eckel",
publisher: "Helion",
type: "programming"
}
```
- PUT:<br>
```curl -X PUT -i -H "Content-Type: application/json" -d   '{"id":1,"isbn":"32222","title":"Thinking in C#",  "publisher":"IT Books","type":"programming", "author":"Bruce Eckel"}' http://localhost:8080/books```
- DELETE:<br>
```curl -X DELETE -i  http://localhost:8080/books/1```

###05/15/2022 App Update - Hibernate implementation
