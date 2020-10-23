package com.cycleworld.Model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class product {

    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int pid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "b_id")
    private Brand brandId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cid")
    private Category categories;

    @Column(name = "productName")
    private String productName;

    @Column(name = "price")
    private Integer price;

    @Column(name = "size")
    private int size;
    @Column(name = "images")
    private String images;



    public product() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrandId() {
        return brandId;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

    public Category getCategories() {
        return categories;
    }

    public void setCategories(Category categories) {
        this.categories = categories;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "product{" +
                "pid=" + pid +
                ", productName='" + productName + '\'' +
                ", brandId=" + brandId +
                ", categories=" + categories +
                ", price=" + price +
                ", size=" + size +
                ", images='" + images + '\'' +
                '}';
    }
}
