package com.hentech.constuctoroverloading;
class Order {

	Order(String name, int orderid) {

		System.out.println("Order Name : " +name);
		System.out.println("Order code : " +orderid);
	}


	Order(String web) {

		System.out.println("Order Price : " +web);

	}

}

public class ordersdemo {

	public static void main(String[] args) {
		Order obj = new Order("mobile",1235);
		Order obj2 = new Order("amazon");



	}

}
