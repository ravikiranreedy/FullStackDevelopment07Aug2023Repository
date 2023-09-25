package com.hentech.constuctoroverloading;
class Student {
	String name;
	int StudentId;
	String Branch;

	Student(String n, int id) {
		name = n;
		StudentId = id;
		System.out.println("student Name : " + name);
		System.out.println("student id : " + StudentId);
	}

	Student() {

	}

	Student(String sb) {
		Branch = sb;
		System.out.println("student branch : " + Branch);

	}

}

public class studentdemo {

	public static void main(String[] args) {
		Student obj = new Student("RAVI KIRAN REDDY", 201910012);
		Student obj2 = new Student("ELECTRICAL AND ELECTRONICS ENGINNERING");



	}

}
