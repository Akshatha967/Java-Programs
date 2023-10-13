import java.util.Scanner;

class Stack 
{ 
	int Max=10; 
	int S[]=new int 1[Max]; 
	int top= -1; 
	public void push(int item) 
	{
		if(top<Max-1)
		{ 
			top ++; 
			S[top]=item; 
			System.out.println("The element is pushed"); 
			
		} 
		else 
		{ 
			System.out.println("Stack overflow\n"); 
			
		}
	}  
	public int pop()  
	{ 
		int item;
		if(top==-1) 
		{ 
			System.out.println("Stack is empty "); 
			return -1; 
			
		} 
		else 
		{ 
			item=S[top]; 
			top--; 
			return item; 
		}
	} 
	public void display() 
	{ 
		if(top== -1) 
			System.out.println("sack empty"); 
		else 
		{ 
			for(int i=top; i>=0; i --) 
			{ 
				System.out.println(S[i]); 
			}

		}
	}
} 

public class Lab1B {

	public static void main(String[] args) { 
		Stack S=new Stack(); 
		Scanner in=new Scanner (System.in); 
		int choice , val; 
		while(true) 
		{ 
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit"); 
			System.out.println("enter your choice:"); 
			choice=in.nextInt(); 
			switch(choice) 
			{ 
			case 1: System.out.println("enter an element:"); 
			val=in.nextInt();  
			S.push(val); 
			break; 
			case 2: System.out.println("Popped element:"+S.pop()); 
			break; 
			case 3: System.out.println("Stack contents are:"); 
			S.display();  
			break; 
			case 4: 
				System.exit(0); 
				
			
				
			}
		}
		
		// TODO Auto-generated method stub

	}

}
