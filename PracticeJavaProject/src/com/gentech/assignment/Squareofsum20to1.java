package com.gentech.assignment;

public class Squareofsum20to1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=20;i>=1;i--)
		{
			int sqrt=i*i;
			System.out.println("squart root of"+i+ "="+sqrt);

			sum=sum+sqrt;
			{
				System.out.println("sum of square roots"+sum);
			}

		}

	}
}
