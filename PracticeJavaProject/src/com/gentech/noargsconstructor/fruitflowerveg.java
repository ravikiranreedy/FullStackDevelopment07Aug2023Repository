package com.gentech.noargsconstructor;

class Fruit
{
	String fruitName;
	String hybrid;
	String fruitColor;
	int noofYear;
	Fruit()
	{
		fruitName="Apple";
		hybrid="kashmir Apple";
		fruitColor="Red";
		noofYear=1;
		System.out.println("FruitName:-"+fruitName);
		System.out.println("Hybrid:-"+hybrid);
		System.out.println("FruitColor:-"+fruitColor);
		System.out.println("No of Years to Grow:-"+noofYear);
		System.out.println("++++++++++++++++++++++++++++++++++++++");	
	}

}
class Flower
{
	String flowerName;
	String flowerColor;
	int noofMonth;
	Flower()
	{
		flowerName="Rose";
		flowerColor="Red";
		noofMonth=3;
		System.out.println("FlowerName:-"+flowerName);
		System.out.println("FlowerColor:-"+flowerColor);
		System.out.println("No of Months to Grow:-"+noofMonth);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}
}
class Vegetable
{
	String vegName;
	String vegType;
	String humanBenifits;
	int noofMonth;
	Vegetable()
	{
		vegName="Carrot";
		vegType="undergroun";
		humanBenifits="skin";
		noofMonth=6;
		System.out.println("VegName:-"+vegName);
		System.out.println("VegType:-"+vegType);
		System.out.println("HumanBenefits:-"+humanBenifits);
		System.out.println("No of Months to Grow:-"+noofMonth);	
	}
}

public class fruitflowerveg {

	public static void main(String[] args) {
		Fruit fru=new Fruit();


		Flower flo=new Flower();


		Vegetable veg=new Vegetable();
	}

}
