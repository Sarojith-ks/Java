import java.util.*;
class Searchelement{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements : ");
	int n =sc.nextInt();
	int array[]=new int[n];
	System.out.println("enter "+ n +"elements:");
	for (int i=0;i<n;i++){
	array[i]=sc.nextInt();
	}
	System.out.println("enter the element to be searched :");
	int num =sc.nextInt();
	for(int i=0;i<n;i++){
	if(array[i]==num){
	i=i+1;
	System.out.println("element found at position : " + i);
	sc.close();
	return;
	}
	}
	System.out.println("element not found :");
	sc.close();
	}
}
