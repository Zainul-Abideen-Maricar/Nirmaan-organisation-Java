package day11;

public class Employee {
	public static void main(String[] args) {
		
	

	Company emp1=new Company("Ali",1343,"ITI",536236592);
	
	emp1.setEmpName("Guddus");
	emp1.setEmpId(1234);
	System.out.println(emp1.getEmpName());
	System.out.println(emp1.getEmpId());
	System.out.println(emp1.getEmpDept());
	System.out.println(emp1.getPhoneNumber());
	
	System.out.println("");
	
	Company emp2=new Company("zainul",32552,"IT",57498547);
	
	System.out.println(emp2.toString());
	
	
	}
}
