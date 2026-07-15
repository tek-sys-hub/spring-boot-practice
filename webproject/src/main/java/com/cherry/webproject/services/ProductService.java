package com.cherry.webproject.services;

import com.cherry.webproject.models.Product;
import com.cherry.webproject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // Created The List Mutable
//    public List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101 , "Samsung" , 100000 ) ,
//            new Product(102 , "Camera" , 50000),
//            new Product(103 , "Laptop" , 126000)
//            ));

    public List<Product> getProducts () {
        return repo.findAll();
    }

    public Product getProductById(int prosId) {
        return repo.findById(prosId).orElse(null);
    }
    public void addProduct (Product prod) {
        repo.save(prod);
    }

    public void upprod(Product prod) {
        repo.save(prod);
    }

    public void dltProd(int prodId) {
        repo.deleteById(prodId);
    }
}
