package ATM;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		OperationsInterface op = new OperationsImplemented();
		
		int atm_number = 12345;
		int atm_pin = 123;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("Enter ATM Number: ");
		int atm_Number = scan.nextInt();
		System.out.print("Enter ATM PIN: ");
		int atm_PIN = scan.nextInt();
		if((atm_number == atm_Number)&&(atm_pin == atm_PIN)) {
			//System.out.println("Validation Done");
			
			while(true) {
				
				System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.Mini Statement\n5.Exit");
				System.out.print("Enter Choice: ");
				
				int ch = scan.nextInt();
				
				if(ch==1) {
					op.viewBalance();
				}
				else if (ch==2) {
					System.out.print("Enter Amount for withdraw: ");
					double amount = scan.nextDouble();
					op.withdrawAmount(amount);
				}
				else if (ch==3) {
					System.out.print("Enter Amount to deposite: ");
					double depositeAmount = scan.nextDouble();
					op.depositeAmount(depositeAmount);
				}
				else if (ch==4) {
					op.viewMiniStatement();
				}
				else if (ch==5) {
					System.out.println("Thank you for using ATM ");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct Choice");
				}
			}
			
		}
		else {
			System.out.println("Incorrect ATM number / ATM PIN");
			System.exit(0);
		}
		
		
		scan.close();
		}
}
