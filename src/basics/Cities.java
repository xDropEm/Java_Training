package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"Mumbai", "Jaipur", "Patna", "Delhi"};
		System.out.println("First element of an array cities[] is " + cities[0]);
		
		// Declare an array
		String[] states = new String[5];
		states[0] = "Maharashta";
		states[1] = "Gujarat";
		states[2] = "Rajasthan";
		states[3] = "Uttar Pradesh";
		states[4] = "Texas";
		System.out.println("First element of a array states[] is " + states[0]);
		
		// Declare an array
		String[] countries;
		// Define an array
		countries = new String[3];
		countries[0] = "India";
		countries[1] = "USA";
		System.out.println("First element of an array countries[] is " + countries[0]);
		
		// Working with loops using an array
		System.out.println("======= Using Do-while loop ==============");
		// Do-while loop enters the loop then tests condition
		int i=0;
		do{
			System.out.println(states[i]);
			i++;
		} while(i < states.length);
		
		System.out.println("======= Using while loop ==============");
		// While loop tests condition first then enters loop
		int x=0;
		while(x < states.length) {
			if(states[x] == "Texas") {
				System.out.println("!!!!! STATE FOUND !!!!!!");
			}
			System.out.println(states[x]);
			x++;
		}
		
		System.out.println("========= Using for loop ==========");
		// For loop is the best structure for iterating through an array
		for(int n=0; n < states.length; n++) {
			System.out.println(states[n]);
		}
		
	}

}
