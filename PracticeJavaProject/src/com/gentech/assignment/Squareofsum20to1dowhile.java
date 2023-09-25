package com.gentech.assignment;

public class Squareofsum20to1dowhile {

	public static void main(String[] args) {
		int sum=0;
		int i=20;
		do
		{
			
			int sqrt=i*i;
			
			System.out.println("squart root of"+i+ "="+sqrt);
			i--;
			sum=sum+sqrt;
			{
				System.out.println("sum of square roots"+sum);
			}

		}	while(i>=1);
	}

}
