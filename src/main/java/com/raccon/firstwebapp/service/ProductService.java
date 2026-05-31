package com.raccon.firstwebapp.service;

import com.raccon.firstwebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone", 50000),
            new Product(102,"Ipad" , 35000),
            new Product(103,"Macbook" , 75000)));

    private Product findProductById(int id) {
        return products.stream()
                .filter(p -> p.getProdId() == id)
                .findFirst()
                .orElse(null);
    }


    public List<Product> getProducts(){
        return products ;
    }



    public Product getProd(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100,"No Item" , 0));
    }

    public void addProducts(Product prod){
        products.add(prod);
    }

    public void deleteProduct(int prodId) {
        Product index = findProductById(prodId);
        products.remove(index);
    }

    public void updateProduct(Product prod) {
        Product existing = findProductById(prod.getProdId());
        int index = products.indexOf(existing);
        products.set(index, prod);
    }
}
