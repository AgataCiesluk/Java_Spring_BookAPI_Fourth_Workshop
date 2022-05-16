package pl.coderslab;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(max = 70)
    private String isbn;

    @NotNull
    @Size(max = 70)
    private String title;

    @NotNull
    @Size(min = 2, max = 50)
    private String author;

    @Size(min = 2, max = 50)
    private String publisher;

    @NotNull
    @Size(min = 2, max = 50)
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
