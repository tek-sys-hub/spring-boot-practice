package com.cherry.webproject.services;

import com.cherry.webproject.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Service
public class ProductService {

    // Created The List Mutable
    public List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101 , "Samsung" , 100000 ) ,
            new Product(102 , "Camera" , 50000),
            new Product(103 , "Laptop" , 126000)
            ));

    public List<Product> getProducts () {
        return products;
    }

    public Product getProductById(int prosId) {
        return products.stream().
                filter(p -> p.getProsId() == prosId)
                .findFirst().get();
    }
    public void addProduct (Product prod) {
        products.add(prod);
    }

    public void upprod(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getProsId() == prod.getProsId()) {
                index = i;
            }
        }
        products.set(index,prod);
    }
}
