import java.util.Random; 
import java.util.Scanner; 
public class quicksort { 
	static int a[]=new int[100000];

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub  
		Scanner in =new Scanner(System.in); 
		long start,end; 
		System.out.println("***Quick Sort***\n"); 
		System.out.println("Enter the number of elements to be sorted:"); 
		int n=in.nextInt(); 
		Random rand=new Random(); 
		for(int i=0;i<n;i++) 
			a[i]=rand.nextInt(100); 
		System.out.println("Array elements to be sorted are:"); 
		for(int i=0;i<n;i++) 
			System.out.println(a[i]+""); 
		int low=0, high=n-1; 
		a[n]=999; 
		start=System.nanoTime(); 
		int m=partition(a,low,high); 
		quicksortng(a,low,high);
		end=System.nanoTime(); 
		System.out.println("The sorted array is:"); 
		for(int i=0;i<n;i++) 
			System.out.println(a[i]+" "); 
		System.out.println("the time taken to sort the array is :"+(end-start)+"ns");
		System.out.println("***\n\n"); 
	}
	 
	static void quicksortng(int a[],int low,int high) 
	{ 
		int mid; 
		if(low<high)
		{ 
			mid=partition(a,low,high);
			quicksortng(a, low,mid-1); 
			quicksortng(a,mid+1,high); 
			
		}
	} 
	
	static int partition(int a[],int low,int high) 
	{ 
		int pivot=a[low]; 
		int i =low+1; 
		int j=high; 
		while(i<=j)
		{ 
			while(a[i]<=pivot)
				i++; 
			while(a[j]>pivot)
				j--; 
			if(i<j)
				swap(a,i,j); 
		} 
		swap(a,low,j); 
		return j;
		
	} 
	static void swap(int a[],int i,int j) 
	{ 
		int temp; 
		temp=a[i]; 
		a[i]=a[j]; 
		a[j]=temp;
	} 
}
	
