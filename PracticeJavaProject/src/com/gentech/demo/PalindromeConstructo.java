package com.gentech.demo;
class palindrome
{
	palindrome(int n)
	{
		int temp=n;
		int n1=0;
		while(temp>0)
		{
			int res=temp%10;
			n1=n1*10+res;
			temp=temp/10;
		}

		if(n1==n)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
}
public class PalindromeConstructo{

	public static void main(String[] args){
		
		palindrome obj = new palindrome(51215);
	}

}
