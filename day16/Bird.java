package day16;

public class Bird implements IAnimal{

	@Override
	public void move() {
		System.out.println("the bird flies in the sky");
		
	}
	
	@Override
	public void speak() {
		System.out.println("the bird says: Chirp Chirp!");
	}

	
	public static void main(String[] args) {
		Bird bird=new Bird();
		
	System.out.println(IAnimal.isMammal("bird"));
		
		bird.speak();
		
		bird.move();
		
	}
	

}
