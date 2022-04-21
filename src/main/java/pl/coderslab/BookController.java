package pl.coderslab;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
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
            bookService.addNewBook(book);
        }
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        if (getBookById(book.getId()) != null) {
            bookService.updateBook(book);
        } else {
            throw new RestClientException("There is no book with ID: " + book.getId());
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable long id) {
        bookService.deleteBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id) {
        return this.bookService.getBookById(id).orElseThrow(() -> {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
        });
    }



}
