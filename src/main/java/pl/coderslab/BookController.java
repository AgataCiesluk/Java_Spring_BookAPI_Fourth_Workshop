package pl.coderslab;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        // operacje na obiekcie book
    }

    // Zwraca listę wszystkich książek.
    @GetMapping
    public List<Book> getAllBooks() {
        return mockBookService.getList();
    }



}
