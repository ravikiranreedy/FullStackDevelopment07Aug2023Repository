package com.gentech.classes;
class twowheel
{
	String vehiclname;
	int id;
	int manufactureyear;
	String brand;
}

class fourwheel
{
	String vehiclname;
	int id;
	int manufactureyear;
	String brand;

}

class hevayvehicle
{
	String vehiclname;
	int id;
	String vehicetype;
	int manufactureyear;
	String brand;


}
public class Twowheelfourwheelhevyveh {

	public static void main(String[] args) {
		
		twowheel tw=new twowheel();
		tw.vehiclname="pulsar ns 200";
		tw.id=5689;
		tw.manufactureyear=2023;
		tw.brand="bajaj";
		System.out.println("two vehicle name:- "+tw.vehiclname);
		System.out.println("two vehicle id:- "+tw.id);
		System.out.println("two vehicle manufactureyear:- "+tw.manufactureyear);
		System.out.println("two vehicle brand name:- "+tw.brand);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		fourwheel fw=new fourwheel();
		fw.vehiclname="kia seltos";
		fw.id=5689;
	
		fw.manufactureyear=2023;
		fw.brand="kia";
		System.out.println("four wheeler vehicle name:- "+fw.vehiclname);
		System.out.println("four wheeler vehicle id:- "+fw.id);
		System.out.println("four wheeler vehicle manufactureyear:- "+fw.manufactureyear);
		System.out.println("four wheeler vehicle brand name:- "+fw.brand);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		hevayvehicle hw=new hevayvehicle();
		hw.vehiclname="tractor 241";
		hw.id=744;
		hw.vehicetype="commertial";
		hw.manufactureyear=2023;
		hw.brand="swraj";
		System.out.println("heavya vehicle name:- "+hw.vehiclname);
		System.out.println("heavya vehicle id:- "+hw.id);
		System.out.println("heavya vehicle id:- "+hw.vehicetype);
		System.out.println("heavya vehicle manufactureyear:- "+hw.manufactureyear);
		System.out.println("heavya vehicle brand name:- "+hw.brand);
	}

}
