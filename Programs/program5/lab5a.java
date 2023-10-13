package program5aa; 
import java.util.Random; 
import java.util.Scanner; 


public class lab5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int a[]=new int[10000]; 
		Scanner in=new Scanner(System.in); 
		long start,end; 
		System.out.println("--merge Sort--"); 
		System.out.println("Enter the number of elemnts:"); 
		int n=in.nextInt(); 
		Random rand=new Random(); 
		for(int i=0;i<n;i++)
			a[i]=rand.nextInt(1000);
		System.out.println("array elements to be sorted are: "); 
		for(int i=0;i<n;i++) 
			System.out.print(a[i]+" "); 
		start=System.nanoTime(); 
		mergesort(a,0,n-1); 
		end=System.nanoTime(); 
		System.out.println("\nThe sorted array: "); 
		for(int i=0;i<n;i++) 
			System.out.print(a[i]+" "); 
		 
		System.out.println("\nThe time taken to sort the array is:"+(end-start)+" ns"); 
		System.out.println("****"); 
	} 
	
	static void mergesort(int a[],int low,int high) 
	{ 
		int mid; 
		if(low<high)
		{ 
			mid=(high+low)/2; 
			mergesort(a,low,mid); 
			mergesort(a,mid+1,high); 
			merge(a,low,mid,high);
		}
	}
		
	static void merge(int a[],int low,int mid,int high)
	{ 
		int i,j,k; 
		int temp[]=new int[100000]; 
		i=low;k=low;j=mid+1; 
		while((i<=mid)&&(j<=high)) 
		{ 
			if(a[i]<a[j]) 
			{ 
				temp[k]=a[i]; 
				i++;
				k++;
			} 
			else 
			{ 
				temp[k]=a[j]; 
				k++;j++;
			}
		} 
		while((i<=mid)) 
		{ 
			temp[k]=a[i]; 
			i++;
			k++;
		} 
		while((j<=high)) 
		{ 
			temp[k]=a[j]; 
			k++;j++;
		} 
		for(k=low;k<=high;k++) 
			a[k]=temp[k];
		
	}
 
		
		

}


