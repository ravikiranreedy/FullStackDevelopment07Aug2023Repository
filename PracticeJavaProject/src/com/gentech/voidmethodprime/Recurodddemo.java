package com.gentech.voidmethodprime;
class Odddemo{
	//the odd numbers  from 20 to 40
	static void oddnum(int num1,int num2)
	{
		if(num1<=num2)
		{
			if(num1%2==1)
			{
				System.out.println(num1+" ");

			}
			oddnum(num1+1,num2);
		}
	}
	//the even numbers  from 20 to 1
	static void evennum(int num1,int num2)
	{
		if(num1>=num2)
		{
			if(num1%2==0)
			{
				System.out.println(num1+" ");

			}
			evennum(num1-1,num2);
		}
	}
	//the numbers divisible by 8 from 1 to 100
	static void divnum(int num1,int num2)
	{
		if(num1<=num2)
		{
			if(num1%8==0)
			{
				System.out.println(num1+" ");

			}
			divnum(num1+1,num2);
		}
	}


	//the numbers count divisible by 10 from 100 to 200

	static int count=0; 

	static void divTenNum(int num1, int num2) {
		if (num1<=num2) {
			if (num1 % 10 == 0) {

				count=count+1;
			} 

			divTenNum(num1+1,num2);
			System.out.println(count);

		}
	} 


	//the sum of 20numbers 

	static int sum=0; 

	static void sumNum(int num1, int num2) {
		if (num1<=num2) {              
			sum=sum+num1;        
			sumNum(num1+1,num2);
			System.out.println(sum);

		}
	} 

	// Display Tenth Table

	static void showtentable(int num1)
	{
		if(num1<=10)
		{
			System.out.println("10*"+num1+"="+num1*10);


			showtentable(num1+1);
		}
	}

	//Display fiveTable in reverse

	static void showfivetable(int num1)
	{
		if(num1>=1)
		{
			System.out.println("5*"+num1+"="+num1*5);

			showfivetable(num1-1);

		}
	}

}
public class Recurodddemo {

	public static void main(String[] args) {
		System.out.println("the odd numbers from 40 to 20");
		Odddemo.oddnum(10, 40);

		System.out.println("the even numbers from 20 to 1");
		Odddemo.evennum(20,1);

		System.out.println("the div by 8 numbers from 1 to 100");
		Odddemo.divnum(1,100);

		System.out.println("Numbers divisible by 10 from 100 to 200:");
		Odddemo.divTenNum(100,200);

		System.out.println("Numbers divisible by 10 from 100 to 200:");
		Odddemo.sumNum(0,20);

		System.out.println("Numbers divisible by 10 from 100 to 200:");
		Odddemo.showtentable(1);

		System.out.println("Numbers divisible by 10 from 100 to 200:");
		Odddemo.showfivetable(10);






	}

}
