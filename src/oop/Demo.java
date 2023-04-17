package oop;

class Person {
	String name;
	String phoneNo;
	String email;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eating() {
		System.out.println(name + " is eating.");
	}
	
	void sleeping() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	
	public static void main(String[] args) {

		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@gmail.com";
		person1.phoneNo = "9845562131";
		
		// Abstraction to get only specific data or method that we want from a class
		person1.walk();
		
		Person person2 = new Person();
		
		person2.name = "Shelly";
		person2.email = "shelly@gmail.com";
		person2.phoneNo = "856475412";
		
		person2.eating();
		
		/*
		// Creating a person with attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@gmail.com";
		String phoneNo = "951378451";
		
		// Person activity and behavior
		//System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is sleeping.");
		
		// What if we want to do this for another person
		String name2 = "Rachel";
		String email2 = "rachel@gmail.com";
		String phoneNo2 = "9658478451";
		
		// Person activity and behavior
		//System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is sleeping.");
		
	}
	
	// Enhance by adding function to minimize code
	public static void walking(String name) {
		System.out.println(name + " is walking.");
	}
	// What about binding attributes and properties together?
	 */
		
	}
}
