package com.bootcoding.project.model;

public class MenuItem {
    int id;
    String menuName;
    boolen isVeg;
    double price;
    String flavour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public boolen getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(boolen isVeg) {
        this.isVeg = isVeg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
