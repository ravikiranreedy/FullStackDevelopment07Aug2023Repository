package patrendowhile;
/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15 
*/
public class Ass5 {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(+k+" ");
				j++;
				k++;
			}while(j<=i);
			System.out.println();
			i++;

		}while(i<=5);

	}

}
