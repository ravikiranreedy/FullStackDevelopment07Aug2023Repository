package patrendowhile;
/*
2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2
 */
public class Ass1 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("2 ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
