package com.gentech.whileloop;

public class displaycubeof10numberwhile {

	public static void main(String[] args) {

		int i=1;
		while(i<=10)
		{
			int cube=i*i*i;
			System.out.println("cube of"+i+ "="+cube);
			i++;
		}
	}
}
