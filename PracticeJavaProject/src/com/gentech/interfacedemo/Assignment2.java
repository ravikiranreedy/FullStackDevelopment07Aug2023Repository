package com.gentech.interfacedemo;
//multi level interface
interface Property1
{
    void propertyType(String name);
}

interface ownerinfo extends Property1 
{
    void ownerName(String oname);
}

interface address1 extends ownerinfo 
{
    void addressDetails(String add);
}

interface ratings extends address1 {
    void setRating(double rating);
}

class RealEstateProperty implements ratings {
   

    public void propertyType(String name) {
    	System.out.println("property type:-"+name);
    }

    public void ownerName(String oname) {
      System.out.println("owner name:-"+oname);
    }

    public void addressDetails(String add)
    {
      System.out.println("address dtails:-"+add);
    }
   public void setRating(double d) {
	   System.out.println("rating:-"+d);
   }
}

public class Assignment2 {
	public static void main(String[] args) {
		RealEstateProperty o=new RealEstateProperty();
		o.addressDetails("ballari");
		o.ownerName("sai pawan u");
		o.propertyType("commercial");
		o.setRating(4.9);

	}

}
