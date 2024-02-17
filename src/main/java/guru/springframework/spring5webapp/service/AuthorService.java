package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.model.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
