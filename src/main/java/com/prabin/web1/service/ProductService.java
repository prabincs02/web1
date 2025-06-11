package com.prabin.web1.service;

import com.prabin.web1.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

   int product =104;

    public int getProduct(){
        return product;
    }

    public int getby(int prodid) {
        if(prodid<101)
             return 100;
        else
             return 101;
    }
}
