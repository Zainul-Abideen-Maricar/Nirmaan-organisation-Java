package day14;

  class Animal{
	  
	  void sound() {
		  System.out.println("Animal sound");
	  }
	  
	  void eat() {
		  System.out.println("Animal can eat");
	  }
  }

  class Lion extends Animal{
	  @Override
	  void sound() {
		  System.out.println("Lion roars");
	  }
  }

class Cat extends Animal{
     @Override	
	void eat() {
		System.out.println("Cat eats fish");
	}
}

public class Inheritance {
 public static void main(String[] args) {
	
	 Lion lion=new Lion();
	 
	lion.sound();
	 
	Cat cat =new Cat();
	
	cat.eat();
	cat.sound();
	
}
	
	
}
