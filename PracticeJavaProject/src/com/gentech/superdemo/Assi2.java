package com.gentech.superdemo;

class grandfather1 {
	String str;

	void show() {
		System.out.println("The grand  Parent name is:" + str);
	}
}

class father1 extends grandfather1 {
	String str;
	father1(String s1, String s2) {
		super.str = s1;
		this.str = s2;
	}
	void show2() {
		System.out.println("The father name is:" + str);
	}
}

class son1 extends father1 {
	String str;
	son1(String s1, String s2, String s3) {
		super(s1, s2);
		this.str = s3;
	}
	void show3() {
		System.out.println(" son name is:" + str);
	}
}

public class Assi2 {
	public static void main(String[] args) {
		son1 o = new son1("yallareddy", "nagareddy", "ravi");
		o.show();
		o.show2();
		o.show3();

	}
}
