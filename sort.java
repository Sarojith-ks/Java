
import java.util.*;
class sort{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
int n;
String temp;
System.out.println("Enter the no of string want to insert:");
n=sc.nextInt();
String[] arr=new String[n];
System.out.println("Enter the strings:");
{
	for(int i=0;i<n;i++)
	{
		arr[i]=s1.nextLine();
	}
}
System.out.println("\nbefore sorting:");
{
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}
System.out.println("after sorting:");
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(arr[i].compareTo(arr[j])>0)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}
}
}
