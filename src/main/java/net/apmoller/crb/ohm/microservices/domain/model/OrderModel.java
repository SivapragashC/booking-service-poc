package net.apmoller.crb.ohm.microservices.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class OrderModel {
    private String customerType;
    private String customerId;
    private Date createdDate;
    private Date lastUpdatedTime;
    private String containerType;
    private String source;
    private String destination;
}
