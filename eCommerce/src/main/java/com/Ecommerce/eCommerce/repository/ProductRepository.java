package com.Ecommerce.eCommerce.repository;

import com.Ecommerce.eCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product , Integer> {

    List<Product> findByProductCategory(String category);
}
