package com.gentech.inhertance1;

class simple1{
	void greater(int x,int y){
		if(x>y) {
			System.out.println("the x is greater then y");
		}
		else
			System.out.println("y is lesser then x");
	}
}
class simple2 extends simple1
{
	void lesserdemo(int x,int y){
		
		if(x<y)
		{
			System.out.println("x is lesser then y");
		}
		else
			System.out.println("y is greater then x");
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		simple2 o2=new simple2();
		o2.greater(100,50);
		o2.lesserdemo(50,60);
		o2.lesserdemo(60,50);

	}

}
