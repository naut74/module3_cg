package com.example.viewcustomerlist;

public class Customer {
    private int id;
    private String name;
    private String dob;
    private String address;
    private String image;

    public Customer(int id, String name, String dob, String address, String image) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.image = image;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getImage() {
        return image;
    }
}
