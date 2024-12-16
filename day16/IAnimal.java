package day16;

public interface IAnimal {

	String livingBeing="Animal";
	
	
	
	
	static boolean isMammal(String animalName ) {
		return (animalName.equalsIgnoreCase("dog"))|| (animalName.equalsIgnoreCase("cat")) || (animalName.equalsIgnoreCase("human"));
	}
	
	default  void speak() {
		System.out.println("Animal is making a sound");
	}
	
	
	public void  move();
	
	
	
}
