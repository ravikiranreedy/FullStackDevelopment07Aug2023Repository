package com.gentech.demo;
class sum
{
	int d=0;
	int sum=0;
	sum(int n)
	{
		d=n;
		while(d>0)
		{
			sum=sum+(d%10);
			d=d/10;	
		}
		System.out.println("Sum : "+sum);
	}
}
public class SumConstructor {

	public static void main(String[] args){
		
		sum obj = new sum(987);

	}

}
