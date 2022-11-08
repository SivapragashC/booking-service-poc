package net.apmoller.crb.ohm.microservices.infrastructure.mapper.db;

import net.apmoller.crb.ohm.microservices.application.model.BookingOrder;
import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.common.abstraction.Mapper;
import net.apmoller.crb.ohm.microservices.domain.model.OrderModel;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.BookingProduct;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderToProductMapper implements Mapper {
    public Product mapOrderToProduct(OrderModel orderModel) {
        return Product.builder().prod_price(39L).prod_name(orderModel.getDestination()).build();
    }

    public OrderModel mapProductToOrder(OrderModel orderModel, Product product) {
         orderModel.setDestination(product.getProd_name());
         return orderModel;
    }

    public Order bookingOrderToOrder(BookingOrder bookingOrder)
    {
        Order order=new Order();
        BeanUtils.copyProperties(bookingOrder,order);
        return order;
    }

    public List<Product> bookingProductToProduct(List<BookingProduct> bookingProductList)
    {
        List<Product> productList=new ArrayList<>();
        bookingProductList.stream()
                .forEach(s->productList.add(Product.builder().prod_price(s.getProd_price()).prod_name(s.getProd_name()).build()));
        return productList;
    }
}
