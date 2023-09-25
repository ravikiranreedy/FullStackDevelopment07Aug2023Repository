
package Patrenswhile;
/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/
public class Ass8 {

	public static void main(String[] args) {
		int k=15;
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(+k+" ");
				j++;
				k--;
			}
			System.out.println();
			i--;
		}

	}

}
