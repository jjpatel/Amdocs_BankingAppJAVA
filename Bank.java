package bankpkg;
import java.util.*;

public class Bank {

	String accNo;
	String fname;
	String lname;
	String address;
	String accType;
	float balance;
	
	Scanner s = new Scanner(System.in);
	
	void openAccount() {
		System.out.println("\nEnter Account No: ");
		accNo = s.nextLine();
		System.out.println("Enter First Name: ");
		fname = s.nextLine();
		System.out.println("Enter Last Name: ");
		lname = s.nextLine();
		System.out.println("Enter Address: ");
		address = s.nextLine();
		System.out.println("Enter Account Type: ");
		accType = s.nextLine();
		System.out.println("Enter Balance (Minimum Rs.1000): ");
		balance = s.nextFloat();		
	}
	
	void displayAccount() {
		System.out.println("\nAccount No : "+ accNo);
		System.out.println("Name : "+ fname + " " + lname);
		System.out.println("Address : "+ address);
		System.out.println("Account Type : "+ accType);
		System.out.println("Balance : "+ balance);
	}
	
	void deposit() {
		float amount;
		System.out.println("\nEnter the amount to be deposited: ");
		amount = s.nextFloat();
		balance += amount;
		System.out.println("Transaction Type: Deposit, Amount = "+amount + ", Balance = "+ balance);
	}
	
	void withdraw() {
		float amount;
		System.out.println("\nEnter the amount to be withdrawn: ");
		amount = s.nextFloat();
		if(amount > balance) {
			System.out.println("Insufficient Balance! "+ "Current Balance = "+ balance);			
		}
		else if((balance - amount) < 1000) {
			System.out.println("Minimum Balance Rs.1000 Required after the withdrawal : Transaction Failed!!");
		}
		else {
			balance -= amount;
			System.out.println("Transaction Type: Withdraw"+ amount+", Balance = "+ balance);
		}
	}
	
	boolean searchAccount(String acc) {
		if(accNo.equals(acc)) {
			displayAccount();
			return true;
		}
		return false;
	}
	
}
