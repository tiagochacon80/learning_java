package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		//Posiçao nao existente no array
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		}
		//Valor invalido para o input
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");

	sc.close();
	
	}

}
