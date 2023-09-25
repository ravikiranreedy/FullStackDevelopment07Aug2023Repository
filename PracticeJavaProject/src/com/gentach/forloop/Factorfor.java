package com.gentach.forloop;

public class Factorfor {

	public static void main(String[] args) {
		int j = Integer.parseInt(args[0]);
		int facto=1;
		for(int i=1;i<=j;i++)
		{
			facto=facto*i;
		}

		System.out.println("factorial of:-"+facto);		
	}



}
