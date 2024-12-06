package day11;

public class Company {

    private	String empName;
    private	int empId;
	private String empDept;
	private int phoneNumber;
	

	   public Company() {

	    }
	
   public Company(String empName,int empId,String empDept,int phoneNumber ) {
	   this.empName=empName;
	   this.empId=empId;
	   this.empDept=empDept;
	   this.phoneNumber=phoneNumber;
   }

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpDept() {
	return empDept;
}

public void setEmpDept(String empDept) {
	this.empDept = empDept;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

//@Override
public String toString() {
	return " Your name is: "+empName+"\n your id is: "+empId+"\n your department is: "+empDept+"\n your number is: "+phoneNumber;
}
	

   
   
	
}
