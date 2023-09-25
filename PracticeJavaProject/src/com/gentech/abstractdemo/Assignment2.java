package com.gentech.abstractdemo;
abstract class ass1{
	static  {
		System.out.println("inside static abstract class");
	}
	static  {
		System.out.println("inside static two abstract class");

	}
}
class ass2 extends ass1{
	
}
public class Assignment2 {
	public static void main(String[] args) {
		ass2 o1=new ass2();

	}

}
