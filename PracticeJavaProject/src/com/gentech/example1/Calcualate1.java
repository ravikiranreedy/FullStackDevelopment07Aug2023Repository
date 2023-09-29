package com.gentech.example1;
class demo1{
demo1(int s, int e){
	for(int i=s;i<=e;i++) {
		if(i%2==0) {
			System.out.println(i+" ");
		}
	}
	
}
}
public class Calcualate1 {
	public static void main(String[] args) {
		demo1 o1=new demo1(1,100);
	}

}
