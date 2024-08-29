import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		 int age;
		 String name,address,mob,dob;
		 int roll;
		 float marks;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Roll Number: ");
		 roll = sc.nextInt();
		 System.out.println("Enter Name: ");
		 name = sc.next();
		 System.out.println("Enter Age: ");
		 age = sc.nextInt();
		 System.out.println("Enter Marks: ");
		 marks = sc.nextFloat();
		 System.out.println("Enter Phone number: ");
		 mob = sc.next();
		 System.out.println("Enter Date of Birth ");
		 dob = sc.next();
		 System.out.println("Enter Address: ");
		 address= sc.next();
		 
		 Student s = new Student(age, name, address, mob, dob, roll, marks);
		 System.out.println(s);

	}

}
