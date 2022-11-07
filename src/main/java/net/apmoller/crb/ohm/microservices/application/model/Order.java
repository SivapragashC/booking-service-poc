package net.apmoller.crb.ohm.microservices.application.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "order_table_dev")
public class Order {

    @Column("customertype")
    private String customerType;

    @Id
    @Column("customerid")
    private Integer customerId;

    @Column("createddate")
    private String createdDate;

    @Column("lastupdatedtime")
    private String lastUpdatedTime;

    @Column("containertype")
    private String containerType;

    @Column("source")
    private String source;

    @Column("destination")
    private String destination;
}
