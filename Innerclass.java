import java.util.*;
class Innerclass
{
	public static void main(String args[])
	{
	    System.out.println("Enter the CPU price : ");
		Scanner s2=new Scanner(System.in);
		int p=s2.nextInt();
		Cpu obj=new Cpu(p);
		obj.cpudetails();
	}
}
class Cpu
{
	double price;
	
	Cpu(double p)
	{
		price=p;
		
	}
	
	void cpudetails()
	{
		Processor p=new Processor();
		p.read();
		Ram.get();
		p.display();
		Ram.display1();
	} 
	class Processor
	{
		int cores;
		String mft;
		void read()
		{
			System.out.println("Enter the Procoessor Details");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of cores : ");
			cores=sc.nextInt();
			System.out.println("Enter the manufacturer : ");
			mft=sc.next();
		}
		void display()
		{
			System.out.println("...Processor Details...");
			System.out.println("Number of cores : "+cores);
			System.out.println("Manufacturer : "+mft);
		}
	}
	static class Ram
	{
		 static String mem,man;
		 static void get()
		{
			System.out.println("Enter the RAM Details");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the memory : ");
			mem=s.next();
			System.out.println("Enter the manufacturer : ");
			man=s.next();
		}
		 static void display1()
		{
			System.out.println("RAM Details");
			System.out.println("Memory : "+mem);
			System.out.println("Manufacturer : "+man);
		}
	}
}	
	
	
	
