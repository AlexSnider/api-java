package com.apiweb.ApiWeb.entity;

import jakarta.persistence.*;

import java.text.DateFormat;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userId;
    private String productsList;
    private DateFormat sell_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductsList() {
        return productsList;
    }

    public void setProductsList(String productsList) {
        this.productsList = productsList;
    }

    public DateFormat getSell_date() {
        return sell_date;
    }

    public void setSell_date(DateFormat sell_date) {
        this.sell_date = sell_date;
    }
}
