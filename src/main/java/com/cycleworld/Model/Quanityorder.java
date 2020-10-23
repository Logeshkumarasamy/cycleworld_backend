package com.cycleworld.Model;

import javax.persistence.*;

@Entity
public class Quanityorder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qId;
    private int nQuanity;
    private String tPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "products_id")
    private product products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Sellingorder_id")
    private Sellingorder sellingorder;

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public int getnQuanity() {
        return nQuanity;
    }

    public void setnQuanity(int nQuanity) {
        this.nQuanity = nQuanity;
    }

    public String gettPrice() {
        return tPrice;
    }

    public void settPrice(String tPrice) {
        this.tPrice = tPrice;
    }

    public Quanityorder() {
    }

    @Override
    public String toString() {
        return "Quanityorder{" +
                "qId=" + qId +
                ", nQuanity=" + nQuanity +
                ", tPrice='" + tPrice + '\'' +
                '}';
    }
}
