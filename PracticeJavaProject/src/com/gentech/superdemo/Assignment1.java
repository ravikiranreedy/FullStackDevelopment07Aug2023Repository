


package com.gentech.superdemo;

class grandfather21
{
	void grandfatherdetail(String fname) {
		System.out.println("the grand father name is:- "+fname);
	}
}
class father extends grandfather21{
	father(String fname){
		super.grandfatherdetail(fname);
	}
	void grandfatherdetail(String fname) {
		System.out.println("the father name is:- "+fname);
	}
}
class son extends father{
	 son(String fname) {
		 super(fname);
		super.grandfatherdetail(fname);
	}
	void grandfatherdetail(String fname) {
		System.out.println("the son name is:- "+fname);
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		son o1 = new son("yallareddy");
       o1.grandfatherdetail("ravi");
       
	}
}

