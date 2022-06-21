package exMaiorMedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		int count = 0;		
		int soma = 0;
		do {
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			count += 1;	
			soma += numero;
		} while (count < 5);
		System.out.println("Maior: " + maior);
		System.out.println("Media: " + (soma/count));
	}
}
