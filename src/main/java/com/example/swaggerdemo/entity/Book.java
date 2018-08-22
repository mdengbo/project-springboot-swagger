package com.example.swaggerdemo.entity;

/**
 * @author madengbo
 * @create 2018-08-22 16:52
 * @desc
 * @Version 1.0
 **/
public class Book {
    private long id;
    private String name;
    private double price;

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }
}
