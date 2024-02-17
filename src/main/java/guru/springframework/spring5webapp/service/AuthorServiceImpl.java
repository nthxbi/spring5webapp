package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }



    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
