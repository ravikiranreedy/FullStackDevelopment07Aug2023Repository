package com.gentch.dowhileloop;

public class Display5thtabledowhile {

	public static void main(String[] args) {
		int result;
		int i=1;
		do 
		{
			result=5*i;
			{
				System.out.println("5*"+i+"="+result);
			}
			i++;
		}while(i<=10);
	}
}
