package net.apmoller.crb.ohm.microservices.application.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.Product;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private Order order;
    private List<Product> productList;
}
