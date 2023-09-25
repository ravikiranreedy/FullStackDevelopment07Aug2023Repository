package com.gentech.inhertance1;

class father2{
	void fathers(String fn) {
		System.out.println("head of the family is:-"+fn);
	}
}
class son12 extends father2{
	void sonone(String s1) {
		System.out.println("he is the first son:-"+s1);
	}
}
class son22 extends father2{
	void sontwo(String s2) {
		System.out.println("he is the second son:-"+s2);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		son12 o=new son12();
		o.fathers("nagareddy");
		o.sonone("ravi kiran reddy");
		
		son22 o2=new son22();
		o2.fathers("nagareddy");
		o2.sontwo("tarun kumar reddy");

	}

}
