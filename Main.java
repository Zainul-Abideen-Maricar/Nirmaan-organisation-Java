package day10;

public class Main {

	public static void main(String[] args) {
		Car car1=new Car();
		
		System.out.println(car1.make);
		System.out.println(car1.year);
		
		System.out.println("");
		
Car car2=new Car("mahindra");
		
		System.out.println(car2.make);
		System.out.println(car2.year);
		
		System.out.println("");
		
Car car3=new Car("tata",2003);
		
		System.out.println(car3.make);
		System.out.println(car3.year);
		System.out.println("");
		
		Car car4=new Car();
		car4.displayCarDetails("audi", 2043);
	}
	}

