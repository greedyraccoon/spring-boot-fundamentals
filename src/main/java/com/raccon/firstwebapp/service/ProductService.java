package com.raccon.firstwebapp.service;

import com.raccon.firstwebapp.model.Product;
import com.raccon.firstwebapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone", 50000),
//            new Product(102,"Ipad" , 35000),
//            new Product(103,"Macbook" , 75000)));
//
//    private Product findProductById(int id) {
//        return products.stream()
//                .filter(p -> p.getProdId() == id)
//                .findFirst()
//                .orElse(null);
//    }

    public List<Product> getProducts(){
        return repo.findAll();
    }


    public Product getProd(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public void addProducts(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }
}
