package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService {

    private List<Book> list;

    private static Long nextId = 4L;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    //    Pobieranie listy wszystkich książek
    public List<Book> getAllBooksList() {
        return list;
    }

//    Pobieranie obiektu po wskazanym identyfikatorze.
    public Book getBookById (long id) {
        for (Book book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Dodawanie ksiazki
    public void addNewBook(Book book) {
        book.setId(nextId);
        list.add(book);
        nextId++;
    }

//    Edycja obiektu po zadanym id.
    public void updateBook(Book book) {
            int bookIndex = list.indexOf(getBookById(book.getId()));
            list.set(bookIndex, book);
    }

//    Usuwanie obiektu.

}
