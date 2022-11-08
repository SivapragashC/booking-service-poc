package net.apmoller.crb.ohm.microservices.application.service;

import net.apmoller.crb.ohm.microservices.application.mapper.OrderMapper;
import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.application.model.OrderRequest;
import net.apmoller.crb.ohm.microservices.application.validation.BookingOrderValidator;
import net.apmoller.crb.ohm.microservices.domain.service.BookingDomainService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookingService extends BaseService {

    public Mono<Order> createOrder(Order order) {
        return Mono.just(order)
                .flatMap(ops.validator(BookingOrderValidator.class)::validateOrder)
                .map(ops.mapper(OrderMapper.class)::processRequest)
                .flatMap(ops.service(BookingDomainService.class)::processOrder)
                .map(ops.mapper(OrderMapper.class)::processResponse);
    }

    public Mono<OrderDto> getCustomerDetails(Integer customerId) {
        return ops.service(BookingDomainService.class).getCustomerDetails(customerId);
    }

    public Mono<OrderDto> createCustomerDetails(OrderRequest orderRequest) {
        return ops.service(BookingDomainService.class).createCustomerDetails(orderRequest);
    }
}
