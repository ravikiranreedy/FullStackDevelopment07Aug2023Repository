package com.gentech.classes;
class Fruit{
	String fruitName;
	String hybrid;
	String fruitColor;
	int noofYear;
	
}
class Flower{
	String flowerName;
	String flowerColor;
	int noofMonth;
}
class Vegetable{
	String vegName;
	String vegType;
	String humanBenifits;
	int noofMonth;
}

public class fruitsflowersvegitable {

	public static void main(String[] args) {
		Fruit fru=new Fruit();
		fru.fruitName="Apple";
		fru.hybrid="kashmir Apple";
		fru.fruitColor="Red";
		fru.noofYear=1;
	    System.out.println("FruitName:-"+fru.fruitName);
	    System.out.println("Hybrid:-"+fru.hybrid);
	    System.out.println("FruitColor:-"+fru.fruitColor);
	    System.out.println("No of Years to Grow:-"+fru.noofYear);
	    System.out.println("++++++++++++++++++++++++++++++++++++++");
	    
	    Flower flo=new Flower();
	    flo.flowerName="Rose";
	    flo.flowerColor="Red";
	    flo.noofMonth=3;
	    System.out.println("FlowerName:-"+flo.flowerName);
	    System.out.println("FlowerColor:-"+flo.flowerColor);
	    System.out.println("No of Months to Grow:-"+flo.noofMonth);
	    System.out.println("++++++++++++++++++++++++++++++++++++++");
	    
	    Vegetable veg=new Vegetable();
	    veg.vegName="Carrot";
	    veg.vegType="undergroun";
	    veg.humanBenifits="skin";
	    veg.noofMonth=6;
	    System.out.println("VegName:-"+veg.vegName);
	    System.out.println("VegType:-"+veg.vegType);
	    System.out.println("HumanBenefits:-"+veg.humanBenifits);
	    System.out.println("No of Months to Grow:-"+veg.noofMonth);

	}

}
