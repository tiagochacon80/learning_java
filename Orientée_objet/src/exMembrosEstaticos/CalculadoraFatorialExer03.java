package exMembrosEstaticos;

import java.util.Scanner;

public class CalculadoraFatorialExer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("Informe o numero para saber o fatorial: ");
			num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("Numero invalido, entre novamente");
			}
			
		} while(num < 0);
		
		System.out.println(CalculadoraFatorial.fatorial(num));
	}

}
