package com.example.springproject2.controllers;

import com.example.springproject2.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/add")
    void addProduct(@RequestBody Product p) {
        System.out.println("Adding a product " + p.getName() + " " + p.getPrice());
    }

}
