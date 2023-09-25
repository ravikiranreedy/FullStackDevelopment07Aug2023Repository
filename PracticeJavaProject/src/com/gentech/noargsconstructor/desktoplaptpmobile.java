package com.gentech.noargsconstructor;

class desktop
{
	String name;
	int id;
	int manufyear;
	String brand;
	desktop()
	{
		name="asus tuf gaminf f15";
		id=2686;
		manufyear=2023;
		brand="asus";
		System.out.println("desktop name:-  "+name);
		System.out.println("desktop id:-  "+id);
		System.out.println("desktop manufacyur year:-  "+manufyear);
		System.out.println("desktop brand:-  "+brand);
		System.out.println("+++++++++++++++++++++++++");

	}
}
class laptop
{
	String name;
	int id;
	int manufyear;
	String brand;
	laptop()
	{
		name="lenvo notepad";
		id=8956;
		manufyear=2022;
		brand="lenvo";
		System.out.println("laptop name:-  "+name);
		System.out.println("laptop id:-  "+id);
		System.out.println("laptop manufacyur year:-  "+manufyear);
		System.out.println("laptop brand:-  "+brand);
		System.out.println("+++++++++++++++++++++++++");

	}
}
class mobile
{
	String name;
	int id;
	int manufyear;
	String brand;
	mobile()
	{
		name="realme 10 pro";
		id=8689;
		manufyear=2022;
		brand="reame";
		System.out.println("mobile name:-  "+name);
		System.out.println("mobile id:-  "+id);
		System.out.println("mobile manufacyur year:-  "+manufyear);
		System.out.println("mobile brand:-  "+brand); 
	}

}

public class desktoplaptpmobile {

	public static void main(String[] args) {
		desktop des=new desktop();


		laptop lap=new laptop();


		mobile mob=new mobile();
	}

}

