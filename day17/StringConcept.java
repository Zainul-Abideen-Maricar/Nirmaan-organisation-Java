package day17;

public class StringConcept implements IExample2 {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
	
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		StringConcept str=new StringConcept();
		
		System.out.println(str.add(10, 20));
		System.out.println(str.sub(10, 20));
		System.out.println(str.mul(50, 20));
		System.out.println(str.div(40, 20));
		
//		double a=345.45;
//		Double b=a;
//		System.out.println(b);
//		double c=b;
//		System.out.println(c);
	}
	}
	
	

