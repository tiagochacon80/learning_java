package exNota;
//Make a program that asks for a note, between zero and ten. Show a message if the value is invalid and keep asking until the user enters a valid value.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 		
		
		int note = 0;
		
		do {
			System.out.print("Type a note between 0 and 10: ");
			note = sc.nextInt();			
		} while (note < 0 || note > 10);
		System.out.println("This note was: " + note);
	}
}
