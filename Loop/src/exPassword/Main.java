package exPassword;

import java.util.Scanner;

//Make a program that reads a username and password and does not accept the same password as the username, showing an error message and asking for the information again.
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean validInput = false;
		
		do {
			System.out.print("Type your username: ");
			String username = sc.next();
			
			System.out.print("Type your password: ");
			String password = sc.next();
			
			if(password.equalsIgnoreCase(username)) {
				System.out.println("Invalid password! Try again.");
			}
			else {
				validInput = true;
				System.out.println("Welcome, " + username);
			}
		} while (!validInput);		
	}
}
