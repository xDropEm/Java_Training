package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la1 = new LoanAccount(); 
		
		la1.increaseRate();
		la1.setTerm(5);
		la1.setAmmortSchedule();
		
		// polymorphism changes where we are pointing
		IRate la2 = new LoanAccount();
		la2.setRate();
	}

}
