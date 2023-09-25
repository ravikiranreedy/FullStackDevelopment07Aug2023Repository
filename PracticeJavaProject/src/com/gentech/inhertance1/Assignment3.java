package com.gentech.inhertance1;

class fathern {
	void fathers(String fn) {
		System.out.println("head of the family is:-" + fn);
	}
}

class son1n extends fathern {
	void sonone(String s1) {
		System.out.println("he is the first son:-" + s1);
	}
}

class son2n extends son1n {
	void sontwo(String s2) {
		System.out.println("he is younger brother:-" + s2);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		son2n o = new son2n();
		o.fathers("nagareddy");
		o.sonone("ravi kiran reddy");
		o.sontwo("tarun kumar reddy");
	}

}
