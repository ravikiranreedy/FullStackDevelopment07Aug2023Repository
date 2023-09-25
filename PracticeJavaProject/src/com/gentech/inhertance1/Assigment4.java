package com.gentech.inhertance1;

class GrandFather  
{  
	 void gf()  
	{  
		System.out.println("I am grandfather.");  
	}  
}  

class Father extends GrandFather  
{  
 void fath1()  
	{  
		System.out.println("I am father.");  
	}  
}  

class Son extends Father  
{  
	 void son1()  
	{  
		System.out.println("I am son.");  
	}  
}  

class daughter extends Father  
{  
	 void daughter1()  
	{  
		System.out.println("I am a daughter.");  
	}
}

public class Assigment4 {

	public static void main(String[] args) {
		Son o1=new Son();
		o1.fath1();
		o1.son1();
		o1.gf();
		
		daughter o2=new daughter();
		o2.daughter1();
	}

}
