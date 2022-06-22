package exParImpar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeroPar = 0, numeroImpar = 0;
		
		System.out.print("Quantidade de numeros: ");
		int quantNumeros = sc.nextInt();		
		
		int count = 0;
		do {
			System.out.println();
			System.out.println("Numero: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
				numeroPar++;
			}
			else {
				numeroImpar++;
			}
			count ++;
		} while (count < quantNumeros); 
		System.out.println("Quantidade par: " + numeroPar);
		System.out.println("Quantidade impar: " + numeroImpar);
	}
}
