package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.model.Book;

public interface BookService {

    Iterable<Book> findAll();
}
