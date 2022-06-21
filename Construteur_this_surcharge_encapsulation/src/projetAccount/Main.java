package projetAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine(); 
		System.out.print("Is there an initial deposit value (y/n): ");
		char initialValue = sc.next().charAt(0);
		if (initialValue == 'y') {
			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);	
		
		System.out.println();
		System.out.print("Deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		sc.close();
	}

}
