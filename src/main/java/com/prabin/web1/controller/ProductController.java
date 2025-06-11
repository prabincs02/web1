package com.prabin.web1.controller;

import com.prabin.web1.model.Product;
import com.prabin.web1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

   @RequestMapping("/product")
    public int getProducts(){

        return service.getProduct();
    }

    @RequestMapping("/products/{id}")
    public int getbyid(@PathVariable int id){
       return service.getby(id);
    }
}
