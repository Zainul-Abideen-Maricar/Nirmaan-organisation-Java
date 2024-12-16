package day16;

public class Dog implements IAnimal{

	@Override
	public void move() {
	
		System.out.println("the dog runs on four legs");
		
	}
	@Override
	public void speak() {
		System.out.println("the dog says: Woof Woof!");
	}
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
	System.out.println(IAnimal.isMammal("dog"));	
		
		dog.move();
		dog.speak();
	}

}
