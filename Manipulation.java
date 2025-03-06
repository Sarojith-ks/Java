import java.util.*;
class Manipulation{
public static void main(String args[]){
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter a String1");
s1=sc.nextLine();
System.out.println("enter a String2");
s2=sc.nextLine();
String s1Lower=s1.toLowerCase();
System.out.println("Lowercase :"+s1Lower);
String s1Upper=s1.toUpperCase();
System.out.println("Uppercase :"+s1Upper);
System.out.println("substring(1 to 3) :"+s1.substring(1,3));
System.out.println("Length of the string is :"+s1.length());
System.out.print("Concatenate of two strings:");
System.out.println(s1.concat(s2));
}
}

