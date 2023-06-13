package com.prueba.nexsys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String name;
    private double priceFinal;
    private String description;
    private int categoryId;
    private String imageUrl;
}
