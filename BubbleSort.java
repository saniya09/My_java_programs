import java.util.*;
class BubbleSort{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		int a[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}

		int n=a.length;
		boolean sorted=true;

		for(int i=0;i<n-1;i++){
			for (int j=0;j<n-1;j++) {
				if(a[j+1] < a[j]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
				
				if(sorted) break;
			}
		}

		System.out.println("Sorted Array is :");
		for(int item:a){
			System.out.println(item + " ");
		}
	}
}