package guru.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
