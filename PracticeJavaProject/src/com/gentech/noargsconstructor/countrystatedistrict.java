package com.gentech.noargsconstructor;

class country
{
	String coname;
	int coid;
	String c0religion;
	String countrycapital;
	country()
	{
		coname="india";
		coid=235689;
		c0religion="hindu";
		countrycapital="delhi";
		System.out.println("country name:- "+coname);
		System.out.println("country id:- "+coid);
		System.out.println("country religion:- "+c0religion);
		System.out.println("country capital:- "+countrycapital);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	}
}
class state
{
	String stname;
	int stid;
	String stlanguage;
	String statecapital;
	state()
	{
		stname="karnataka";
		stid=35689;
		stlanguage="kannada";
		statecapital="banglore";
		System.out.println("state name:- "+stname);
		System.out.println("state id:- "+stid);
		System.out.println("state language:- "+stlanguage);
		System.out.println("state capital:- "+statecapital);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
}
class district
{
	String name;
	int id;
	String distfamous;
	String disvistingplace;
	district()
	{
		name="raichur";
		id=36;
		distfamous="gold mines and theraml station";
		disvistingplace="mantralya";
		System.out.println("district name:- "+name);
		System.out.println("district id:- "+id);
		System.out.println("district famous for:- "+distfamous);
		System.out.println("district visting  place:- "+disvistingplace);

	}

}


public class countrystatedistrict {

	public static void main(String[] args) {
		country cou=new country();


		state st=new state();

		district dis=new district();

	}

}

