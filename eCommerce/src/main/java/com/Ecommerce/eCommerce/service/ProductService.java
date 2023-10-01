package com.Ecommerce.eCommerce.service;

import com.Ecommerce.eCommerce.model.Product;
import com.Ecommerce.eCommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByProductCategory(category);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}