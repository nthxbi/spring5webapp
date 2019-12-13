package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll()); //get a list of books from the database

        return "books";
    }
}
