import java.util.*;
public class PrimeNumber{
	public static void main(String[] args) {
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check prime number");
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			if(no % i==0){
				count++;
			}
			
		}
		if(no==1){
			System.out.println("Number 1 is nor prime nor composite");
		}
		else if(count<=2){
			System.out.println("Number " + no + " is prime ");
		}
		else{
			System.out.println("Number " + no + " is not prime ");
		}
	}
}