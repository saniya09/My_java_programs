import java.util.*;
public class FibbonacciSeries{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number till you want series?");
		int no=sc.nextInt();
		int a=0;
		int b=1;

		System.out.print( a+ " ");
		System.out.print( b+ " ");

		for(int i=0;i<no-2;i++){
			int c=a+b;
				System.out.print( c+ " ");
				a=b;
				b=c;

		}
	}
}