package exNota;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota: ");
		int nota = sc.nextInt();

		while(nota < 0 || nota > 10) {
			System.out.print("Nota invalida, digite novamente: ");
			nota = sc.nextInt();
		}
	}
}
