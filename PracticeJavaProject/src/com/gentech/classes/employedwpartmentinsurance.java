package com.gentech.classes;
class employ
{
	String firstname;
	int id;
	int age;
	String gender;
}

class department
{
	String depart;
	int dept_id;
	String depathead;
	int deptstrentgh;

}

class insurnce
{
	int insuranceid;
	String instype;
	String insperiod;
}
public class employedwpartmentinsurance {

	public static void main(String[] args) {
		employ e=new employ();
		e.firstname="ravi";
		e.id=2646;
		e.age=23;
		e.gender="male";

		System.out.println("employe name:-  "+e.firstname);
		System.out.println("employe id:-  "+e.id);
		System.out.println("employe age:-  "+e.age);
		System.out.println("employe gender:-  "+e.gender);
		System.out.println("+++++++++++++++++++++++++");

		department d=new department();
		d.depart="elctrical";
		d.dept_id=35678;
		d.depathead="ajith";
		d.deptstrentgh=50;
		System.out.println("department name:-  "+d.depart);
		System.out.println("department id:-  "+d.dept_id);
		System.out.println("department head:-   "+d.depathead);
		System.out.println("department strength:-   "+d.deptstrentgh);
		System.out.println("+++++++++++++++++++++++++");

		insurnce ins=new insurnce();
		ins.insuranceid=689;
		ins.instype="vehicle insurance";
		ins.insperiod="6 monts";
		System.out.println("insurnce id:- "+ins.insuranceid);
		System.out.println("insurnce type:-  "+ins.instype);
		System.out.println("insurnce peiod:- "+ins.insperiod);



	}

}
