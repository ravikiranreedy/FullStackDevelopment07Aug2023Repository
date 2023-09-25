package com.gentech.classes;
class country
{
	String coname;
	int coid;
	String c0religion;
	String countrycapital;
}

class state
{
	String stname;
	int stid;
	String stlanguage;
	String statecapital;

}

class district
{
	String name;
	int id;
	String distfamous;
	String disvistingplace;


}
public class countrystatedistrict {

	public static void main(String[] args) {
		country cou=new country();
		cou.coname="india";
		cou.coid=235689;
		cou.c0religion="hindu";
		cou.countrycapital="delhi";
		System.out.println("country name:- "+cou.coname);
		System.out.println("country id:- "+cou.coid);
		System.out.println("country religion:- "+cou.c0religion);
		System.out.println("country capital:- "+cou.countrycapital);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		state st=new state();
		st.stname="karnataka";
		st.stid=35689;
		st.stlanguage="kannada";
		st.statecapital="banglore";
		System.out.println("state name:- "+st.stname);
		System.out.println("state id:- "+st.stid);
		System.out.println("state language:- "+st.stlanguage);
		System.out.println("state capital:- "+st.statecapital);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		district dis=new district();
		dis.name="raichur";
		dis.id=36;
		dis.distfamous="gold mines and theraml station";
		dis.disvistingplace="mantralya";
		System.out.println("district name:- "+dis.name);
		System.out.println("district id:- "+dis.id);
		System.out.println("district famous for:- "+dis.distfamous);
		System.out.println("district visting  place:- "+dis.disvistingplace);
		
	}

}
