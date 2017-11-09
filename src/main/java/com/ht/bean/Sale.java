package com.ht.bean;


public class Sale {

    private Integer id;
    private Integer month;
    private Integer quantity;

    public Sale() {

    }

    public Sale(Integer id, Integer month, Integer quantity) {
        this.id = id;
        this.month = month;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
