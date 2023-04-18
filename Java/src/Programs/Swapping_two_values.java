package Programs;

public class Swapping_two_values {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "world";
		
		System.out.println("Before swap "+a+ " and "+b);
		
		a = a+b;
		
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After swap "+a+ " and "+b);
		
	}

}
