package net.apmoller.crb.ohm.microservices.application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingOrder {
    private String customerType;
    private String createdDate;
    private String lastUpdatedTime;
    private String containerType;
    private String source;
    private String destination;
}
