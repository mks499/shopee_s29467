package com.example.shopee_s29467;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class ShopAppUnitTests {

    private Cart cart;
    private Customer customer;

    @Test
    void testCalculateCartEnoughBalance() {
        customer = new Customer(1, 134.0);
        cart = new Cart(customer);
        cart.addItemToCart("piwo");
        cart.addItemToCart("mleko");

        ShoppingService shoppingService = new ShoppingService(cart, customer);
        ReturnObjectInfo result = shoppingService.Calculate_cart();

        assertEquals(0, result.getStatusCode());
        assertEquals(126.1, result.getNewBalance());
    }

    @Test
    void testCalculateCartInsufficientBalance() {
        customer = new Customer(1, 5.0);
        cart = new Cart(customer);
        cart.addItemToCart("piwo");
        cart.addItemToCart("mleko");

        ShoppingService shoppingService = new ShoppingService(cart, customer);

        ReturnObjectInfo result = shoppingService.Calculate_cart();
        assertEquals(1, result.getStatusCode());
        assertEquals(5.0, result.getNewBalance());
    }
    @Test
    public void testCreateCorrectItem() {
        Item item = new Item("milk", 2.5);

        assertEquals("milk", item.getName());
        assertEquals(2.5, item.getPrice());
    }
    @Test
    void testCalculateWrongItemName() {
        customer = new Customer(1, 50.0);
        cart = new Cart(customer);
        cart.addItemToCart("piwwwwwo");
        cart.addItemToCart("mleko");

        ShoppingService shoppingService = new ShoppingService(cart, customer);

        ReturnObjectInfo result = shoppingService.Calculate_cart();
        assertEquals(0, result.getStatusCode());
        assertEquals(47.7, result.getNewBalance());


    }
}
