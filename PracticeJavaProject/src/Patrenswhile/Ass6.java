package Patrenswhile;
/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
 */
public class Ass6 {

	public static void main(String[] args) {
		int k=5;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(+k+" ");
				j++;
				k=k+5;
			}
			System.out.println();
			i++;
		}
	}
}
