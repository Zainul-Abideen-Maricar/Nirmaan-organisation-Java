package day18;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c = 0;
	try {
		System.out.println("Enter first number: ");
     a = sc.nextInt();
     System.out.println("Enter second number: ");
	b = sc.nextInt();
	
	 c=a/b;
	}catch(Exception e) {
		System.out.println(e);
	}
	finally {
	System.out.println(c);
}
}
}