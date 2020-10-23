package com.cycleworld.Model;

import javax.persistence.*;

@Entity
public class Sellingorder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oid;
    private float tamount;
    private float quanity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserDetails_id")
    private UserDetails userDetails;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public float getTamount() {
        return tamount;
    }

    public void setTamount(float tamount) {
        this.tamount = tamount;
    }

    public float getQuanity() {
        return quanity;
    }

    public void setQuanity(float quanity) {
        this.quanity = quanity;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Sellingorder() {
    }

    @Override
    public String toString() {
        return "Sellingorder{" +
                "oid=" + oid +
                ", tamount=" + tamount +
                ", quanity=" + quanity +
                ", userDetails=" + userDetails +
                '}';
    }
}

