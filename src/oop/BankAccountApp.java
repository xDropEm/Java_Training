package oop;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
//		acc1.routingNo = "4567";
//		acc1.name = "MJ hoe";
		// with encapsulation : public API methods
		acc1.setName("MJ hoe");
		System.out.println(acc1.getName());
		acc1.setSSN("U_79875");
		System.out.println("SSN: " + acc1.getSSN());
		
		// polymorphism through overloading
		BankAccount acc2 = new BankAccount("ab1234");
//		acc2.routingNo = "95217";
		
		BankAccount acc3 = new BankAccount("84654312", 7000);
//		acc3.routingNo = "876234";
		
//		System.out.println(acc2.routingNo);
		
		System.out.println(acc3.balance);
		
		// Demo for inheritance
		CDAccount cdAccount = new CDAccount();
		//cdAccount.name = "Julian";
		cdAccount.setName("Julian");
		cdAccount.accountType = "cd account";
		cdAccount.balance = 5000;
		
		// polymorohism through overriding
		System.out.println(cdAccount.toString()); // overriding a method
		acc1.deposit(5000);
		acc2.withdraw(2000);
		
		// interface
		acc1.setRate();
		acc1.increaseRate();
		
	}

}
