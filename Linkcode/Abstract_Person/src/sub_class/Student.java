package sub_class;

import java.util.Scanner;

import super_class.Person;

public class Student extends Person {
	private int studentRoll;
	private String studentDiv;
	private float studentMarks;
	
	
	
	
	public Student(String personName, int personAge, String personAddress, int studentRoll, String studentDiv,
			float studentMarks) {
		super(personName, personAge, personAddress);
		this.studentRoll = studentRoll;
		this.studentDiv = studentDiv;
		this.studentMarks = studentMarks;
	}

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getStudentRoll() {
		return studentRoll;
	}



	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}



	public String getStudentDiv() {
		return studentDiv;
	}



	public void setStudentDiv(String studentDiv) {
		this.studentDiv = studentDiv;
	}



	public float getStudentMarks() {
		return studentMarks;
	}



	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}



	@Override
	public void create() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Roll number: ");
		this.studentRoll = sc.nextInt();
		System.out.println("Enter Division: ");
		this.studentDiv = sc.next();
		System.out.println("Enter Marks: ");
		this.studentMarks = sc.nextFloat();
		
		System.out.println("Enter a Name: ");
		String name = sc.next();
		super.setPersonName(name);
		System.out.println("Enter a Age: ");
		int age = sc.nextInt();
		super.setPersonAge(age);
		System.out.println("Enter an Address: ");
		String address = sc.next();
		super.setPersonAddress(address);
		
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Roll number: " + this.studentRoll);
		System.out.println("Division: " + this.studentDiv);
		System.out.println("Marks: " + this.studentMarks);
		
		System.out.println("Name: " + super.getPersonName());
		System.out.println("Age: " + super.getPersonAge());
		System.out.println("Address: " + super.getPersonAddress());
		
	}

}
