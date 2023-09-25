package com.gentech.inhertance1;
class stud11 {
	String names;
	int rollno;
	int mobilenum;
	String fathername;

	stud11(String name, int r,String father) {
		names = name;
		rollno = r;
		fathername=father;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);

	}

	stud11(int cc) {
		mobilenum = cc;
		System.out.println("Super Class College Code : " + mobilenum);
	}
}

class stud22 extends stud11 {
	String names;
	int rollno;
	int mobilenum;
	String fathername;


	stud22(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	stud22(int cc) {
		super(cc);
		mobilenum = cc;
		System.out.println("Child class 1 College Code : " + mobilenum);
	}
}

class stud33 extends stud22 {
	String names = "";
	int rollno;
	int mobilenum;
	String fathername;

	stud33(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	stud33(int cc)
	{
		super(cc);
		mobilenum = cc;
		System.out.println("Child Class 2 College Code : " +mobilenum);
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		stud33 obj = new stud33("ravi kiran reddy", 067,"nagareddy");
		stud33 obj2 = new stud33(319067);

	}

}
