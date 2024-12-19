package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handling {
	
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
	int age=0;
        try {
      age=sc.nextInt();
     
      if(age>0) {
    	  System.out.println("valid age");
      }
      else {
    	  throw  new ArithmeticException();
      }
        }
        
        catch(ArithmeticException e) {
        	System.out.println("Enter Correct number");
        }
        
        catch(InputMismatchException i) {
        	System.out.println("Enter only number");
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        finally {
        	System.out.println("Always Work");
        }
	
        System.out.println(age);
	
}
}