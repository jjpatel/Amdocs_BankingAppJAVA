package bankpkg;
import java.util.*;

public class Bankworking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        Bank C[] = new Bank[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new Bank();  
            C[i].openAccount();  
        }  
        
        int choice;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            choice = sc.nextInt();  
                switch (choice) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].displayAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].searchAccount(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].searchAccount(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].searchAccount(ac_no);  
                            if (found) {  
                                C[i].withdraw();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("Thank you for using our Application");  
                        break;  
                }  
            }  
            while (choice != 5);  
        }  
		

	}

