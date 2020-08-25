import java.util.*;
public class Pattern1
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no;j++){
				System.out.print("*" + "\t");
			}
			System.out.println("\t");

		}
	}
}