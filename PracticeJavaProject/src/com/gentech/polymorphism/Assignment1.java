package com.gentech.polymorphism;

interface Vehicle {
    void vehicleDetails(String s);
}

interface Car extends Vehicle {
    void carDetails(String s);
}

interface Tractor extends Vehicle {
    void tractorDetails(String s);
}

interface Truck extends Vehicle {
    void truckDetails(String s);
}

class showall implements Car, Truck, Tractor {
   
    public void carDetails(String s) {
        System.out.println("Car speed: " + s);
    }

    public void tractorDetails(String s) {
        System.out.println("Tractor speed: " + s);
    }

    public void truckDetails(String s) {
        System.out.println("Truck speed: " + s);
    }

	
	public void vehicleDetails(String s) {
		System.out.println("vehicle dtaiss");
		
	}
}

public class Assignment1 {
    public static void main(String[] args) {
        Vehicle veh = null;

        showall o1 = new showall(); 

        veh = o1;
        veh.vehicleDetails("vehicles speed is");

        Car car = o1;
        car.carDetails("60kmph");

        Tractor tractor = o1;
        tractor.tractorDetails("30kmph");

        Truck truck = o1;
        truck.truckDetails("70kmph");
    }
}
