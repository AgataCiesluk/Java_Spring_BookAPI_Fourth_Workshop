package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.Book;
import pl.coderslab.BookService;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/books")
public class SpringDataBookController {

    private final BookService bookService;

    @GetMapping("/all")
    public String showBooks(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "allBooks";
    }

    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "bookForm-add";
    }

    @PostMapping("/add")
    public String saveBook(@ModelAttribute("book") @Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "bookForm-add";
        }
        bookService.addNewBook(book);
        return "redirect:http://localhost:8080/admin/books/all";
    }

    //edycję książki

    @GetMapping("/delete-confirm")
    public String deleteBookByIdConfirm(@RequestParam long id, Model model) {
        model.addAttribute("bookToDelete", bookService.getBookById(id).get());
        return "bookForm-deleteConfirmation";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id) {
        bookService.deleteBookById(id);
        return "redirect:http://localhost:8080/admin/books/all";
    }

    //wyświetlanie pojedynczej książki
    @GetMapping("/show-book/{id}")
    public String showOneBook(@PathVariable long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id).get());
        return "bookShowInfo";
    }
}
