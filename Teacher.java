import java.util.*;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int emp_id;
    String company_name;
    String qualification;
    int salary;

    Employee(String name, String gender, String address, int age, int emp_id, String company_name, String qualification, int salary) {
        
        super(name, gender, address, age);
        this.emp_id = emp_id;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

class Teacher1 extends Employee {
    String subject;
    String department;
    int t_id;

    Teacher1(String name, String gender, String address, int age, int emp_id, String company_name, String qualification, int salary, String subject, String department, int t_id) {
       
        super(name, gender, address, age, emp_id, company_name, qualification, salary);
        this.subject = subject;
        this.depart = department;
        this.t_id = t_id;
    }

   
    void display() {
       
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        displayEmployeeDetails(); 
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + t_id);
    }
}
 class Teacher {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the number of teachers: ");
        n = sc.nextInt();      
        Teacher1[] teachers = new Teacher1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1));

            System.out.println("Enter name of the teacher: ");
            String name = sc1.nextLine();
            System.out.println("Enter gender of the teacher: ");
            String gender = sc1.nextLine();
            System.out.println("Enter address of the teacher: ");
            String address = sc1.nextLine();
            System.out.println("Enter age of the teacher: ");
            int age = sc.nextInt();
            System.out.println("Enter employee ID: ");
            int emp_id = sc.nextInt();
            System.out.println("Enter company name: ");
            String company_name = sc1.nextLine();  
            c_name = sc1.nextLine();
            System.out.println("Enter qualification: ");
            String qualification = sc1.nextLine();
            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            System.out.println("Enter subject: ");
            String subject = sc1.nextLine();
            subject = sc1.nextLine();
            System.out.println("Enter department: ");
            String department = sc1.nextLine();
            System.out.println("Enter teacher ID: ");
            int t_id = sc.nextInt();

            teachers[i] = new Teacher1(name, gender, address, age, emp_id, company_name, qualification, salary, subject, department, t_id);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Teacher " + (i + 1) + ":");
            teachers[i].display();  
        }
    }
}

