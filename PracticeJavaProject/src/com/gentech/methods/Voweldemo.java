package com.gentech.methods;

class Vowel
{
	void Vowel1(char ch)
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("It is a vowel");
		} 
		else
		{
			System.out.println("It is not a vowel");

		}
		System.out.println(" ");

	}

	void reverse(int a[][]) {
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[0].length - 1; j >= 0; j--) {
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

	void onearray(int x[]) {
		int a[] = new int[x.length];
		int c = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			a[c] = x[i];
			c++;
		}
		for (int i = 0; i < a.length / 2; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}


public class Voweldemo {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 9, 8, 4 } };
		int x[] = { 1,2,3,4,5,6};
		Vowel obj = new Vowel();
		obj.Vowel1('a');
		obj.reverse(a);
		obj.onearray(x);


	}
}
