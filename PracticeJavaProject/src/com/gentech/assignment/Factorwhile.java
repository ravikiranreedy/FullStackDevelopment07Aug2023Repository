package com.gentech.assignment;

public class Factorwhile {

	public static void main(String[] args) {
		int j = Integer.parseInt(args[0]);
		int facto=1;
		int i=1;
		while(i<=j)
{
	facto=facto*i;
	i++;
}
System.out.println("factorial of:-"+facto);	

	}

}
