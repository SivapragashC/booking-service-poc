package net.apmoller.crb.ohm.microservices.infrastructure.mapper.db;

import net.apmoller.crb.ohm.microservices.common.abstraction.Mapper;
import net.apmoller.crb.ohm.microservices.domain.model.OrderModel;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
import org.springframework.stereotype.Component;

@Component
public class OrderToProductMapper implements Mapper {
    public Product mapOrderToProduct(OrderModel orderModel) {
        return Product.builder().prod_price(39L).prod_name(orderModel.getDestination()).build();
    }

    public OrderModel mapProductToOrder(OrderModel orderModel, Product product) {
         orderModel.setDestination(product.getProd_name());
         return orderModel;
    }
}
