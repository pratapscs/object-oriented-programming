package com.oop;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

	// Java 9 - Factory method
	/*
		private static Map<String,Product> productMap = Map.of(
				"Electric Toothbrush", new Product("Electric Toothbrush1", 3550),
				"Baby Alarm", new Product("Baby Alarm", 4999)
		);
	*/
	
	// Java 8
	private static Map<String,Product> productMap = new HashMap<>();
	
	static {
		productMap.put("Electric Toothbrush", new Product("Electric Toothbrush1", 3550));
		productMap.put("Baby Alarm", new Product("Baby Alarm", 4999));
	}
	
	public static Product getProduct(String productName) {
		return productMap.get(productName);
	}

}
