package com.gentech.twodarray;

public class Asshw1 {

	public static void main(String[] args) {
		String str[][]= {{"ravi","kiran","reddy"},{"tarun","kumar","reddy"},{"sai","pawan","u"}};
		for(int i=str.length-1;i>=0;i--)
		{
			for(int j=str[i].length-1;j>=0;j--)
			{
			   System.out.print(str[i][j]+" ");	
			}
			System.out.println();
		}

	}

}
