package com.bootcoding.project.model;

public class Order {
    int id;
    string deliveryAddress;
    Date orderDate;
    double amount;
    String restaurentName;
    String customerName;



    public void setCustmerName(String custmerName) {
        this.custmerName = custmerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(string deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestaurentName() {
        return restaurentName;
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }
    public String getCustomerName() {
        return customerName;
    }
}
