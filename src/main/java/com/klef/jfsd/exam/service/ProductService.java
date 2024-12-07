package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    // URL for the Fake Store API
    private static final String API_URL = "https://fakestoreapi.com/products";

    /**
     * Method to fetch all products from the Fake Store API
     * 
     * @return List of products as a List of Maps (key-value pairs)
     */
    public List<Map<String, Object>> getAllProducts() {
        // Use RestTemplate to make a GET request and parse the response as a List
        return restTemplate.getForObject(API_URL, List.class);
    }
}
