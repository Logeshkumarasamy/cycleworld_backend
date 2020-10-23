package com.cycleworld.Model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "favourite")
public class FavouriteIterm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "f_id")
    private Integer favid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserDetails_id")
    private UserDetails userId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "products_id")
    private product products;

    public FavouriteIterm(UserDetails userId, product products) {
        this.userId = userId;
        this.products = products;
    }

    public FavouriteIterm() {
    }

    public Integer getFavid() {
        return favid;
    }


    public void setFavid(Integer favid) {
        this.favid = favid;
    }

    public UserDetails getUserId() {
        return userId;
    }

    public void setUserId(UserDetails userId) {
        this.userId = userId;
    }

    public product getProducts() {
        return products;
    }

    public void setProducts(product products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "FavouriteIterm{" +
                "favid=" + favid +
                ", userId=" + userId +
                ", products=" + products +
                '}';
    }
}


