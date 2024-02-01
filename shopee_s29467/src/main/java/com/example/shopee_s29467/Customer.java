package com.example.shopee_s29467;

public class Customer {
    private double balance;
    private int id;
    public Customer(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public int getId() {return id;}
    public double getBalance() {return balance;}

}