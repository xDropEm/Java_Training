package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		// Start of program
		printName();
		
		/*Start of add numbers*/
		int numA = 30;
		int numB = 40;
		addNumbers(numA, numB);
		/*End of add numbers*/
		
		/*Start of multiply numbers*/
		int productResult = multiplyNumbers(numA, numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + productResult);
		/*End of multiply numbers*/
		
		// End of program
	}

	/*Create 3 functions printName, addNumbers, multiplyNumbers*/
	static void printName() {
		System.out.println("My name is DropEm!");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
	}
	
}
