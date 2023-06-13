package com.prueba.nexsys.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nexsys/v1/categories")
public class CategoryController {
    private final String API_URL = "https://api.escuelajs.co/api/v1/categories";

    @GetMapping("/")
    public ResponseEntity<String> getAllCategories() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(API_URL + "/categories", String.class);
        return response;
    }
}
