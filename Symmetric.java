import java.util.*;
public class Symmetric{
public static void main(String args[])
{
	int i,j,r,c;
	int a[][]=new int[10][10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Matrix symmetric or not \n enter the rows and columns no :");
	r=sc.nextInt();
	c=sc.nextInt();
	System.out.println("enter matrix elements:");
	for(i=0;i<r;i++){
	for(j=0;j<c;j++){
	a[i][j]=sc.nextInt();
	}
	}
	System.out.println("matrix is:");
	for(i=0;i<r;i++){
	for(j=0;j<c;j++){
	System.out.print(a[i][j]+" ");}
	System.out.println();
	}
	boolean isSym=true;
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	if(a[i][j]!=a[j][i])
	{
		isSym=false;
		break;
	}
	}
	if(!isSym)
	{
	break;}
	}
	if(isSym)
	{
	System.out.println("is Symmetric matrix :");
	}
	else
	{
		System.out.println("is not Symmetric matrix :");
		}
	sc.close();
	}
	}
	
