package com.hentech.constuctoroverloading;
class college
{
	college(String clgname,String clgadress,String clgcode)
	{
		System.out.println(" college name:-"+clgname);

		System.out.println(" college adress:-"+clgadress);
		System.out.println(" college adress:-"+clgcode);
		System.out.println();
	}
	college(int usn,int pincode)
	{
		System.out.println(" college usn:-"+usn);
		System.out.println(" college code:-"+pincode);
	}

}

public class Collegedemo {

	public static void main(String[] args) {
		college o1=new college("bitm","ballari","bitm123");
		college o2=new college(9875,584103);
	}

}
