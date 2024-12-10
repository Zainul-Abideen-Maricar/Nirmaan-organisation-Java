package day14;

import java.util.Scanner;

public class EmployeeManagement {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Employee emp1 =null;
		boolean isTrue=true;
		
	
	while(isTrue) {
		
		System.out.println("Enter your choice: ");
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for update");
		System.out.println("Enter 3 for view");
		System.out.println("Enter 0 for exit");
		int value=sc.nextInt();
		sc.nextLine();
		
		
	switch(value) {
	
	case 0:{
		isTrue=false;
		System.out.println("Thank You");
		break;
	}
	
	case 1:{
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter department: ");
		String department=sc.nextLine();
		System.out.println("Enter phone number: ");
		long phoneNumer=sc.nextLong();
		sc.nextLine();
		emp1=new Employee(name, id, department,phoneNumer);
		break;
	}
	
	case 2:{
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		emp1.setEmpName(name);
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		emp1.setEmpId(id);
		sc.nextLine();
		System.out.println("Enter department: ");
		String department=sc.nextLine();
		emp1.setEmpDept(department);
		System.out.println("Enter phone number: ");
		long phoneNumber=sc.nextLong();
		emp1.setPhoneNumber(phoneNumber);
		sc.nextLine();
		
	}
	case 3:{
		
		System.out.println(emp1);
		
	}
	
	default:{
		System.out.println("Enter your correct choice");
		continue;
	}
	}
		
	}
		
		
		
	}
	

}
