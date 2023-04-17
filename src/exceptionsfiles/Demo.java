package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts...");
		int a = 5;
		int b = 0;
		
		doMath(a, b);
		System.out.println("Program ends...");
	}

	public static void doMath(int a, int b) {
		answer(a, b);
	}
	
	private static double answer(int x, int y) {
		// Catch error here
		return x/y;
	}
	
}
