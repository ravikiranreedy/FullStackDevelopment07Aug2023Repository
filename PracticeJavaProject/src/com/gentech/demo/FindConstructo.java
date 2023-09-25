package com.gentech.demo;
class find
{
	int c = 0;
	int temp = 0;
	find(int n)
	{
		temp=n;
		c=n%10;
		while(c>0)
		{
			if((temp%10)==c)
			{
				temp=temp/10;
				c--;
			}
			else
			{
				System.out.println("Missing : "+c);
				break;
			}
		}
	}
}
public class FindConstructo {

	public static void main(String[] args){

		find ob1= new find(1345678);
		find ob2= new find(1235678);
		find ob3= new find(1234578);
		find ob4= new find(2345678);

	}
}
