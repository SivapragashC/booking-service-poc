package net.apmoller.crb.ohm.microservices.domain.service;

import lombok.extern.slf4j.Slf4j;
import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.common.bean.Operations;
import net.apmoller.crb.ohm.microservices.domain.model.OrderModel;
import net.apmoller.crb.ohm.microservices.infrastructure.integrator.DBIntegrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@Slf4j
public class BookingDomainService extends BaseService {

    @Autowired
    private Operations ops;

    public Mono<OrderModel> processOrder(OrderModel orderModel) {
        return Mono.just(orderModel)
                .flatMap(getOps().integrator(DBIntegrator.class)::saveOrder);
    }

    public Mono<OrderDto> getCustomerDetails(Integer customerId){
        return ops.integrator(DBIntegrator.class).getCustomerDetails(customerId);
    }

    public Mono<OrderDto> createCustomerDetails(OrderDto orderDto) {
        return ops.integrator(DBIntegrator.class).createCustomerDetails(orderDto);
    }
}
