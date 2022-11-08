package net.apmoller.crb.ohm.microservices.common.abstraction;

import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.application.model.OrderRequest;
import reactor.core.publisher.Mono;

public interface Integrator {
    public Mono<OrderDto> getCustomerDetails(Integer customerId);
    public Mono<OrderDto> createCustomerDetails(OrderRequest orderRequest);
}
