package com.gentech.abstractdemo;
abstract class demo11
{
	abstract void method1();
	abstract void method2();
}

abstract class demo22 extends demo11
{

	void method1()
	{
		System.out.println("hello");
	}
	abstract void method2();
}

class demo33 extends demo22
{
	void method2()
	{
		System.out.println("welcome");
	}
}

class demo44 extends demo11
{


	void method1()
	{
		System.out.println("hello");
	}
	void method2()
	{
		System.out.println("welcome");
	}
}
public class Assignment7 {
	public static void main(String[] args) {
		demo33 obj = new demo33();
		obj.method1();
		obj.method2();
		System.out.println();
		demo44 obj2 = new demo44();
		obj2.method1();
		obj2.method2();

	}

}
