package com.cycleworld.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Brand")
public class Brand {

    @Id
    @Column(name = "b_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int brand_id;


    @Column(name = "brandname")
    private String brandName;

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public Brand() {
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    @Override
    public String toString() {
        return "Brand{" +
                "brand_id=" + brand_id +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}

