package sub_class;

import java.util.Scanner;

import super_class.Person;

public class Doctor extends Person {
	private int doctorLincenseNo;
	private String doctorSpecialization;
	private float fees;
	Scanner sc=new Scanner(System.in);
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Doctor(String personName, int personAge, String personAddress, int doctorLincenseNo,
			String doctorSpecialization, float fees) {
		super(personName, personAge, personAddress);
		this.doctorLincenseNo = doctorLincenseNo;
		this.doctorSpecialization = doctorSpecialization;
		this.fees = fees;
	}
	
	


	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Enter a License No : ");
		this.doctorLincenseNo=sc.nextInt();
		System.out.println("Enter a Name : ");
		String name=sc.next();
		super.setPersonName(name);
		System.out.println("Enter a Age : ");
		int age=sc.nextInt();
		super.setPersonAge(age);
		System.out.println("Enter a Specialization : ");
		this.doctorSpecialization=sc.next();
		System.out.println("Enter Fees : ");
		this.fees=sc.nextFloat();
		System.out.println("Enter a Address: ");
		String addr=sc.next();
		super.setPersonAddress(addr);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nLicense No : "+this.doctorLincenseNo);
		System.out.println("Name : "+super.getPersonName());
		System.out.println("Age : "+super.getPersonAge());
		System.out.println("Specialization : "+this.doctorSpecialization);
		System.out.println("Fees : "+this.fees);
		System.out.println("Address : "+super.getPersonAddress());

	}

}
