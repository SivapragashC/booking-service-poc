package net.apmoller.crb.ohm.microservices.application.mapper;

import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.common.UtilBeans;
import net.apmoller.crb.ohm.microservices.common.abstraction.Mapper;
import net.apmoller.crb.ohm.microservices.domain.model.OrderModel;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements Mapper {

    public OrderModel processRequest(Order order) {
        return UtilBeans.getModelMapper().map(order, OrderModel.class);
    }

    public Order processResponse(OrderModel order) {
        return UtilBeans.getModelMapper().map(order, Order.class);
    }
}
