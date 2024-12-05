package day10;

public class Car {

	String  make;
	int year;
	
	
	Car(){
		make="Unknown";
		year=1990;
	}
	
	Car(String make){
		this.make=make;
		year=2024;
	}
	
	Car(String make,int year){
		this.make=make;
		this.year=year;
	}
	
	
   void displayCarDetails(String make,int year) {
	   System.out.println(make);
	   System.out.println(year);
  }
   
   
	
	
			
	}
	

