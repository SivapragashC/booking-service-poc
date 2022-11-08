package net.apmoller.crb.ohm.microservices.application.controller;

import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.application.model.OrderDto;
import net.apmoller.crb.ohm.microservices.application.model.OrderRequest;
import net.apmoller.crb.ohm.microservices.application.service.BookingService;
import net.apmoller.crb.ohm.microservices.common.bean.Operations;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;
//import com.example.repository.CustomerRepository;
import net.apmoller.crb.ohm.microservices.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class BookingController {

	@Autowired
	private Operations ops;

	@PostMapping("/processOrder")
	public Mono<Order> addOrder(@RequestBody(required = true) Order order) {
		return Mono.just(order).flatMap(ops.service(BookingService.class)::createOrder);
	}

	@GetMapping("/getCustomerDetails/{customerId}")
	public Mono<OrderDto> getCustomerDetails(@PathVariable Integer customerId){
		return ops.service(BookingService.class).getCustomerDetails(customerId);
	}

	@PostMapping("/createCustomerDetails")
	public Mono<OrderDto> createCustomerDetails(@RequestBody OrderRequest orderRequest)
	{
		return ops.service(BookingService.class).createCustomerDetails(orderRequest);
	}


}
