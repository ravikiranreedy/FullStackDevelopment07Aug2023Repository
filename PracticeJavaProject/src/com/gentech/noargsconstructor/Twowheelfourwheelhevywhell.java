package com.gentech.noargsconstructor;

class twowheel
{
	String vehiclname;
	int id;
	int manufactureyear;
	String brand;
	twowheel()
	{
		vehiclname="pulsar ns 200";
		id=5689;
		manufactureyear=2023;
		brand="bajaj";
		System.out.println("two vehicle name:- "+vehiclname);
		System.out.println("two vehicle id:- "+id);
		System.out.println("two vehicle manufactureyear:- "+manufactureyear);
		System.out.println("two vehicle brand name:- "+brand);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
	}
}
class fourwheel
{
	String vehiclname;
	int id;
	int manufactureyear;
	String brand;
	fourwheel()
	{
		vehiclname="kia seltos";
		id=5689;
		manufactureyear=2023;
		brand="kia";
		System.out.println("four wheeler vehicle name:- "+vehiclname);
		System.out.println("four wheeler vehicle id:- "+id);
		System.out.println("four wheeler vehicle manufactureyear:- "+manufactureyear);
		System.out.println("four wheeler vehicle brand name:- "+brand);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");	
	}

}
class hevayvehicle
{
	String vehiclname;
	int id;
	String vehicetype;
	int manufactureyear;
	String brand;
	hevayvehicle()
	{
		vehiclname="tractor 241";
		id=744;
		vehicetype="commertial";
		manufactureyear=2023;
		brand="swraj";
		System.out.println("heavya vehicle name:- "+vehiclname);
		System.out.println("heavya vehicle id:- "+id);
		System.out.println("heavya vehicle id:- "+vehicetype);
		System.out.println("heavya vehicle manufactureyear:- "+manufactureyear);
		System.out.println("heavya vehicle brand name:- "+brand);	
	}

}

public class Twowheelfourwheelhevywhell {

	public static void main(String[] args) {
twowheel tw=new twowheel();
		
		
		fourwheel fw=new fourwheel();
		
		
		hevayvehicle hw=new hevayvehicle();
	}

}
