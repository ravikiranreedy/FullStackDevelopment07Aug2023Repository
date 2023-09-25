package com.getech.parameterized;
class Desktop {
	String brand;
	String model;
	String operatingSystem;

	Desktop(String des_brand, String des_models, String des_operatingSystems) {
		brand = des_brand;
		model = des_models;
		operatingSystem = des_operatingSystems;

		System.out.println("Desktop brand: " + brand);
		System.out.println("Desktop model: " + model);
		System.out.println("Operating system: " + operatingSystem);
		System.out.println("-----------------------------");
	}
}

class Laptop {
	String brand;
	String model;
	String operatingSystem;

	Laptop(String lap_brand, String lap_model, String lap_operatingSystem) {
		brand = lap_brand;
		model = lap_model;
		operatingSystem = lap_operatingSystem;

		System.out.println("Laptop brand: " + brand);
		System.out.println("Laptop model: " + model);
		System.out.println("Operating system: " + operatingSystem);
		System.out.println("-----------------------------");
	}
}

class Mobile {
	String brand;
	String model;
	String operatingSystem;

	Mobile(String mob_brand, String mob_model, String mob_operatingSystem) {
		brand = mob_brand;
		model = mob_model;
		operatingSystem = mob_operatingSystem;

		System.out.println("Mobile brand: " + brand);
		System.out.println("Mobile model: " + model);
		System.out.println("Operating system: " + operatingSystem);
		System.out.println("-----------------------------");
	}
}
public class desklaptopmobile {
	public static void main(String args[]) {
		Desktop desktop = new Desktop("Dell", "dell notepad", "Windows 10");
		Laptop laptop = new Laptop("HP", "hp gaming", "Windows 11");
		Mobile mobile = new Mobile("Samsung", "Galaxy S21", "Android 12");

	}

}

