package sub_class;

import java.util.Scanner;

import super_class.Person;

public class Employee extends Person {
	Scanner sc=new Scanner(System.in);
	private int EmployeeId;
	private String Department;
	private float Salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String personName, int personAge, String personAddress, Scanner sc, int employeeId,
			String department, float salary) {
		super(personName, personAge, personAddress);
		this.sc = sc;
		EmployeeId = employeeId;
		Department = department;
		Salary = salary;
	}



	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Enter a Employee Id : ");
		this.EmployeeId=sc.nextInt();
		System.out.println("Enter a Employee Name : ");
		String name=sc.next();
		super.setPersonName(name);
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		super.setPersonAge(age);
		System.out.println("Enter a Department : ");
		this.Department=sc.next();
		System.out.println("Enter a Salary : ");
		this.Salary=sc.nextFloat();
		System.out.println("Enter a Address: ");
		String addr=sc.next();
		super.setPersonAddress(addr);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nEmployee Id : "+this.EmployeeId);
		System.out.println("Name : "+super.getPersonName());
		System.out.println("Age : "+super.getPersonAge());
		System.out.println("Department : "+this.Department);
		System.out.println("Salary : "+this.Salary);
		System.out.println("Address : "+super.getPersonAddress());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
