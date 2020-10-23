package com.cycleworld.Model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @Column(name = "cid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int c_id;

    @Column(name = "category_type")
    private String category_type;

    public Category() {
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "c_id=" + c_id +
                ", category_type='" + category_type + '\'' +
                '}';
    }
}
