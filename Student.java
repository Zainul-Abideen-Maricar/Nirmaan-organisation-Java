package day5;

public class Student {
	
	
	int rollNo=0;
	String name="";
	int age=0;
	int mark=0;
	public static void main(String[] args) {
		Student student1=new Student();
		
		student1.rollNo=1;
		student1.name="Zainul";
		student1.age=22;
		student1.mark=55;
		
		System.out.println(student1.rollNo);
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.mark);
		
		Student student2=new Student();
		
		student2.rollNo=2;
		student2.name="Ali";
		student2.age=21;
		student2.mark=42;
		
		System.out.println("");
		
		System.out.println(student2.rollNo);
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.mark);
		
	}
}
