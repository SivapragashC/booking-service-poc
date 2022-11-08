package net.apmoller.crb.ohm.microservices.infrastructure.contract.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BookingProduct {
    private String prod_name;
    private Long prod_price;
}
