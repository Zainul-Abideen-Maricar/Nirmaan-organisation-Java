package day2;

import java.util.Scanner;

public class Conditional {
	public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	
	//boolean isTrue=true;
//	
//	System.out.println("Enter Your Choice");
//	System.out.println("0 for add");
//	System.out.println("1 for sub");
//	System.out.println("2 for mul");
//	System.out.println("3 for div");
//	System.out.println("4 for module ");
//	System.out.println("5 for exit");
//	
//	int key=sc.nextInt();
	
	
//	if(key==0) {
//		
//		System.out.println("Enter your firstNum : ");
//		int firstNum=sc.nextInt();
//		System.out.println("Enter your secondNum : ");
//		int secondNum=sc.nextInt();
//		int total=firstNum+secondNum;
//		System.out.println("total : "+total);
//	}
//	
//	else if(key==1) {
//		
//		System.out.println("Enter your firstNum : ");
//		int firstNum=sc.nextInt();
//		System.out.println("Enter your secondNum : ");
//		int secondNum=sc.nextInt();
//		int total=firstNum-secondNum;
//		System.out.println("total : "+total);
//	}
//	
//	else if(key==2) {
//		
//		System.out.println("Enter your firstNum : ");
//		int firstNum=sc.nextInt();
//		System.out.println("Enter your secondNum : ");
//		int secondNum=sc.nextInt();
//		int total=firstNum*secondNum;
//		System.out.println("total : "+total);
//	}
//	
//	else if(key==3) {
//		
//		System.out.println("Enter your firstNum : ");
//		int firstNum=sc.nextInt();
//		System.out.println("Enter your secondNum : ");
//		int secondNum=sc.nextInt();
//		int total=firstNum/secondNum;
//		System.out.println("total : "+total);
//	}
//	
//	else if(key==4) {
//		
//		System.out.println("Enter your firstNum : ");
//		int firstNum=sc.nextInt();
//		System.out.println("Enter your secondNum : ");
//		int secondNum=sc.nextInt();
//		int total=firstNum%secondNum;
//		System.out.println("total : "+total);
//	}
//	
//	
//	else {
//		System.out.println("enter your correct choice");
//	}
	
	boolean isTrue=true;
	while(isTrue) {

		System.out.println("Enter Your Choice");
		System.out.println("0 for add");
		System.out.println("1 for sub");
		System.out.println("2 for mul");
		System.out.println("3 for div");
		System.out.println("4 for module ");
		System.out.println("5 for exit");

		int key=sc.nextInt();
		
	switch ( key) {
	
	case 0: {
		
		System.out.print("Enter your firstNum : ");
	int firstNum=sc.nextInt();
		System.out.print("Enter your secondNum : ");
		int secondNum=sc.nextInt();
		int total=firstNum+secondNum;
		System.out.println("total : "+total);
		break;
	}
	case 1:{
		System.out.print("Enter your firstNum : ");
		int firstNum=sc.nextInt();
		System.out.print("Enter your secondNum : ");
		int secondNum=sc.nextInt();
		int total=firstNum-secondNum;
		System.out.println("total : "+total);
		break;
	}
	case 2:{
		System.out.print("Enter your firstNum : ");
		int firstNum=sc.nextInt();
		System.out.print("Enter your secondNum : ");
		int secondNum=sc.nextInt();
		int total=firstNum*secondNum;
		System.out.println("total : "+total);
		break;
	}
	case 3: {
		System.out.print("Enter your firstNum : ");
		int firstNum=sc.nextInt();
		System.out.print("Enter your secondNum : ");
		int secondNum=sc.nextInt();
		int total=firstNum/secondNum;
		System.out.println("total : "+total);
		break;
	}
	
	case 4: {
		System.out.print("Enter your firstNum : ");
		int firstNum=sc.nextInt();
		System.out.print("Enter your secondNum : ");
		int secondNum=sc.nextInt();
		int total=firstNum%secondNum;
		System.out.println("total : "+total);
		break;
	}
	case 5:{
		isTrue=false;
		System.out.println("Thank you for using this calculator");
		break;
	}
	
	default:
		System.out.println("enter correct choice");
	}
	}

}
}