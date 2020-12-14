package com.cycleworld.Model;

import javax.persistence.*;

@Entity
public class Newsletter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "gmailId")
    private String gmailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGmailId() {
        return gmailId;
    }

    public void setGmailId(String gmailId) {
        this.gmailId = gmailId;
    }

    public Newsletter() {
    }

    @Override
    public String toString() {
        return "Newsletter{" +
                "id=" + id +
                ", gmailId='" + gmailId + '\'' +
                '}';
    }
}
