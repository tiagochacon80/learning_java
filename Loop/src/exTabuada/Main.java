package exTabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tabuada do numero: ");
		int tabuada = sc.nextInt();		
		
		for (int i=1; i<=10; i++) {			
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
	}
}
