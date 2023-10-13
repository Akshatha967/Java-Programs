package program2a; 
class Staff1 
{ 
	int staffId; 
	String name; 
	String phone; 
	double salary; 
	Staff1(int id,String n,String ph,double sal)
	{ 
		 staffId=id; 
		name=n; 
		 phone=ph; 
		salary=sal; 
	} 
	public void display()
	{ 
		System.out.print("\t"+staffId+"\t"+name+"\t\t"+phone+"\t"+salary);
	}
} 

class Teaching extends Staff1
{ 
	String domain; 
	int publications; 
	Teaching(int id,String n,String ph,double sal,String dom,int pub)
	{ 
		super(id,n,ph,sal); 
		domain=dom; 
		publications=pub;
	} 
	public void display()
	{ 
		super.display();
		System.out.println("\t"+domain+"\t"+publications);
	}
} 
class Technical extends Staff1 
{ 
	String skills; 
	Technical(int id,String n,String ph,double sal,String sk)
	{ 
		super(id,n,ph,sal); 
		skills=sk;
	}

	public void display()
	{ 
		super.display(); 
		System.out.println("\t\t\t\t"+skills);
	
	} 
} 

class Contract extends Staff1 
{ 
	int period; 
	Contract(int id,String n,String ph,double sal,int per)
	{ 
		super(id,n,ph,sal); 
		period=per;
	} 
	public void display()
	{ 
		super.display(); 
		System.out.println("\t\t\t\t\t"+period);
	}
 }

public class Staff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Staff1 s[]=new Staff1[10]; 
		s[0]=new Teaching(1,"Niall","9900990019",10000,"CSE",5); 
		s[1]=new Teaching(2,"Ariana","9900990029",20000,"ISE",4); 
		s[2]=new Teaching(3,"Camila","9900990039",30000,"ME",3); 
		s[3]=new Technical(4,"Justin","9900990049",1000,"C++"); 
		s[4]=new Technical(5,"Taylor","9900990059",2000,"Java");
		s[5]=new Technical(6,"Drake","9900990069",3000,"Python");
		s[6]=new Contract(7,"Limpa","9900990079",1500,10);
		s[7]=new Contract(8,"Anne","9900990089",2500,9);
		s[8]=new Contract(9,"Manu","9900990099",3500,8); 
		System.out.println("\tStaffId\tStaffName\tPhoneNumber\tSalary\tDomain\tPublications\tSkills\tPeriod"); 
		for(int i=0;i<3;i++)
		{ 
			System.out.println("teaching:");
			s[i].display();
		}
		for(int i=3;i<6;i++)
		{ 
			System.out.println("Technical:");
			s[i].display();
		} 
		for(int i=6;i<9;i++)
		{ 
			System.out.println("Contract:");
			s[i].display();
		}
		

	}

}
