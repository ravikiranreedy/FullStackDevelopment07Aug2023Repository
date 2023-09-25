package com.getech.parameterized;

class employ
{
	String firstname;
	int id;
	int age;
	String gender;
	employ(String fname,int eid,int eage,String egender)
	{
		firstname=fname;
		id=eid;
		age=eage;
		gender=egender;

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
	department(String dep,int did,String d_head,int dstrength)
	{
		depart=dep;
		dept_id=did;
		depathead=d_head;
		deptstrentgh=dstrength;
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
	insurnce(int ins_id,String ins_tye,String insper)
	{
		insuranceid=ins_id;
		instype=ins_tye;
		insperiod=insper;
		System.out.println("insurnce id:- "+insuranceid);
		System.out.println("insurnce type:-  "+instype);
		System.out.println("insurnce peiod:- "+insperiod);	
	}

}

public class empdepins {

	public static void main(String[] args) {

		employ e=new employ("ravi",5678,23,"male" );

		department d=new department("electrical",15623,"ajith",50);

		insurnce ins=new insurnce(2346,"lic","six_months");

	}

}










