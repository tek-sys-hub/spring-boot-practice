package com.cherry.webproject.controller;

import com.cherry.webproject.models.Product;
import com.cherry.webproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> products () {
        return service.getProducts();
    }

    @RequestMapping("/products/{prosId}")
    public Product getProductById (@PathVariable int prosId) {
        return service.getProductById(prosId);
    }
}
