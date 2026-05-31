package com.raccon.firstwebapp.controller;

import com.raccon.firstwebapp.model.Product;
import com.raccon.firstwebapp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProd(@PathVariable int prodId){
        return service.getProd(prodId);
    }

    @PostMapping( "/products")
    public void addProduct(@RequestBody Product prod){
        service.addProducts(prod);
        System.out.print(prod);
    }

    @PutMapping("/products/{prodId}")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

    
}
