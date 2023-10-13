import java.util.Scanner;
public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n; 
		float temp,m; 
		float p[]=new float[15]; 
		float w[]=new float[15]; 
		float c[]=new float[15]; 
		System.out.println("Enter the number of elements"); 
		Scanner s=new Scanner(System.in); 
		n=s.nextInt();
		System.out.println("Enter the weights:"); 
		for(i=1;i<=n;i++)
		{ 
			w[i]=s.nextFloat(); 
			
		}
		System.out.println("Enter the progit:"); 
		for(i=1;i<=n;i++)
			p[i]=s.nextFloat(); 
		System.out.println("Enter the knapsack capacity:"); 
		m=s.nextInt();
		for(i=1;i<=n;i++)
			c[i]=p[i]/w[i]; 
		for(i=1;i<=n;i++)
		{ 
			for(j=1;j<=n-1;j++)
			{ 
				if(c[j]<c[j+1])
					{ 
					temp=c[j]; 
					c[j]=c[j+1]; 
					c[j+1]=temp; 
					
					temp=w[j]; 
					w[j]=w[j+1]; 
					w[j+1]=temp;
					
					temp=p[j]; 
					p[j]=p[j+1]; 
					p[j+1]=temp;
					
					}
			}
		} 
		System.out.println("The items to be arranged:"); 
		System.out.println("\nItems\tWeight\tProfit\tratio "); 
		for(i=1;i<=n;i++)
		System.out.println("\nx["+i+"]\t"+w[i]+"\t"+p[i]+"\t"+c[i]); 
		knapsack(n,m,w,p); 
	} 
	public static void knapsack(int n,float m,float w[],float p[])
	{ 
		float x[]=new float[15]; 
		float u,profit=0,weight=0;  
		int i; 
		u=m; 
		for(i=1;i<=n;i++)
			x[i]=0; 
		for(i=1;i<=n;i++)
		{ 
			if(w[i]>u) 
				break; 
			x[i]=1; 
			u=u-w[i]; 
			
		}
		if(i<=n) 
			System.out.println(u+" "+w[i]);
			x[i]=u/w[i]; 
		System.out.println("The solution vector is :"); 
		for(i=1;i<=n;i++)
		{ 
			System.out.println(x[i]+"\t"); 
		} 
		for(i=1;i<=n;i++)
		{
			w[i]=w[i]*x[i]; 
			p[i]=p[i]*x[i]; 
		}
			
			
		
		for(i=1;i<=n;i++)
		{ 
			weight=weight+w[i]; 
			profit=profit+p[i];
		} 
		System.out.println("\n The maximum Profit is:"); 
		System.out.println("\t"+profit); 
		System.out.println("The total weight is:"+weight); 
		
		
	}
}
