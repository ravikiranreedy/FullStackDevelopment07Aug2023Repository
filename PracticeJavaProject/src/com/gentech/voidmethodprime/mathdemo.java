package com.gentech.voidmethodprime;
class charges{
	
	static void bill(double x)
	{
		if(x<=100) {
			double tc=x*1;
			System.out.println("total electricity charge:-"+tc);
		}
		else if((x>=100)&&(x<=200)) {
			/*double t=x-100;
			double res=t*1.5;
			double ts=100*1;
			double ch=ts+res;*/
			double ch=((100*1)+(x-100)*1.5);
			System.out.println("total electricity charge:-"+ch);
		}
		else if(x>=200) {
			double t=x-200;
			double ts=100*1;
			double ta=100*1.5;
			double res=t*2.5;
			double ch=ts+ta+res;
			//double ch=((100*1)+(100*1.5)+((x-200)*2.5));
			System.out.println("total electricity charge:-"+ch);
		}
	}
}
public class mathdemo {
	public static void main(String[] args) {
		charges o=new charges();
		o.bill(110);
		o.bill(210);
	}
}




