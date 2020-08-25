import java.util.*;
class SelectionSort{
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
		

		for(int i=0;i<n-1;i++){
			int mid=i;
			for (int j=i;j<n;j++) {
				if(a[j]< a[mid]){
					mid=j;
				}
				
				
			}
			int temp=a[i];
			a[i]=a[mid];
			a[mid]=temp;
		}

		System.out.println("Sorted Array is :");
		for(int item:a){
			System.out.println(item + " ");
		}
	}
}