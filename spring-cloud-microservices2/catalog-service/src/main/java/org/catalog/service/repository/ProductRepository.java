package org.catalog.service.repository;

import java.util.Optional;

import org.catalog.service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}
