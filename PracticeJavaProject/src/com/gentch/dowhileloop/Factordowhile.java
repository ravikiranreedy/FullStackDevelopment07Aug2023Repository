package com.gentch.dowhileloop;

public class Factordowhile {

	public static void main(String[] args) {
		int j = Integer.parseInt(args[0]);
		int facto=1;
		int i=1;
		do
		{
			facto=facto*i;
			i++;
		}while(i<=j);
		System.out.println("factorial of:-"+facto);
	}
}
