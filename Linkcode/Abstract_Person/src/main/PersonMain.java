package main;

import java.util.Scanner;

import sub_class.Doctor;
import sub_class.Employee;
import sub_class.Student;
import sub_class.Teacher;
import super_class.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		
//		int sn, en, dn, tn;
//		sn = en = dn = tn =0; 
		int n = 0;
//		Student s[] = new Student[100];
//		Employee e[] = new Employee[100];
//		Doctor d[] = new Doctor[100];
//		Teacher t[] = new Teacher[100];
		
		Person p[] = new Person[500];
		
		while(true) {
			System.out.println("\n1.Enter Student Record\n2.Display Student Record\n3.Enter Teacher Record\n4.Display Teacher Record\n5.Enter Employee Record\n6.Display Employee Record\n7.Enter Doctor Record\n8.Display Doctor Record\n9.Exit");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch){
			case 1:
//				s[sn] = new  Student();
//				s[sn].create();
//				sn++;
				
				p[n] = new Student();
				p[n].create();
				n++;
				
				break;
			case 2:
//				for(int i=0 ; i<sn ; i++) {
//				    System.out.println("\nFor Student " + (i+1));
//					s[i].display();
//				}
				
				for(int i=0 ; i<n ; i++) {
					if(p[i] instanceof Student) {
						p[i].display();
					}
				}
				
				break;
			case 3:
//				t[tn] = new Teacher();
//				t[tn].create();
//				tn++;
				p[n] = new Teacher();
				p[n].create();
				n++;
				
				break;
			case 4:
//				for(int i=0 ; i<tn ; i++) {
//					System.out.println("\nFor Teacher " + (i+1));
//					t[i].display();
//				}
				
				for(int i=0 ; i<n ; i++) {
					if(p[i] instanceof Teacher) {
						p[i].display();
					}
				}
				
				break;
			case 5:
//				e[en] = new Employee();
//				e[en].create();
//				en++;
				
				p[n] = new Employee();
				p[n].create();
				n++;
				
				break;
			case 6:
//				for(int i=0 ; i<en ; i++) {
//					System.out.println("\nFor Employee " + (i+1));
//					e[i].display();
//				}
				
				for(int i=0 ; i<n ; i++) {
					if(p[i] instanceof Employee) {
						p[i].display();
					}
				}
				
				break;
			case 7:
//				d[dn] = new Doctor();
//				d[dn].create();
//				dn++;
				
				p[n] = new Doctor();
				p[n].create();
				n++;
				
				break;
			case 8:
//				for(int i=0 ; i<dn ; i++) {
//					System.out.println("\nFor Doctor " + (i+1));
//					d[i].display();
//				}
				
				for(int i=0 ; i<n ; i++) {
					if(p[i] instanceof Doctor) {
						p[i].display();
					}
				}
				
				break;
			case 9:
				System.exit(0);
				
			}
		}
	}
}
