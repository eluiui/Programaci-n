package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.inject.Singleton;

@Entity
@Table(name="products")
@Singleton
public class Products {

    @Id
    @Column(name="name")
    private String name;

    @Enumerated(EnumType.STRING)
    private ProductEnum productEnum;

    @Column(name="price")
    private double price;

    public Products() {}

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
}