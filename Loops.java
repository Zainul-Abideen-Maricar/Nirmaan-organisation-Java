package day3;

import java.util.Scanner;

public class Loops {

	public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Table : ");
	
	int table=sc.nextInt();
	
	for(int i=1;i<=10;i++) {
		System.out.println(table+"X"+i+"="+i*table);
	}
	
	
}
}