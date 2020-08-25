 import java.util.*;
 public class PalindromeNumber{
 	public static void main(String[] args) {
 		
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter Number");
 		int n=sc.nextInt();
 		int number=n;
 		int i=1;
 		int rev=0;
 		int no;
 		while(n>0){
 			no=n%10;
 			rev=rev*10+no;
 			n=n/10;
 		}
 		if(number==rev){
 			System.out.println("The Entered number " + number + " is Palindrome Number");

 		}
 		else
 		{
 			System.out.println("The Entered number " + number + " is not Palindrome Number");
 		}
 		

 		
 	}
 }