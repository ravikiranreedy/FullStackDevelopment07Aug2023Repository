package com.gentech.interfacedemo;

interface property{
//multiple interface
	void propertytype(String name); 
}
interface owner{
	void ownername(String oname);
}
interface address{
	void addressd(String add);
}
interface feedback extends property,owner,address
{
	void feedbackd(String feedback);
}
class rating implements feedback{
	public void propertytype(String name)
	{
		System.out.println("propert type:-"+name);
	}
	public void ownername(String oname) 
	{
		System.out.println("owner name:-"+oname);
	}
	public void addressd(String add) 
	{
		System.out.println("adress:-"+add);
	}
	public void feedbackd(String feedback)
	{
		System.out.println("feedback:-"+feedback);
	}
	void ratings(int r) {
		System.out.println("rating:-"+r);
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		rating obj=new rating();
		obj.propertytype("commercial");
		obj.ownername("ravi");
		obj.addressd("raichur");
		obj.feedbackd("good");
		obj.ratings(5);
	}

}
