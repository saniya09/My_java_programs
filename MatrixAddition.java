import java.util.*;
public class MatrixAddition{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter matrix1 count of rows");
		int rows=sc.nextInt();
		System.out.println("Enter matxrix1 count of cloumns");
		int cols=sc.nextInt();

		int no1[][]=new int[rows][cols];
		int no2[][]=new int[rows][cols];	
		int res[][]=new int[rows][cols];

		System.out.println("Enter values for matrix1");
		for(int i=0;i<rows;i++){
			for (int j=0;j<cols ;j++ ) {
				no1[i][j]=sc.nextInt();
				
			}
		}	

		System.out.println("Enter values for matrix2");
		for(int i=0;i<rows;i++){
			for (int j=0;j<cols ;j++ ) {
				no2[i][j]=sc.nextInt();
				
			}
		}

		for(int i=0;i<rows;i++){
			for (int j=0;j<cols ;j++ ) {
				res[i][j] = no1[i][j]+ no2[i][j];
				
			}
		}

		System.out.println("Result is : ");
		for(int i=0;i<rows;i++){
			for (int j=0;j<cols ;j++ ) {
				System.out.print(res[i][j] + " "); 
				
			}
			System.out.println();
		}
	}

}