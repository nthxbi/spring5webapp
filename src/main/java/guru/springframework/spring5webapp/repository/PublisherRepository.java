package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
