package net.apmoller.crb.ohm.microservices.application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.apmoller.crb.ohm.microservices.infrastructure.contract.db.BookingProduct;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    private BookingOrder bookingOrder;
    private List<BookingProduct> bookingProductList;
}
