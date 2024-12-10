package day14;

 
class Animal{
	
	void makeSound() {
		System.out.println("this animal makes a sound");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("the dog barks");
	}
}

class Cat extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("the cat meows");
	}
}




public class Inheritance {
 public static void main(String[] args) {
	
	Dog dog=new Dog();
	
	dog.makeSound();
	
	
	
}
	
	
}
