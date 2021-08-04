package com.oop;

public class ObjectOriented {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product tootbrush1 = new Product("Electric Toothbrush1", 3550);
		Product babyAlarm = new Product("Baby Alarm", 4999);
		
		// Static Method Call
		 Product tootbrush2 = Catalogue.getProduct("Electric Toothbrush2");
		
		cart.addProduct(tootbrush1);
		cart.addProduct(tootbrush2);
		cart.addProduct(babyAlarm);
		System.out.println(cart);
		System.out.println(cart.getTotalCost()); // Instance method call
		
	}
}
