package com.getech.parameterized;
class twoWheel {
	String brand;
	String model;
	String type;

	twoWheel(String tw_brand, String tw_model, String tw_type) {
		brand = tw_brand;
		model = tw_model;
		type = tw_type;

		System.out.println("Two-Wheeler brand: " + brand);
		System.out.println("Two-Wheeler model: " + model);
		System.out.println("Two-Wheeler type: " + type);
		System.out.println("-----------------------------");
	}
}

class fourWheel {
	String brand;
	String model;
	String type;

	fourWheel(String fw_brand, String fw_model, String fw_type) {
		brand = fw_brand;
		model = fw_model;
		type = fw_type;

		System.out.println("Four Wheeler brand: " + brand);
		System.out.println("Four Wheeler model: " + model);
		System.out.println("Four Wheeler type: " + type);
		System.out.println("-----------------------------");
	}
}

class heavyVehicle {
	String brand;
	String model;
	String type;

	heavyVehicle(String hv_brand, String hv_model, String hv_type) {
		brand =hv_brand;
		model = hv_model;
		type = hv_type;

		System.out.println("Heavy Vehicle brand: " + brand);
		System.out.println("Heavy Vehicle model: " + model);
		System.out.println("Heavy Vehicle type: " + type);
		System.out.println("-----------------------------");
	}
}

public class Twofourhevayvehicle {

	public static void main(String[] args) {
		twoWheel twoWheel = new twoWheel("Honda", "shine", "Sport");
		fourWheel fourWheel = new fourWheel("Toyota", "Carnival", "Sedan");
		heavyVehicle heavyVehicle = new heavyVehicle("Volvo", "FH16", "Truck");

	}

}

