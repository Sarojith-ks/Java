import java.util.Scanner;
class Shapes{
void area(int l,int b){
System.out.println("Area of rectangle is :"+l*b);
}
void area(float r){
System.out.println("Area of circle is :"+3.14*r*r);
}
void area(double s){
System.out.println("Area of square is :"+s*s);
}
}
class Overload{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Shapes shapes=new Shapes();
System.out.println("enter the length and breadth rectangle :");
int l=sc.nextInt();
int b=sc.nextInt();
shapes.area(l,b);
System.out.println("enter the radius circle:");
float r=sc.nextInt();
shapes.area(r);
System.out.println("enter the side of square:");
double s=sc.nextInt();
shapes.area(s);
}
}


