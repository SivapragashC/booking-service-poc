package net.apmoller.crb.ohm.microservices.application.validation;

import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.common.abstraction.Validator;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookingOrderValidator implements Validator {
    public Mono<Order> validateOrder(Order order){
        return Mono.just(order);
    }
}
