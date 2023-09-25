package com.gentech.inhertance1;
class stud1 {
	String names;
	int rollno;
	int mobilenum;

	stud1(String name, int usn, int cc) {
		names = name;
		rollno = usn;
		mobilenum = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class stud2 extends stud1 {
	String names;
	int rollno;
	int mobilenum;

	stud2(String name, int usn, int cc) {
		super(name, usn, cc);
		names = name;
		rollno = usn;
		mobilenum = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class stud3 extends stud2 {
	String names = "";
	int rollno;
	int mobilenum;

	stud3(String name,int usn,int cc)
	{
		super(name,usn,cc);
		names = name;
		rollno = usn;
		mobilenum = cc;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " +mobilenum);
	}
}

public class Assignment6 {

	public static void main(String[] args) {
		stud3 obj = new stud3("tarun kumar reddy", 46,560098);

	}

}
