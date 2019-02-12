package org.catalog.service.web.model;

import lombok.Data;

@Data
public class ProductInventoryResponse {
	private String productCode;
    private Integer availableQuantity = 0;
}
