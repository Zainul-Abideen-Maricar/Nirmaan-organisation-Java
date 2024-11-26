package day3;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Mark : ");
		
		int mark=sc.nextInt();
		
		
		if(mark>=35) {
			System.out.println("Pass");
			
			if(mark>90) {
				System.out.println("Grade A");
			}
			else if(mark>70) {
				System.out.println("Grade B");
			}
			else if(mark>50) {
				System.out.println("Grade C");
			}
			else if(mark>=35) {
				System.out.println("Grade D");
			}
			
		}else {
			System.out.println("Fail");
		}
		
	}
	
}
