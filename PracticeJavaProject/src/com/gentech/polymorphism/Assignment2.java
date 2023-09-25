package com.gentech.polymorphism;

abstract class Vehicles {
    abstract void vehicleDetails(String s);
}

class Cars extends Vehicles {
    void carDetails(String s) {
        System.out.println("Car speed: " + s);
    }

    void vehicleDetails(String s) {
        System.out.println("Vehicle details: " + s);
    }
}

class Tractors extends Vehicles {
    void tractorDetails(String s) {
        System.out.println("Tractor speed: " + s);
    }

    void vehicleDetails(String s) {
        System.out.println("Vehicle details: " + s);
    }
}

class Trucks extends Vehicles {
    void truckDetails(String s) {
        System.out.println("Truck speed: " + s);
    }

    void vehicleDetails(String s) {
        System.out.println("Vehicle details: " + s);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Vehicles vehicle = null;

        Cars car = new Cars();
        Tractors tractor = new Tractors();
        Trucks truck = new Trucks();
        
        
        vehicle = car;
        car.carDetails("60kmph");

        
        vehicle = tractor;
        tractor.tractorDetails("30kmph");

  
        vehicle = truck;
        truck.truckDetails("70kmph");
    }
}
