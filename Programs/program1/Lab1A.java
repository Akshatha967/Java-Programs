import java.io.*; 

class Student 
{ 
	private String usn ,name,branch,phone; 
	public Student (String a , String b , String c , String d) 
	{ 
		usn =a; 
		name =b; 
		branch=c; 
		phone=d;
	} 
	public String printname()
	{ 
		return name; 
	}
	public String printusn()
	{ 
		return usn;
	} 
	public String printbranch()
	{ 
		return branch;
	} 
	public String printphone()
	{ 
		return phone;
	} 
}

 public  class Lab1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n=0,i=0 ; 
		BufferedReader d =new BufferedReader(new InputStreamReader(System.in)); 
		String USN1,Name1,Branch1,Phone1; 
		Student[] studentArray = new Student[7]; 
		try 
		{ 
			System.out.println("enter number of students:"); 
			n=Integer.parseInt(d.readLine()); 
			for(i=1;i<=n; i++)
			{ 
				System.out.println("Enter USN:"); 
				String USN=d.readLine(); 
				System.out.println("Enter Name:"); 
				String Name=d.readLine();
				System.out.println("Enter Branch:"); 
				String Branch=d.readLine(); 
				System.out.println("Enter Phone:"); 
				String Phone =d.readLine(); 
				studentArray[i]=new Student(USN,Name,Branch,Phone); 
			} 
			System.out.println("studenr details are:");
			System.out.println("USN\t\t\tName\tBranch\tPhone");
			for(i=1;i<=n;i++) 
				{ 
					USN1=studentArray[i].printusn(); 
					Name1=studentArray[i].printname(); 
					Branch1=studentArray[i].printbranch(); 
					Phone1=studentArray[i].printphone(); 
					System.out.println(USN1+"\t"+Name1+"\t"+Branch1+"\t"+Phone1);
					
				}
		}  
		catch (Exception e)
		{ 
		}}}


