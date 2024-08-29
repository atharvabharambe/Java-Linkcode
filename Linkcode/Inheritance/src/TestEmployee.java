import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		int id;
		String dept;
		int age;
		String name,address,mob,dob;
		float salary;
		Employee result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employee: ");
		int n = sc.nextInt();
		Employee emp[] = new Employee[n];
		
		
		EmployeeServices.create(emp, n);
		
		
		while(true) {
			System.out.println("1. Search by ID\n2. Search by Name\n3. Delete\n4. Display");
			int ch = sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter a id: ");
					id = sc.nextInt();
					result = EmployeeServices.search(emp,n,id);
					if(result == null) {
						System.out.println("ID not found");
					}else {
						System.out.println(result);
					}
					break;
				case 2:
					System.out.println("Enter a name: ");
					name = sc.next();
					result = EmployeeServices.search(emp,n,name);
					if(result == null) {
						System.out.println("name not found");
					}else {
						System.out.println(result);
					}
					break;
				case 3:
					System.out.println("Enter a id: ");
					id = sc.nextInt();
					EmployeeServices.delete(emp,n,id);
					break;
				case 4:
					EmployeeServices.display(emp,n);
					break;
				}
		}
	}

}
