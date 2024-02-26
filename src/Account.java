import java.util.Scanner;

public class Account {

	int balance;
	int prevTrancaction;
	String customerName;
	String customerID;
	
	
	Account (String cname, String cid){
		customerName = cname;
		customerID = cid;
	}
	
	void deposit(int amount) {
		if(amount != 0 && amount > 0) {
			balance = balance + amount;
			prevTrancaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTrancaction = - amount ;
		}
	}
	
	void getPrevTransaction() {
		if(prevTrancaction > 0) {
			System.out.println("deposited:" +prevTrancaction);
		} else if (prevTrancaction  < 0){
			System.out.println("withdrawn: " + Math.abs(prevTrancaction));
		} else {
			System.out.println("No transaction Occured");
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcom, " + customerName + "!");
		System.out.println("Your ID is " + customerID);
		System.out.println();
		System.out.println("What would you like to do? 😊 ");
		System.out.println();
		System.out.println("A. check Your Balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdraw");
		System.out.println("D. View Pery Transaction");
		System.out.println("E. Exit");
		
		
		do {
			System.out.println();
			System.out.println("Please Enter an option: ");
			char optione1 = scanner.next().charAt(0);
			option = Character.toUpperCase(optione1);
			System.out.println();
			
			switch(option) {
			case'A':
				System.out.println("==========");
				System.out.println("Balance = $" + balance);
				System.out.println("==========");
				break;
			case 'B':
				System.out.println("Enter an amount to deposii:");
				int amount = scanner.nextInt();
				deposit(amount);
				break;
			case 'C':
				System.out.println("Enter an amount to withdraw");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				break;
			case 'D':
				System.out.println("==========");
				getPrevTransaction();
			 	System.out.println("==========");
				break;
			case 'E':
				System.out.println("==========");
				break;
			default:
				System.out.println("Error: Invalid Option. Please Enter A,B,C,D,E");	
			}
		}while(option !='E');
		System.out.println("Thank yiu for using our ATM");
		scanner.close();
	}	
}
