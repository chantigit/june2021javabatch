package com.chanti.mapapps;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product>{
    private int id;
    private String brandName;
    private double price;
    public Product(){

    }

    public Product(int id, String brandName, double price) {
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
    //Sort by Id
    @Override
    public int compareTo(Product o) {
        return this.id-o.id;
    }
}
