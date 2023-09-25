package com.gentech.voidmethodprime;
class prime1
{
	//"the prime numbers from 100 to 50"
	static void isprime(int s,int e) {
		for(int i=s;i>=e;i--)
		{
		int k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}
			}
			if(k==0)
			{
				System.out.println(i);
			}
		}
	}
	//"the prime numbers from 1 to 50"
	static void isprime1(int s,int e) {
		for(int i=s;i<=e;i++)
		{
			int k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}
			}
			if(k==0)
			{
				System.out.println(i);
			}
		}
	}
	
	//"the sum of prime numbers from 100 to 200"
	static void sumofprime1(int s,int e) {
		int sum=0;
		for(int i=s;i<=e;i++)
		{
			int k=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}

			}

			if(k==1)
			{
				sum=sum+i;
			}
			
		}	System.out.println("the sum of prime numbers is:-"+sum);

	}
	
	//"the countprime numbers from 150 to 300"
	static void countofprime1(int s,int e) {
		int count=0;
		for(int i=s;i<=e;i++)
		{
			int k=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}

			}

			if(k==1)
			{
				count++;
			}

		}	System.out.println("the count of prime numbes:--"+count);

	}
}
public class Voidprime100to50 {

	public static void main(String[] args) {
		System.out.println("the prime numbers from 100 to 50");
		prime1.isprime(100,50);
		System.out.println("------------------------------------------------------");
	
		System.out.println("the prime numbers from 1 to 50");
		prime1.isprime1(1,50);
		System.out.println("------------------------------------------------------------");
		
		System.out.println("the sum of prime numbers from 100 to 200");
		prime1.sumofprime1(100, 200);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("the countprime numbers from 150 to 300");
		prime1.countofprime1(150, 300);
		System.out.println("---------------------------------------------------------------");



	}

}
