package net.apmoller.crb.ohm.microservices.infrastructure.repository;

import net.apmoller.crb.ohm.microservices.application.model.Order;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface OrderRepository extends ReactiveCrudRepository<Order,Integer> {

    @Query("SELECT * FROM order_table_dev o where o.customerid=:id")
    public Mono<Order> findById(Integer id);

}
