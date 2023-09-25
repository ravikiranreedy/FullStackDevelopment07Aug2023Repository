package com.gentech.inhertance1;
class stud31 {
	String names;
	int rollno;
	int pincode;

	stud31(String name, int r, int cc) {
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class stud32 extends stud31 {
	String names;
	int rollno;
	int pincode;

	stud32(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class stud34 extends stud32 {
	String names = "";
	int rollno;
	int pincode;

	stud34(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class stud44 extends stud31 {
	String names = "";
	int rollno;   
	int pincode;

	stud44(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + pincode);
	}
}


public class Assignment8 {

	public static void main(String[] args) {
		stud44 obj = new stud44("Bhimanagouda ", 84, 560072);
		stud34 obj2 = new stud34("Adarsha", 44,560017);


	}

}
