package day6;

public class NirmaanOrg {

          int id=0;
          String name="";
          float salary=0;
          String department="";
          
          void checkIn() {
        	  System.out.println("Employee Present");
          }
          
          void myName(String name) {
        	  System.out.println(name);
          }
          
          
          
          public static void main(String[] args) {
			
        	  NirmaanOrg emp1=new NirmaanOrg();
        	  emp1.id=01;
        	  emp1.name="zainul";
        	  emp1.salary=5643.54f;
        	  emp1.department="IT";
        	  
        	  System.out.println(emp1.id);
        	  System.out.println(emp1.name);
        	  System.out.println(emp1.salary);
        	  System.out.println(emp1.department);
        	  emp1.checkIn();
        	  
        	  System.out.println("");
        	  
        	  NirmaanOrg emp2=new NirmaanOrg();
        	  
        	  emp2.id=02;
        	  emp2.name="Guddus";
        	  emp2.salary=5643.54f;
        	  emp2.department="IT";
        	  
        	  System.out.println(emp2.id);
        	  System.out.println(emp2.name);
        	  System.out.println(emp2.salary);
        	  System.out.println(emp2.department);
        	  emp2.checkIn();
        	  System.out.println("");
        	  
        	  System.out.print("Employee name: ");
        	  emp2.myName("Zainul");
        	  
		}
          
	
	
	
}
