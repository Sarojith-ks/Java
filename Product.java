import java.util.*;
class Product {
    int pcode,price;
    String pname;
}
public class Main {
    public static void main(String[]args)
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the code of the first product :");
        p1.pcode=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the first product :");
        p1.pname=sc.nextLine();
        System.out.println("enter the price of the first product :");
        p1.price=sc.nextInt();
        System.out.println("enter the code of the second product :");
        p2.pcode=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the second product :");
        p2.pname=sc.nextLine();
        System.out.println("enter the price of the second product :");
        p2.price=sc.nextInt();
        System.out.println("enter the code of the third product :");
        p3.pcode=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the third product :");
        p3.pname=sc.nextLine();
        System.out.println("enter the price of the third product :");
        p3.price=sc.nextInt();
        Product lowest=p1;
        if(p2.price<lowest.price)
        {
            lowest=p2;
        }
        else if(p3.price<lowest.price)
        {
            lowest=p3;
        }
        System.out.println(lowest.pname+" has the lowest price with code "+ lowest.pcode +" and price "+lowest.price);
        }
        }





