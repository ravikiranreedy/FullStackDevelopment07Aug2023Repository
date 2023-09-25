package com.gentech.arrysdemo;

public class Asshw5 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			count = count + 1;
		}
		System.out.println("Count: " + count);

		int x[] = new int[count];
		int k = 0;
		for (int j = 1; j <= 10; j++) {
			x[k] = j;
			k++;
		}

		for (int z = 0; z < x.length / 2; z++) 
		{
			System.out.println(x[z]);
		}

	}
}