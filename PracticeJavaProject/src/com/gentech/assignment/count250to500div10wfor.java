package com.gentech.assignment;

public class count250to500div10wfor {

	public static void main(String[] args) {
		int sum=0;
		for(int i=250;i<=500;i++)
		{
			if(i%10==0)
			{
				sum=sum+1;
			}
			
		}
		System.out.println(sum);
	}

}
