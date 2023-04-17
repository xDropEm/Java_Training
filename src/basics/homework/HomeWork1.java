package basics.homework;

public class HomeWork1 {

	public static void main(String[] args) {
		/* 1! = 1 * 1 = 1
		 * 2! = 2 * 1 = 2
		 * 3! = 3 * 2 * 1 = 6
		 * 4! = 4 * 3 * 2 * 1 = 24
		 * 5! = 5 * 4 * 3 * 2 * 1 = 120
		 * */
	// Write a function that takes a value N and returns the sum of 1 to n
		System.out.println("Sum: " + sum(4));

	// Write a function that computes factorial *hint: use recursion
		System.out.println("Factorial: " + fact(5));
	
	// Write a function that returns min, max and avg(sum divide by number of elements) of an array
		int[] arrayOfNumbers = {6, 36, 88, 2, 55};
		System.out.println("Min: " + min(arrayOfNumbers));
		System.out.println("Max: " + max(arrayOfNumbers));
		System.out.println("Average: " + avg(arrayOfNumbers));
	}
	
	public static int sum(int x) {
		int sum = 0;
		for(int i=0; i<=x; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int fact(int num) {
		if(num == 0) {
			return 1;
		}
		return fact(num-1) * num;
	}

	public static int min(int[] arr) {
		int element = arr[0];
		for(int n=0; n<arr.length; n++) {
			if(element > arr[n]) {
				element = arr[n];
			}
		}
		return element;
	}
	
	public static int max(int[] arr) {
		int element = arr[0];
		for(int n=0; n<arr.length; n++) {
			if(element < arr[n]) {
				element = arr[n];
			}
		}
		return element;
	}
	
	public static int avg(int[] arr) {
		int numberOfElements = arr.length;
		int sumOfElements = 0;
		
		for(int i=0; i<arr.length; i++) {
			sumOfElements = sumOfElements + arr[i];
		}
		return sumOfElements / numberOfElements;
	}
	
}
