package bankpkg;
import java.util.*;

public class Bank {

	String accNo;
	String name;
	float balance;
	
	Scanner s = new Scanner(System.in);
	
	void openAccount() {
		System.out.println("Enter Account No: ");
		accNo = s.nextLine();
		System.out.println("Enter Name: ");
		name = s.nextLine();
		System.out.println("Enter Balance (Minimum Rs.1000): ");
		balance = s.nextFloat();		
	}
	
	void displayAccount() {
		System.out.println("Account No : "+ accNo);
		System.out.println("Name : "+ name);
		System.out.println("Balance : "+ balance);		
	}
	
	void deposit() {
		float amount;
		System.out.println("Enter the amount to be deposited: ");
		amount = s.nextFloat();
		balance += amount;
	}
	
	void withdraw() {
		float amount;
		System.out.println("Enter the amount to be withdrawn: ");
		amount = s.nextFloat();
		if(amount > balance) {
			System.out.println("Insufficient Balance! "+ "Current Balance = "+ balance);			
		}
		else if((balance - amount) < 1000) {
			System.out.println("Minimum Balance Rs.1000 Required after the withdrawal : Transaction Failed!!");
		}
		else {
			balance -= amount;
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
