package com.gentech.noargsconstructor;
class student
{
	String firstname;
	int id;
	int age;
	String gender;
	student()
	{
		
		firstname="ravi";
		id=2686;
		age=23;
		gender="male";
		System.out.println("student name:-  "+firstname);
		System.out.println("student id:-  "+id);
		System.out.println("student age:-  "+age);
		System.out.println("student gender:-  "+gender);
		System.out.println("+++++++++++++++++++++++++");
		
	}
}

class library
{
	int library_id;
	String libraryhead;
	String bookname;
	int librarystrentgh;
	library()
	{
	library_id=5896;
		libraryhead="sagar";
	bookname="naruto";
		librarystrentgh=100;
		System.out.println("library id:-  "+library_id);
		System.out.println("library  head:-  "+libraryhead);
		System.out.println("library book name:-  "+bookname);
		System.out.println("library strength:-  "+librarystrentgh);
		System.out.println("+++++++++++++++++++++++++");
		
	}

}
class sports
{
	int sportsid;
	String sportstype;
	String sportsname;
	String coach;
	sports()
	{
		sportsid=2563;
		sportstype="indoor games";
	sportsname="chess";
		coach="bhimn gouda";
		System.out.println("sports id:-  "+sportsid);
		System.out.println("sports type:-  "+sportstype);
		System.out.println("sports name:-  "+sportsname);
		System.out.println("sports coach:-  "+coach);
	}


}

public class Studentlibsport {

	public static void main(String[] args) {
       
		student stu=new student();
		
		library lib=new library();
		
		sports spo=new sports();
	}

}


