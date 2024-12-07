package day12;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		
     
      Book book2=new Book();
      
      
      
      while(isTrue) {
    	  System.out.println();
    	  System.out.println("1 for add");
    	  System.out.println("2 for update");
    	  System.out.println("3 for view");
    	  System.out.println("0 for exit");
    	  System.out.println("Enter your choice: ");
    	  int value=sc.nextInt();
    	  sc.nextLine();
    	
    	  
    	  switch (value) {
    	  case 0:{
    		  isTrue=false;
    		  System.out.println("the program exit");
    		  break;
    	  }
    	 
    	  case 1:{
    		  
    		  System.out.println("Enter Book Name:");
    		  String title=sc.nextLine();
    		  book2.setTitle(title);
    		  System.out.println("Enter author Name:");
    		  book2.setAuthor(sc.nextLine());
    		  System.out.println("Enter Price:");   		  
    		  book2.setPrice(sc.nextDouble());
    		  System.out.println("Enter number of copies:");
    		  book2.setNumberOfCopies(sc.nextInt());
    		  break;
    	  }
    	  case 2:{
    		  System.out.println("Enter Book Name:");
    		  book2.setTitle(sc.nextLine());
    		  System.out.println("Enter author Name:");
    		  book2.setAuthor(sc.nextLine());
    		  System.out.println("Enter Price:");   		  
    		  book2.setPrice(sc.nextDouble());
    		  System.out.println("Enter number of copies:");
    		  book2.setNumberOfCopies(sc.nextInt());
    		  break;
    	  }
    	  case 3:{
    		  System.out.println(book2.toString());
    	  }
    	  default:{
    		  System.out.println("Enter correct Choice: ");
    		  continue;
    	  }
    	 
    	  
    	  }
      }
     
	}
	}

