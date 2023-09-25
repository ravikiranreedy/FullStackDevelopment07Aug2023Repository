package com.gentech.abstractdemo;
abstract class noargs{
	noargs()
	{
		System.out.println("it is no args constructor");
	}
}

class noargs1 extends noargs { 


}
public class Assignment3 {

	public static void main(String[] args) {
		noargs1 o1=new noargs1();


	}

}
