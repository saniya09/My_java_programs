import java.util.*;
public class Marks{
	public static void main(String[] args) {
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int no=sc.nextInt();

		System.out.println("Enter marks for " + no + " of students");
		int marks[]=new int[no];

		for(i=0;i<no;i++){
			marks[i]=sc.nextInt();

		}
		int avg=0;

		for (i=0;i<no ;i++ ) {
			avg=avg+marks[i];

			
		}

		avg=avg/no;
		System.out.println("Average of " + no + " students is " + avg);
	}
}