package com.gentech.methods;
class operators
{
	void sample1(int a,int b)
	{
		boolean c=((a>b)&&(a<b));
		System.out.println("the given number is :-" +c);
	}
	void sample2(int a,int b)
	{
		boolean c=((a>b)||(a<b));
		System.out.println("the given or logical condition is :-" +c);
	}
	void sample3(int a,int b)
	{
		boolean c=!((a>b)&&(a<b));
		System.out.println("the given not condition is :-" +c);
		
		
	}
	class SampleDemo
	{
		void samplefor() 
		{
			for (int x = 50; x >= 40; x--)
			{
				System.out.print(x+" ");
			}
		}
	}
}
public class Twodcharinreverse {

	public static void main(String[] args) {
		operators obj=new operators();
		obj.sample1(100, 200);
		obj.sample2(100,200);
		obj.sample3(100,200);
		
		operators.SampleDemo demo = new operators().new SampleDemo(); 
	        demo.samplefor();
	}

}
