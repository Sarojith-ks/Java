import java.util.*;
class employee
{
int empId,salary;
String empName,empAddress;
employee(int empId,String empName,int salary,String empAddress)
{
this.empId=empId;
this.empName=empName;
this.salary=salary;
this.empAddress=empAddress;
	}
}
class teacher extends employee
{
String department,subject;
teacher(int empId,String empName,int salary,String empAddress,String department,String subject)
	{
super(empId,empName,salary,empAddress);
this.department=department;
this.subject=subject;
	}
void display()
	{
System.out.println(" employee id is :"+empId);
System.out.println(" employee name is :"+empName);
System.out.println(" employee salary is :"+salary);
System.out.println(" employee address is :"+empAddress);
System.out.println(" employee department is :"+department);
System.out.println(" employee subject is :"+subject);
	}
}
class inherit
{
public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
int empId,salary;
String empName,empAddress;	
String department,subject;
System.out.println("Enter the number of employees : ");
int n=sc.nextInt();
teacher arr[]=new teacher[n];
for(int i=0;i<n;i++)
		{
	int a=i+1;
	
	System.out.println("Enter " +a +" employee details :");
	System.out.println(" Enter employee id :");
	empId=sc.nextInt();
	System.out.println(" Enter employee name :");
	empName=sc1.nextLine();
	System.out.println(" Enter empoyee salary :");
	salary=sc.nextInt();
	System.out.println(" Enter empoyee Address:");
	empAddress=sc1.nextLine();
	System.out.println(" Enter empoyee department:");
	department=sc1.nextLine();
	System.out.println(" Enter empoyee subject:");
	subject=sc1.nextLine();
	arr[i]=new teacher(empId,empName,salary,empAddress,department,subject);
	}
		
boolean flag=false;
System.out.println(" Enter the id of any employe to search");
int eid=sc.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i].empId==eid)
{
arr[i].display();
flag=true;
}
}
if(flag==false)
{
System.out.println("ID not found");
}
}
}
	
	
