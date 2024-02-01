package com.example.shopee_s29467;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Item> cart = new ArrayList<>();
    private Customer customer;

    public Cart(Customer customer) {
        this.customer = customer;}
    public void addItemToCart(String addedItem) {
        Storage storage = Storage.getInstance();
        List<Item> itemStorage = storage.getItemStorage();

        for (Item item : itemStorage) {
            if (item.getName().equals(addedItem)) {
                System.out.println(item.getName());
                cart.add(item);
                break;
            }
        }
    }

    public List<Item> getCart() {return cart;}
}