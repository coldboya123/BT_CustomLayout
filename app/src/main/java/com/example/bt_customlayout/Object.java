package com.example.bt_customlayout;

public class Object {
    private int img;
    private String name;
    private int quantity;
    private double price;

    @Override
    public String toString() {
        return "Object{" +
                "img=" + img +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Object(int img, String name, int quantity, double price) {
        this.img = img;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
