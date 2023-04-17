package basics;

public class Days {

	public static void main(String[] args) {
		// Execute different block of code based on the value of a condition
		/*Start of program*/
		String dayOfWeek = "Tuesday";
		
		System.out.println("============= Program starts =============");
		switch(dayOfWeek) {
			case "Tuesday" :
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday" :
				System.out.println("Today is Wednesday");
				break;
			case "Thursday" :
				System.out.println("Today is Thursday");
				break;
			case "Friday" :
				System.out.println("Today is Friday");
				break;
			case "Saturday" :
				System.out.println("Today is Saturday");
				break;
			case "Sunday" :
				System.out.println("Today is Sunday");
				break;
		}

		System.out.println("========== Program ends ==================");
	}

}
