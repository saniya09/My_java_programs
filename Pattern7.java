import java.util.*;
public class Pattern7{
	public static void main(String[] args) {


		int number=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++){
			for (int j=1;j<=no-i;j++ ) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(number++ +" ");
			}
			System.out.println();

			
		}
	}
}