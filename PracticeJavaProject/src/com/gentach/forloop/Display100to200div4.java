package com.gentach.forloop;

import java.util.Scanner;

public class Display100to200div4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valuee for X:");
		int x=sc.nextInt();
		System.out.println("Enter the condition:");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the value for Y:");
		int y=sc.nextInt();
		
				
		//String ch=sc.findInLine();
      //int x=10;
      //int y=2;

		char c=ch;
		switch (c)
		{
		case '+':
			   
				int res=x+y;
				System.out.println("it is an addition:"+res);
				break;
			
		case '-':
				int res1=x-y;
				System.out.println("it is an substraction:"+res1);
				break;
			
		case '*':
			   
				int res2=x*y;
				System.out.println("it is an multiplication:"+res2);
				break;
			
		case '/':
				int res3=x/y;
				System.out.println("it is an multiplication:"+res3);
				break;
			
		default:
	        System.out.println( "Invalid");
		}
	}
}

