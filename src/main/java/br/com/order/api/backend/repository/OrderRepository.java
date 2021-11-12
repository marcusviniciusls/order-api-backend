package br.com.order.api.backend.repository;

import br.com.order.api.backend.document.Orderdocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Orderdocument, String> {

}
