package bankpkg;
import java.util.*;

public class Bankworking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        List<Bank> C = new ArrayList<Bank>();
        
        int choice;  
        do {
        	System.out.println("-----------------------------------------------------");
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2.Create new account \n 3. View Account Details \n 4. Deposit the amount \n 5. Withdraw the amount\n 6.Exit ");  
            System.out.println("\n Select your choice: ");
            System.out.println("-----------------------------------------------------");
            choice = sc.nextInt();  
                switch (choice) {
                	
                    case 1:
                    	if(C.size() == 0) {
                    		System.out.println("\nNo details found");
                    	}
                    	else {
                    		System.out.println("\n Acc No. Name \t\tAddress \tAcc Type \tBalance");
	                        for (int i = 0; i < C.size(); i++) {  
	                            C.get(i).displayAccount();  
	                        }
                    	}
                        break;  
                    
                    case 2:
                    	Bank b = new Bank();
                        b.openAccount();
                        C.add(b); 
                		break;
                    case 3:  
                        System.out.print("\nEnter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.size(); i++) {  
                            found = C.get(i).searchAccount(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("\nSearch failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("\nEnter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.size(); i++) {  
                            found = C.get(i).searchAccount(ac_no);  
                            if (found) {  
                                C.get(i).deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("\nSearch failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.print("\nEnter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.size(); i++) {  
                            found = C.get(i).searchAccount(ac_no);  
                            if (found) {  
                                C.get(i).withdraw();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("\nSearch failed! Account doesn't exist..!!");  
                        }  
                        break;  
                      
                    case 6:
                    	
                        System.out.println("\nThank you for using our Application");
                    	break;
                    
                }  
            }  
            while (choice != 6);  
        }  
		

	}
