package com.gentech.abstractdemo;
class AbstractStatic2
{
	static void method1()
	{
		System.out.println("Static Block From Abstract Class");
	}
	static void method2()
	{
		System.out.println("Static Block 2 From Abstract Class");
	}
}
public class Assignment5 {
	public static void main(String[] args) {
		AbstractStatic2.method1();
		AbstractStatic2.method2();

	}

}
