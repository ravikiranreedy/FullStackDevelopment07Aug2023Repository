package patrendowhile;
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
*/
public class Ass4 {

	public static void main(String[] args) {
		int i=5;
		do
		{
			int k=1;
			do
			{
				System.out.print(+k+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i--;
		}	while(i>=1);
	}

}
