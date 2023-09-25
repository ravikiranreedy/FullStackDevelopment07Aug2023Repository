package com.gentech.interfacedemo;
//hybrid  interface
interface Property4
{
    void popertytype4(String name);
}

interface ownerinfo4 extends Property4 
{
    void ownerName(String oname);

	void feedback(String feed);

	void setRating(double rating);
}

interface address4 extends ownerinfo4 
{
    void addressDetails(String add);

}

interface ratings4 extends address4 {
    void setRating(double rating);
}
interface feedback4 extends ownerinfo4{
	void feedback(String feed);
}
class display implements Property4,ownerinfo4,address4
{
	   public void popertytype4(String name) {
		System.out.println("property type:-"+name);
	     }
	   public void ownerName(String oname) {
	      System.out.println("owner name:-"+oname);
	    }
	    public void addressDetails(String add)
	    {
	      System.out.println("address dtails:-"+add);
	    }
	   public   void setRating(double rating) {
		   System.out.println("rating:-"+rating);
	   }
	   public void feedback(String feed) {
		   System.out.println("feeback:-"+feed);
	   }
}
public class Assignment3 {
	public static void main(String[] args) {
		display o=new display();
		o.feedback("good bonding with owner");
		o.ownerName("santhosh sir");
		o.popertytype4("ressidential");
		o.setRating(5.0);
		o.addressDetails("attiguppe bengalur");
	}

}
