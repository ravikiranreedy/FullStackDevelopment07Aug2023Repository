package com.gentech.abstractdemo;
abstract class demo1{
	abstract void addition(int x, int y);
	abstract void substraction(int x, int y);
}
class demo2 extends demo1{
	void addition(int x, int y) {
		int res=x-y;
        System.out.println("Addition: " +res);
		
	}
	void substraction(int x, int y) {
		int res=x-y;
        System.out.println("substraction: " +res);
	}	
}
class demo3 extends demo2{
	void method2()
	{
		System.out.println("multi level inheitance");
	}

}
public class Assignment6 {
	public static void main(String[] args) {
		demo3 obj3 = new demo3();
        obj3.addition(20,15);
        obj3.substraction(20,15);
        obj3.method2();

	}

}
