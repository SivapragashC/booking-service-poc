package net.apmoller.crb.ohm.microservices.infrastructure.repository;

import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, UUID> {

    @Query(value = "SELECT * FROM product_dev p WHERE p.cust_id=:customerId")
    public Flux<Product> findProductsByCustId(Integer customerId);
}
