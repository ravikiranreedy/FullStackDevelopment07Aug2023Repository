package com.gentech.noargsconstructor;
class employ
{
	String firstname;
	int id;
	int age;
	String gender;
	employ()
	{
		firstname="ravi";
		id=2646;
		age=23;
		gender="male";

		System.out.println("employe name:-  "+firstname);
		System.out.println("employe id:-  "+id);
		System.out.println("employe age:-  "+age);
		System.out.println("employe gender:-  "+gender);
		System.out.println("+++++++++++++++++++++++++");	
	}
}
class department
{
	String depart;
	int dept_id;
	String depathead;
	int deptstrentgh;
	department()
	{
		depart="elctrical";
		dept_id=35678;
		depathead="ajith";
		deptstrentgh=50;
		System.out.println("department name:-  "+depart);
		System.out.println("department id:-  "+dept_id);
		System.out.println("department head:-   "+depathead);
		System.out.println("department strength:-   "+deptstrentgh);
		System.out.println("+++++++++++++++++++++++++");

	}

}
class insurnce
{
	int insuranceid;
	String instype;
	String insperiod;
	insurnce()
	{
		insuranceid=689;
		instype="vehicle insurance";
		insperiod="6 monts";
		System.out.println("insurnce id:- "+insuranceid);
		System.out.println("insurnce type:-  "+instype);
		System.out.println("insurnce peiod:- "+insperiod);	
	}

}
public class employedepinsu {

	public static void main(String[] args) {

		employ e=new employ();

		department d=new department();

		insurnce ins=new insurnce();
	}

}







