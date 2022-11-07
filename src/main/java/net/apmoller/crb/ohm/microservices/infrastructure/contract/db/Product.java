package net.apmoller.crb.ohm.microservices.infrastructure.contract.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;


@Table(name="product_dev")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Product {
	@Id
	private UUID prod_id;

	@Column
	private String prod_name;

	@Column
	private Long prod_price;

	@Column
	private Integer cust_id;
}
