package com.larissa.webServices.repositories;

import com.larissa.webServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
