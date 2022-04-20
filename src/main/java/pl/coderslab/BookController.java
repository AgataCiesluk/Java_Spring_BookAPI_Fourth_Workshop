package pl.coderslab;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final MockBookService mockBookService;

    public BookController(MockBookService mockBookService) {
        this.mockBookService = mockBookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        if (book.getTitle() == null) {
            throw new RestClientException("Title is missing");
        } else {
            mockBookService.addNewBook(book);
        }
    }

    // Zwraca listę wszystkich książek.
    @GetMapping
    public List<Book> getAllBooks() {
        return mockBookService.getAllBooksList();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id) {
        return mockBookService.getBookById(id);
    }



}
