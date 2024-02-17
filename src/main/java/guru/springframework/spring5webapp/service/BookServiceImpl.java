package guru.springframework.spring5webapp.service;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll(){
        return bookRepository.findAll();
    }
}
