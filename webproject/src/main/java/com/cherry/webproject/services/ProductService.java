package com.cherry.webproject.services;

import com.cherry.webproject.models.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {

    public List<Product> products = Arrays.asList(
            new Product(101 , "Samsung" , 100000 ) ,
            new Product(102 , "Camera" , 50000),
            new Product(103 , "Laptop" , 126000)
            );

    public List<Product> getProducts () {
        return products;
    }
}
