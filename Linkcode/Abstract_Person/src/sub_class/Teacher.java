package sub_class;

import java.util.Scanner;

import super_class.Person;

public class Teacher extends Person {
	
	Scanner sc= new Scanner(System.in);
	private int teacherId;
	private String teacherSubject;
	private float teacherExp;
	
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	


	public Teacher(String personName, int personAge, String personAddress, int teacherId, String teacherSubject,
			float teacherExp) {
		super(personName, personAge, personAddress);
		this.teacherId = teacherId;
		this.teacherSubject = teacherSubject;
		this.teacherExp = teacherExp;
	}





	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Enter a Id : ");
		this.teacherId=sc.nextInt();
		System.out.println("Enter a Name : ");
		String name=sc.next();
		super.setPersonName(name);
		System.out.println("Enter a Age : ");
		int age=sc.nextInt();
		super.setPersonAge(age);
		System.out.println("Enter a Subject : ");
		this.teacherSubject=sc.next();
		System.out.println("Enter a Exp : ");
		this.teacherExp=sc.nextFloat();
		System.out.println("Enter a Address: ");
		String addr=sc.next();
		super.setPersonAddress(addr);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nId : "+this.teacherId);
		System.out.println("Name : "+super.getPersonName());
		System.out.println("Age : "+super.getPersonAge());
		System.out.println("Subject : "+this.teacherSubject);
		System.out.println("Exp : "+this.teacherExp);
		System.out.println("Address : "+super.getPersonAddress());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
