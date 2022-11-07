package net.apmoller.crb.ohm.microservices.controller;

import net.apmoller.crb.ohm.microservices.application.controller.BookingController;
import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.application.service.BookingService;
import net.apmoller.crb.ohm.microservices.common.bean.Operations;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

import static org.mockito.Mockito.times;

@WebFluxTest(controllers = BookingController.class)
@ExtendWith(SpringExtension.class)
public class BookingControllerTest {


    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    BookingService bookingService;

    @MockBean
    Operations ops;

    @Test
    void getCustomerDetailsTest()
    {
        Order order=new Order("internal",1,"2020-04-28T14:45:15","2020-04-28T14:45:15","40F","india","nepal");
        List<Product> productList=List.of(new Product(UUID.randomUUID(),"phone",1000L,1));
        OrderDto orderDto=OrderDto.builder().order(order).productList(productList).build();
        Integer customerId=1;
        Mockito.when(ops.service(BookingService.class)).thenReturn(bookingService);
        Mockito.when(bookingService.getCustomerDetails(customerId)).thenReturn(Mono.just(orderDto));

        webTestClient.get()
                .uri("/getCustomerDetails/1")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$").isMap()
                .jsonPath("$.order").isEqualTo(order)
                .jsonPath("$.productList.[0].prod_name").isEqualTo(productList.get(0).getProd_name())
                .jsonPath("$.productList.[0].prod_price").isEqualTo(productList.get(0).getProd_price())
                .jsonPath("$.productList.[0].cust_id").isEqualTo(productList.get(0).getCust_id());
    }

    @Test
    void testCreateOrder() {
        Order order=new Order("internal",3,"2020-04-28T14:45:15","2020-04-28T14:45:15","40F","india","nepal");
        List<Product> productList=List.of(new Product(UUID.randomUUID(),"phone",1000L,3));
        OrderDto orderDto=OrderDto.builder().order(order).productList(productList).build();

        Mockito.when(ops.service(BookingService.class)).thenReturn(bookingService);
        Mockito.when(bookingService.createCustomerDetails(orderDto)).thenReturn(Mono.just(orderDto));

        webTestClient.post()
                .uri("/createCustomerDetails")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(orderDto))
                .exchange()
                .expectStatus().isOk();

        Mockito.verify(bookingService, times(1)).createCustomerDetails(orderDto);
    }
}
