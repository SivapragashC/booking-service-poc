package net.apmoller.crb.ohm.microservices.infrastructure.connector.product;


import lombok.extern.slf4j.Slf4j;
import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.infrastructure.connector.BaseOrderConnector;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
import net.apmoller.crb.ohm.microservices.infrastructure.repository.OrderRepository;
import net.apmoller.crb.ohm.microservices.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;


@Component
@Primary
@Slf4j
public class ProductConnector extends BaseOrderConnector {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepository orderRepository;

    public Mono<Product> saveProduct(Product product){
        return productRepository.save(product);
    }

    public Flux<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void create(Product product) {
        productRepository.save(product);
    }

    public Mono<Product> findById(UUID id) {
        return null;
    }

    public Flux<Product> findByName(String name) {
        return null;
    }

    public Flux<Product> findAll() {
        return null;
    }

    public Mono<Product> update(Product e) {
        return null;
    }

    public Mono<Void> delete(Integer id) {
        return null;
    }

    public Mono<OrderDto> getCustomerDetails(Integer customerId) {
        Mono<Order> order=orderRepository.findById(customerId);
        var productList=productRepository.findProductsByCustId(customerId).collectList();
        return order.zipWith(productList, OrderDto::new);
    }

    public void setCustomerId(Order savedItem, List<Product> productList) {
        productList.stream().forEach(s->s.setCust_id(savedItem.getCustomerId()));
    }

    public Mono<OrderDto> createCustomerDetails(OrderDto orderDto)
    {
        return orderRepository.save(orderDto.getOrder())
                .flatMap(savedItem ->
                {
                    setCustomerId(savedItem,orderDto.getProductList());
                    return productRepository.saveAll(orderDto.getProductList()).then(Mono.just(orderDto));
                });
    }
}
