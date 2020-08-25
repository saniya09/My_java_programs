import java.util.*;
class SeriesSum{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		float res=0;
		for(float i=1;i<=no;i++){
			res=res+1/i;

		}
		System.out.println(res);
	}
}