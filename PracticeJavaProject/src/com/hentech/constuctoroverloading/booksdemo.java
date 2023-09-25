package com.hentech.constuctoroverloading;
class books
{
	books(String bookname,String author,String bookcode)
	{
		System.out.println(" college name:-"+bookname);

		System.out.println(" college adress:-"+author);
		System.out.println(" college adress:-"+bookcode);
		System.out.println();
	}
	books(int usn,int year)
	{
		System.out.println(" college usn:-"+usn);
		System.out.println(" college code:-"+year);
	}

}
public class booksdemo {

	public static void main(String[] args) {
		college o1=new college("development","ajith kumar","develop@123");
		college o2=new college(9875,2019);
	}

}
