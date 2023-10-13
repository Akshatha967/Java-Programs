import java.util.*;
public class kruskal { 
	static int min_cost=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost=new int[10][10];
		int i,j,mincost=0; 
		Scanner in=new Scanner(System.in); 
		System.out.println("--Kruskals Algorithm--"); 
		System.out.println("Enter the number of nodes:"); 
		int n=in.nextInt();
		System.out.println("Enter the cost mastrix:"); 
		for(i=1;i<=n;i++)
		{ 
			for(j=1;j<=n;j++){ 
				cost[i][j]=in.nextInt();
				
			}
		}
		System.out.println("The cost mastrix:"); 
		for(i=1;i<=n;i++)
		{ 
			for(j=1;j<=n;j++){ 
				System.out.print(cost[i][j]+"\t");
				
			} 
			System.out.println();
		} 
		mincost=kruskals(n,cost); 
		System.out.println("The minimum cost of spanning tree:"+mincost); 
		System.out.println("***");
		} 
	static int kruskals(int n,int cost[][])
	{ 
		int ne=1,a=0,u=0,b=0,v=0,min; 
		int parent[]=new int[10]; 
		
		
		while(ne<n) 
		{ 
			min=999; 
			for(int i=1;i<=n;i++)
			{ 
				for(int j=1;j<=n;j++)
				{ 
					if((cost[i][j]<min)&&(cost[i][j] !=0)) 
{ 
	min=cost[i][j]; 
	a=u=i; 
	b=v=j; 
	System.out.println("u"+u+" a"+a+" b"+b+" v"+v);
}
				}
			} 
			System.out.println("Parent: u: "+parent[u]+" v: "+parent[v]);
			while(parent[u]>0) { 
				
				u=parent[u]; 
				System.out.println("Inside parent u="+u+"parent[u]"+parent[u]);
			} 
			while(parent[v]>0) { 
				v=parent[v]; 
				System.out.println("Inside parent v="+v+"parent[v]"+parent[v]);
			} 
			if(u==v) 
			{ 
				System.out.println("***** equal*** V: "+v+"u:"+u);
			}
			if(u!=v) { 
				System.out.println((ne++)+">minimum edge is:("+a+","+b+") and its cost is:"+min); 
				min_cost+=min; 
				parent[v]=u; 
				
			} 
			cost[a][b]=cost[b][a]=999;

		} 
		return min_cost;
	}

}
