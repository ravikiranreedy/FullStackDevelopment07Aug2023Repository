package com.gentech.polymorphism;

abstract class Food {
    abstract void foodDetails();
}

class Pizza extends Food {
    void foodDetails() {
        System.out.println("Pizza it is junk food .");
    }
}

class ricebath extends Food {
    void foodDetails() {
        System.out.println("rice bath is a popular dish in tamilnadu");
    }
}

class rotti extends Food {
    void foodDetails() {
        System.out.println("rotti uttar karnatka special ");
    }
}
public class Assignment4 {
	public static void main(String[] args) {
		  Food food = null;

	        Pizza pizza = new Pizza();
	        ricebath ribath = new ricebath();
	        rotti rott = new rotti();

	        food = pizza;
	        food.foodDetails();

	        food = ribath;
	        food.foodDetails();

	        food = rott;
	        food.foodDetails();
	}

}
