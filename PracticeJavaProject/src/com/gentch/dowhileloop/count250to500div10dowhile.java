package com.gentch.dowhileloop;

public class count250to500div10dowhile {

	public static void main(String[] args) {
		int count=0;
		int i=250;
		do {
			if(i%10==0)
			{
				count=count+1;
			}
			i++;
			
	
		}while(i<=500);
		System.out.println(count);

	}

}
