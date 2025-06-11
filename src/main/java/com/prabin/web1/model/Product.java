package com.prabin.web1.model;


import org.springframework.stereotype.Component;

@Component
public class Product {
    private int number;

    public Product (){

    }
    public Product(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
