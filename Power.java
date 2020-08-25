import java.util.*;
public class Power{
	 public static void main(String[] args) {
	 	
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter number");
	 	int no=sc.nextInt();
	 	System.out.println("Enter power");
	 	int pow=sc.nextInt();

	 	int res=1;
	 	for(int i=0;i<pow;i++){
	 		res=res*no;
	 	}
	 	System.out.println("The power is :" +res);
	 }
}