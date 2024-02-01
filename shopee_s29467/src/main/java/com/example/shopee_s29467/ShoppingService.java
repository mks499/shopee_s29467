package com.example.shopee_s29467;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingService {

    private double full_price= 0;
    private double balance;
    private List<Item> cart;

    public ShoppingService(Cart customer_cart, Customer customer) {
        this.cart = new ArrayList<>(customer_cart.getCart());
        this.balance = customer.getBalance();

    }

    public ReturnObjectInfo Calculate_cart() {
        for (Item item : cart) {
            if (item.getName().equals("piwo") || item.getName().equals("mleko")) {
                full_price += item.getPrice();
            }
        }
        if (full_price > balance) {
            return new ReturnObjectInfo(1, balance);}
        else if (full_price < balance) {
            balance -= full_price;}
        return new ReturnObjectInfo(0, balance);
    }

}