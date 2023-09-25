package com.hentech.constuctoroverloading;
class Product {
	Product(String name, int pc) {

		System.out.println("Product Name : " + name);
		System.out.println("Product code : " +pc);
	}

	Product(int pp) {
		
		System.out.println("Product_Price : " + pp);

	}

}

public class productsdemo {

	public static void main(String[] args) {
		Product obj = new Product("mobile", 10);
		Product obj2 = new Product(10000);

	}

}
