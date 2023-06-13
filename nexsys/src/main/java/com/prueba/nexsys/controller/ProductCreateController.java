package com.prueba.nexsys.controller;

import com.prueba.nexsys.model.ProductRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nexsys/v1/products")
public class ProductCreateController {
    private final String API_URL = "https://api.escuelajs.co/api/v1/products";

    @PostMapping("/")
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest productRequest) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ProductRequest> request = new HttpEntity<>(productRequest, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                API_URL + "/products",
                HttpMethod.POST,
                request,
                String.class);

        return response;
    }
}
