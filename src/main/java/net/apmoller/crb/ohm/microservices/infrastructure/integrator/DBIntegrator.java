package net.apmoller.crb.ohm.microservices.infrastructure.integrator;

import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.common.abstraction.Integrator;
import net.apmoller.crb.ohm.microservices.common.bean.Operations;
import net.apmoller.crb.ohm.microservices.domain.model.OrderModel;
import net.apmoller.crb.ohm.microservices.infrastructure.connector.product.ProductConnector;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
import net.apmoller.crb.ohm.microservices.infrastructure.mapper.db.OrderToProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class DBIntegrator implements Integrator {
    @Autowired
    private Operations ops;

    public Mono<OrderModel> saveOrder(OrderModel orderModel) {
        return Mono.just(orderModel)
                .map(ops.mapper(OrderToProductMapper.class)::mapOrderToProduct)
                .flatMap(ops.connector(ProductConnector.class)::saveProduct)
                .flatMap(product -> mapToOrderModel(product, orderModel));
    }

    private Mono<? extends OrderModel> mapToOrderModel(Product product, OrderModel orderModel) {
        return Mono.just(orderModel).map(val -> ops.mapper(OrderToProductMapper.class).mapProductToOrder(orderModel, product));
    }

    public OrderModel fetchOrder(OrderModel orderModel) {
        return null;
    }

    @Override
    public Mono<OrderDto> getCustomerDetails(Integer customerId){
        return ops.connector(ProductConnector.class).getCustomerDetails(customerId);
    }

    @Override
    public Mono<OrderDto> createCustomerDetails(OrderDto orderDto) {
        return ops.connector(ProductConnector.class).createCustomerDetails(orderDto);
    }
}
