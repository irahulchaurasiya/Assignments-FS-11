package com.Ecommerce.eCommerce.controller;

import com.Ecommerce.eCommerce.model.Product;
import com.Ecommerce.eCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public void addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
    }

    @GetMapping("products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping(params = "Category")
    public List<Product> getProductsByCategory(@RequestParam("Category")String Category){
        return  productService.getProductsByCategory(Category);
    }
    @DeleteMapping("product/{Id}")
    public void deleteById (@PathVariable Integer Id){
        productService.deleteById(Id);
    }
}