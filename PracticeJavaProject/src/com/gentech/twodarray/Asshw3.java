package com.gentech.twodarray;

public class Asshw3 {

	public static void main(String[] args) {

		int i=0;
		byte x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		while(i<x.length)
		{
			int j=0;
			while(j<x[i].length)
			{
				System.out.print(x[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
