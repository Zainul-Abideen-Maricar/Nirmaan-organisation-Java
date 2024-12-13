package day15;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		
		Scanner sc=new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("Addition: ");
	   System.out.println(calc.add(a,b));	
	   System.out.println("Subtraction: ");
		System.out.println(calc.sub(sc.nextInt(), sc.nextInt()));
		System.out.println("Multiplication: ");
		System.out.println(calc.mul(sc.nextInt(), sc.nextInt()));
		System.out.println("Division: ");
		System.out.println(calc.div(sc.nextInt(),sc.nextInt()));
		
		
	}
	
}
