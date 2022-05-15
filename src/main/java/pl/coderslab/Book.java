package pl.coderslab;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

//    public Book() {
//    }
//
//    public Book(String isbn, String title, String author, String publisher, String type) {
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.publisher = publisher;
//        this.type = type;
//    }
//
//    public Book(long id, String isbn, String title, String author, String publisher, String type) {
//        this.id = id;
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.publisher = publisher;
//        this.type = type;
//    }
}
