package basics;

public class Strings {

	public static void main(String[] args) {

		String bookTitle = "The Lord of the Rings";
		String searchWord = "Rings";
		
		if(bookTitle.contains(searchWord)) {
			System.out.println("Book Title contains the word " + searchWord + ".");
		}
		
		String browser = "Chrome";
		if(browser.equals("Chrome")) {
			System.out.println("The browser name is " + browser + ".");
		}
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser name is chrome.");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "95146541";
		
		System.out.print(firstName.substring(0, 2));
		System.out.print(lastName.substring(0, 2));
		System.out.println(SSN.substring(4));
		
	}

}
