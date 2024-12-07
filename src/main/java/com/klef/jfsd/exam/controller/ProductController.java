package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Endpoint to fetch all products
     * 
     * @return List of products in JSON format
     */
    @GetMapping("/products")
    public List<Map<String, Object>> viewAllProducts() {
        return productService.getAllProducts();
    }
}
