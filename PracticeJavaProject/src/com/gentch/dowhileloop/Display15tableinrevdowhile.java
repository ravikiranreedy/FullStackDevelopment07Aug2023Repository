package com.gentch.dowhileloop;

public class Display15tableinrevdowhile {

	public static void main(String[] args) {
		int result;
		int i=10;
		do 
		{
			result=15*i;

			System.out.println("15*"+i+"="+result);
			i--;
		}while(i>=1);
	}
}
