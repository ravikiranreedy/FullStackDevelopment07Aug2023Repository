package com.gentech.interfacedemo;
//intrface contain three variables
interface Demo11 {
	int var1 = 42; 
	String var2 = "ravi kiran reddy";
	double var3 = 3.14;

	void method1(); 
	void method2();
	void method3();
}

class Demo22 implements Demo11 {
	Demo22(){
		System.out.println("the implements");

	}
	public void method1() {
		System.out.println("method 1 executed:-"+var1);
	}

	public void method2() {
		System.out.println("methood 2 executed:-"+var2);
	}

	public void method3() {
		System.out.println("method 3 executed:-"+var3);
	}

}

public class Assignment5 {
	public static void main(String[] args) {
		Demo22 obj = new Demo22();
		obj.method1();
		obj.method2();
		obj.method3();

	}
}
