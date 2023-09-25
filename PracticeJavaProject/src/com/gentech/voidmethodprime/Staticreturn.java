package com.gentech.voidmethodprime;
class sample1
{
	// return concatination of 2d 3*3 char array using static method

	static String ConcatDemo(char a[][])
	{

		String s=" ";

		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				s=s+a[i][j];
			}

		}

		return s;
	}


	//reverse char array 

	static char[][] reversechar(char a[][])
	{
		char c[][] =new char[a.length][a[0].length];	

		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[j][i];
			}
		}		
		return c;		
	}



	// return first row of char array
	static char[] firstrow(char a[][])
	{
		char y[]=new char[a[0].length];
		for (int i=0;i<a[0].length;i++)
		{
			y[i]=a[0][i];
		}
		return y;
	}


	//Method has to return 26 alphabets

	static char[] alphabets()
	{
		char c[] = new char[26];
		int k=0;

		for(char i='a';i<='z';i++)
		{
			{
				c[k]=i;
				k++;
			}
		}		
		return c;
	}


	//return first half of the alphabets
	static char[] FirstHalfalphabets()
	{
		char fh[] = new char[13];
		int k=0;

		for(int i=0;i<26/2;i++)
		{
			{
				fh[k]=(char)('A'+i);
				k++;
			}
		}		
		return fh;
	}


	//return first half of the alphabets
	static char[] SecondHalfalphabets()
	{
		char fh[] = new char[13];
		int k=0;

		for(char i=26/2;i>=26;i++)
		{
			{
				fh[k]=(char)('z'+i);
				k++;
			}
		}		
		return fh;
	}

	//return Reverse Lowercase alphabets
	static char[] ReverseLowecase()
	{
		char fh[] = new char[26];
		int k=0;

		for(char i='z';i>='a';i--)
		{
			{
				fh[k]=i;
				k++;
			}
		}		
		return fh;
	}


	//return  numbers from 1 to 50
	static int[] Numbers1To50()
	{
		int c[] = new int[50
		                  ];
		int k=0;

		for(int i=1;i<=50;i++)
		{
			{
				c[k]=i;
				k++;
			}
		}		
		return c;
	}

	//return sum of prime numbers between 1 to 100

	static boolean isPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	

	static int getPrimeNumbersum(int start, int end )
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i)==true)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	//return count of prime numbers between 1 to 200

	static int CountprimeNumbers(int start, int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(sample1.isPrime(i)==true)
			{
				count++;
			}
		} 
		return count;
	}

	//return last row of 3*3 2d int array

	static int[] lastRow(int x[][])
	{
		int k=0,l=0;
		int y[]=new int[x[2].length];
		for(int i=0;i<=x[2].length-1;i++)
		{
			y[k]=x[2][i];
			k++;	     	 
		}
		return y;
	}


	//numbers between 250 to 500 divisible by 25
	static int[] divisibleby5()
	{
		int count=0, k=0;

		for(int i=250;i<=500;i++)
		{
			if(i%25==0)
			{
				count++;
			}
		}
		int d[]=new int[count];
		for(int i=250;i<=500;i++)
		{
			if(i%25==0)
			{
				d[k]=i;
				k++;
			}
		}
		return d;
	}

	//return second half of elements from 2d string array

	static String[] secondHalfStrings(String m[])
	{
		int k=0;
		String n[]=new String [m.length/2];
		for(int i=m.length/2;i<=m.length-1;i++)
		{
			n[k]=m[i];
			k++;
		}
		return n;
	}

}
public class Staticreturn {

	public static void main(String[] args) {
		char a[][]= {{'r','a','v'},{'i','k','i'},{'r','e','d'}};

		System.out.print(" concatinated char array  :");
		System.out.print(sample1.ConcatDemo(a));
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		System.out.println(" Reversed char array  :");
		char c[][]= sample1.reversechar(a);
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c[i].length-1;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");



		// return first row of char array
		System.out.print("first row of char array : ");
		char d[]=sample1.firstrow(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(" "+d[i]);
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");



		char cr[]= sample1.alphabets();
		for(int i=0;i<cr.length;i++)
		{
			System.out.print(" "+cr[i]);	
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");



		char fh[]= sample1.FirstHalfalphabets();
		for(int j=0;j<fh.length;j++)
		{
			System.out.print(" "+fh[j]);	
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		char ch[]= sample1.SecondHalfalphabets();
		for(int j=0;j<ch.length;j++)
		{
			System.out.print(" "+ch[j]);	
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		char reverse[]= sample1.ReverseLowecase();

		for(int j=0;j<reverse.length;j++)
		{

			System.out.print(" "+reverse[j]);	
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		int num[]= sample1.Numbers1To50();
		for(int j=0;j<num.length;j++)
		{
			System.out.print(" "+num[j]);	
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		int sum= sample1.getPrimeNumbersum(1,100);
		System.out.println("sum : "+sum);
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		System.out.println("total prime numbers : "+sample1.CountprimeNumbers(1,200));
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");

		int x[][]= {{5,3,6},{3,1,7},{8,9,1}};
		int lastrow[]=sample1.lastRow(x);
		for(int i=0;i<lastrow.length;i++)

		{
			System.out.print(" "+lastrow[i]);
		}


		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("25 divisible numbers ");
		int a1[]=sample1.divisibleby5();
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(" "+a1[i]);
		}

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");


		String s[]= {"SG","softwae","testing","training","institute","attiguppe","banlore","karnataka"};
		String str[]=sample1.secondHalfStrings(s);
		for(int i=0;i<str.length;i++)

		{
			System.out.print(" "+str);
		}



	}

}
