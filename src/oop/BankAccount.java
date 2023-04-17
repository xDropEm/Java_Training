package oop;

public class BankAccount implements IRate{

		// Define variables
		String accountNo;
		// static >> it belongs to a specific class, not the object instance
		private static final String routingNo = "6785"; // final keyword specifies it as constant.
		// instance variables
		private String name;
		private String SSN;
		String accountType;
		double balance;
		
		// use getters-setters 
		// allow user to define the name
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		
		public String getSSN() {
			return SSN;
		}
		public void setSSN(String sSN) {
			SSN = sSN;
		}
		// Constructor definition: unique methods
		/* 1. They are used to define / setup / initialize properties of an object
		 * 2. Constructors are IMPLICITLY called upon INSTANTIATION
		 * 3. Same name as the class itself
		 * 4. Constructors have NO return type
		 */
		BankAccount() {
			System.out.println("NEW ACCOUNT CREATED!");
		}
		// Overloading - call same method name with different arguments
		BankAccount(String accountNo) {
			System.out.println("New account created with account number: " + accountNo);
		}
		
		BankAccount(String accountNo, int initDeposit) {
			// initDeposit, msg, accounttype are local variables
			System.out.println("New account created with account number " + accountNo + " and deposit of Rs. " + initDeposit + "/-");
			
			String msg = null;
			if(initDeposit > 5000) {
				msg = "Error : initiale deposit is greater than Rs. 5000";
			} else {
				msg = "Thanks for your initiale deposit of Rs. " + initDeposit;
			}
			System.out.println(msg);
			balance = initDeposit;
		}
		
		// Define methods
		public void deposit(double amount) {
			balance = balance + amount;
			showActivity("deposit", balance);
		};
		
		void withdraw(double amount) {
			balance = balance + amount;
			showActivity("withdraw", balance);
		};
		
		// private can only be called from within the class
		private void showActivity(String activity, double amount) {
			System.out.println("Showing recent activity...");
			if(activity.equals("deposit"))
				System.out.println("Account is being deposited with amount + " + amount);
			else
				System.out.println("Account is being withdraw with amount + " + amount);
		}
		
		void checkBalance() {
			
		};
		
		void getStatus() {
			
		};
		
		public String toString() {
			return "Name: " + name + " . " + "accountType: " + accountType + " . " + "routingNumber: " + routingNo + " . " + "balance:" + balance + ".";
		}
		
		@Override
		public void setRate() {
			System.out.println("setting rate...");
		}
		
		@Override
		public void increaseRate() {
			System.out.println("increase rate...");
		}

}
