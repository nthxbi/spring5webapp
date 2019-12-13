package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
