package guru.springframework.spring5webapp.Bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component //makes it a spring bean, it will be wired as spring context
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //publisher
        Publisher publisher = new Publisher();
        publisher.setName("Foo");
        publisher.setAddress("15 Troye street");

        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Designs", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB", "23455", publisher);
        rod.getBooks().add(noEjb);

        authorRepository.save(rod);
        bookRepository.save(noEjb);

    }
}
