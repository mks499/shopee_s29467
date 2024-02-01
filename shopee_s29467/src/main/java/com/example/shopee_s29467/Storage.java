package com.example.shopee_s29467;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Storage {
    public List<Item> itemStorage = new ArrayList<>();
    private static Storage instance;
    public Item piwo;
    public Item mleko;

    public Storage() {
        piwo = new Item("piwo", 5.60);
        mleko = new Item("mleko", 2.30);
        itemStorage.add(piwo);
        itemStorage.add(mleko);
    }
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();}
        return instance;
    }

    public void addItem(Item item) {itemStorage.add(item);}
    public List<Item> getItemStorage() {return itemStorage;}
}
