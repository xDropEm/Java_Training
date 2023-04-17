package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		/* Start of salary calculation */
		// Create a variable to define out career
		String career;
		System.out.println("=========== Start of program ===========");
		
		// define a variable career 
		career = "Software Developer";
		System.out.println("Hi i am a " + career);
		
		// declare & define variables to compute annual salary
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// compute annual salary
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " with annual rate of $" + rate + " is $" + salary);
		/* End of salary calculation */
	}

}
