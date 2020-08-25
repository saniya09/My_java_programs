import java.util.*;
class SeriesSum1{
	public static void main(String[] args)
	 {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		float res=0;
		for(float i=1;i<=no;i++)
		{
			if(i%2==0){
				res=res-1/i;
			}
			else{
				res=res+1/i;
			}
		}
		System.out.println(res);
	}
}
