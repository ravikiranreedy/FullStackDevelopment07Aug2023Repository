package com.gentech.whileloop;

public class Squareofsum20to1while {

	public static void main(String[] args) {
		int sum=0;
		int i=20;
		while(i>=1)
		{
			int sqrt=i*i;
			System.out.println("squart root of"+i+ "="+sqrt);
			i--;
			sum=sum+sqrt;
			System.out.println("sum of square roots"+sum);
		}
	}
}

