package com.gentech.superdemo;
class grandparent {
	int str;
	void show(int age) {
		System.out.println("The grandparent age is:" + age);
	}
}

class fathers extends grandparent {
	int str;
	fathers(int age ) {
		super.str =age;
		super.show(age);
	}

	void show(int age) {
		System.out.println("The father age is:" + age);

	}
}

class daughter extends fathers {
	int str;

	daughter(int age) {
		super(age);
		super.show(age);
		
	}

	void show(int age) {

		System.out.println("The son age is:" + age);
		
	}
}

public class Assign3 {
	public static void main(String[] args) {
		daughter c=new daughter(45);
		c.show(98);
		c.show(52);
	}

}
