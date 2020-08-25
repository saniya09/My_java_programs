import java.util.*;
public class Pattern5{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++){
			for (int j=no;j>=i-1;j-- ) {
				System.out.print("  ");
			}
			for(int j=no;j>=no-i+1;j--){
				System.out.print("* ");
			}
			System.out.println();

			
		}
	}
}