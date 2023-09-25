package patrendowhile;
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
		do
		{
			int j=1;
			do
			{
				System.out.print(+k+" ");
				j++;
				k--;
			}while(j<=i);
			System.out.println();
			i--;
		}while(i>=1);


	}

}
