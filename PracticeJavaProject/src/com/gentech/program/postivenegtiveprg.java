package com.gentech.program;

public class postivenegtiveprg {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num > 0) 
		{
			System.out.println(num + " the given number is positive");
		}
		else if (num < 0)
		{
			System.out.println(num + " the given number is negative");
		} else 
		{
			System.out.println(num + " the given number is zero");
		}
	}

}
