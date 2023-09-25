package com.gentech.classes;
class student
{
	String firstname;
	int id;
	int age;
	String gender;
}

class library
{
	int library_id;
	String libraryhead;
	String bookname;
	int librarystrentgh;

}

class sports
{
	int sportsid;
	String sportstype;
	String sportsname;
	String coach;


}
public class Studentlibrarysports {

	public static void main(String[] args) {
		student stu=new student();
		stu.firstname="ravi";
		stu.id=2686;
		stu.age=23;
		stu.gender="male";
		System.out.println("student name:-  "+stu.firstname);
		System.out.println("student id:-  "+stu.id);
		System.out.println("student age:-  "+stu.age);
		System.out.println("student gender:-  "+stu.gender);
		System.out.println("+++++++++++++++++++++++++");

		library lib=new library();
		lib.library_id=5896;
		lib.libraryhead="sagar";
		lib.bookname="naruto";
		lib.librarystrentgh=100;
		System.out.println("library id:-  "+lib.library_id);
		System.out.println("library  head:-  "+lib.libraryhead);
		System.out.println("library book name:-  "+lib.bookname);
		System.out.println("library strength:-  "+lib.librarystrentgh);
		System.out.println("+++++++++++++++++++++++++");
	
		sports spo=new sports();
		spo.sportsid=2563;
		spo.sportstype="indoor games";
		spo.sportsname="chess";
		spo.coach="bhimn gouda";
		System.out.println("sports id:-  "+spo.sportsid);
		System.out.println("sports type:-  "+spo.sportstype);
		System.out.println("sports name:-  "+spo.sportsname);
		System.out.println("sports coach:-  "+spo.coach);
		
	}

}
