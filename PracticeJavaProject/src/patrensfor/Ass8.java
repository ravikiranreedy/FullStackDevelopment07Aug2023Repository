package patrensfor;
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
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(+k+" ");
				k--;
			}
			System.out.println();

		}

	}

}
