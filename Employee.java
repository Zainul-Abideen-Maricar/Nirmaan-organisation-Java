package day14;

public class Employee {

  private String empName;
  private int empId;
  private String empDept;
  private Long phoneNumber;

  
  public Employee() {
	  
  }
  
  
  public Employee(String empName, int empId, String empDept,  long phoneNumer) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empDept = empDept;
	this.phoneNumber =  phoneNumer;
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


public long getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}


@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + ", phoneNumber=" + phoneNumber
			+ "]";
}
  
  
  
	
	
}
