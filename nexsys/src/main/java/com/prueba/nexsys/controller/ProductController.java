package com.prueba.nexsys.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nexsys/v1/products")
public class ProductController {
    private final String API_URL = "https://api.escuelajs.co/api/v1/products";

    @GetMapping("/all")
    public ResponseEntity<String> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(API_URL + "/products", String.class);
        return response;
    }
}
