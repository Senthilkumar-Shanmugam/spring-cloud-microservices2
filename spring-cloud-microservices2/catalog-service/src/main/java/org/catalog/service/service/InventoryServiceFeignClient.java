package org.catalog.service.service;

import java.util.List;

import org.catalog.service.web.model.ProductInventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory-service")
public interface InventoryServiceFeignClient {
	@GetMapping("/api/inventory")
    List<ProductInventoryResponse> getInventoryLevels();

    @GetMapping("/api/inventory/{productCode}")
    List<ProductInventoryResponse> getInventoryByProductCode(String productCode);

}
