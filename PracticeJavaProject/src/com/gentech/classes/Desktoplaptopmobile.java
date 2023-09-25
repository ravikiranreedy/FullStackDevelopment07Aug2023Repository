package com.gentech.classes;
class desktop
{
	String name;
	int id;
	int manufyear;
	String brand;
}

class laptop
{
	String name;
	int id;
	int manufyear;
	String brand;

}

class mobile
{
	String name;
	int id;
	int manufyear;
	String brand;


}
public class Desktoplaptopmobile {

	public static void main(String[] args) {
		desktop des=new desktop();
		des.name="asus tuf gaminf f15";
		des.id=2686;
		des.manufyear=2023;
		des.brand="asus";
		System.out.println("desktop name:-  "+des.name);
		System.out.println("desktop id:-  "+des.id);
		System.out.println("desktop manufacyur year:-  "+des.manufyear);
		System.out.println("desktop brand:-  "+des.brand);
		System.out.println("+++++++++++++++++++++++++");
		
		laptop lap=new laptop();
		lap.name="lenvo notepad";
		lap.id=8956;
		lap.manufyear=2022;
		lap.brand="lenvo";
		System.out.println("laptop name:-  "+lap.name);
		System.out.println("laptop id:-  "+lap.id);
		System.out.println("laptop manufacyur year:-  "+lap.manufyear);
		System.out.println("laptop brand:-  "+lap.brand);
		System.out.println("+++++++++++++++++++++++++");

		
		mobile mob=new mobile();
		mob.name="realme 10 pro";
		mob.id=8689;
		mob.manufyear=2022;
		mob.brand="reame";
		System.out.println("mobile name:-  "+mob.name);
		System.out.println("mobile id:-  "+mob.id);
		System.out.println("mobile manufacyur year:-  "+mob.manufyear);
		System.out.println("mobile brand:-  "+mob.brand);
	}

}
