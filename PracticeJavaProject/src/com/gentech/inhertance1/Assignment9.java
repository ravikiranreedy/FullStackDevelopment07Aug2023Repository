package com.gentech.inhertance1;
class stud91 {
	String names;
	int rollno;
	int pincode;

	stud91(String name, int rn) {
		names = name;
		rollno = rn;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	stud91(int pin) {
		pincode = pin;
		System.out.println("Super Class College Code : " + pincode);
	}
}

class stud92 extends stud91 {
	String names;
	int rollno;
	int pincode;

	stud92(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	stud92(int cc) {
		super(cc);
		pincode = cc;
		System.out.println("Child class 1 College Code : " + pincode);
	}
}

class stud93 extends stud92 {
	String names = "";
	int rollno;
	int pincode;

	stud93(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	stud93(int cc) {
		super(cc);
		pincode = cc;
		System.out.println("Child Class 2 College Code : " + pincode);
	}
}

class stud94 extends stud91 {
	String names = "";
	int rollno;
	int pincode;

	stud94(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	stud94(int cc)
	{
		super(cc);
		pincode = cc;
		System.out.println("Child Class 2 College Code : " +pincode);
	}
}

public class Assignment9 {

	public static void main(String[] args) {
		stud93 obj = new stud93("ravi kiran reddy", 24);
		System.out.println();
		System.out.println();
		
		stud93 obj2 = new stud93(560075);
		System.out.println();
		System.out.println();
		
		stud94 obj3 = new stud94("tarun kumar reedy", 11);
		System.out.println();
		System.out.println();
		
		stud94 obj4 = new stud94(584103);


	}

}
