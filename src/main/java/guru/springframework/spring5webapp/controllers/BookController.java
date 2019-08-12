package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class BookController {

    public BookController(){

    }
    private BookRepository bookRepository = new BookRepository() {
        @Override
        public <S extends Book> S save(S s) {
            return null;
        }

        @Override
        public <S extends Book> Iterable<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public Optional<Book> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable<Book> findAll() {
            return null;
        }

        @Override
        public Iterable<Book> findAllById(Iterable<Long> iterable) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Book book) {

        }

        @Override
        public void deleteAll(Iterable<? extends Book> iterable) {

        }

        @Override
        public void deleteAll() {

        }
    };

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll()); //get a list of books from the database

        return "books";
    }
}
