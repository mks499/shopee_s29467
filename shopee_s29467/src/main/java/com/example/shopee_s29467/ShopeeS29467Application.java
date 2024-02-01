package com.example.shopee_s29467;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS29467Application {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS29467Application.class, args);

		Customer customer = new Customer(1, 120);
		Cart cart = new Cart(customer);

		cart.addItemToCart("mleko");
		cart.addItemToCart("piwo");
		cart.addItemToCart("piwo");
		cart.addItemToCart("piwo");

		ShoppingService service = new ShoppingService(cart, customer);
		ReturnObjectInfo result = service.Calculate_cart();
		System.out.println("Status bledu to: " + result.getStatusCode());
		System.out.println("Stan konta klienta to: " + result.getNewBalance());


	}
}