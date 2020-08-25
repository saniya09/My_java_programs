import java.util.*;
class Factorial{

	public static void main(String[] args) {
		int no,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find Factorial");
		no=sc.nextInt();
		for(int i=no;i>=1;i--){
				fact=fact*i;
			
		}
		System.out.println(fact);



	}

}


