package com.cherry.webproject.controller;

import com.cherry.webproject.models.Product;
import com.cherry.webproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> products () {
        return service.getProducts();
    }

    @GetMapping("/products/{prosId}")
    public Product getProductById (@PathVariable int prosId) {
        return service.getProductById(prosId);
    }

    @PostMapping("/products")
    public void addProduct (@RequestBody Product prod) {service.addProduct(prod);}

    @PutMapping("/products")
    public void upProd (@RequestBody Product prod) {
        service.upprod(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void dltProd (@PathVariable int prodId) {
        service.dltProd(prodId);
    }

}
