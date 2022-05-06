package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CompteBancaire;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CompteBancaire conta; 
		
		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Voce deseja fazer um deposito inicial: (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new CompteBancaire(numero, nome, depositoInicial);
		}else {
			conta = new CompteBancaire(numero, nome);
		}
		System.out.println();
		System.out.println("Conta criada:");
		System.out.println(conta);	
		
		System.out.println();
		System.out.print("Deseja fazer um deposito: (s/n)?");
		char respostaDeposito = sc.next().charAt(0);
		if (respostaDeposito == 's') {
			System.out.print("Digite o valor do deposito: ");
			double segundoDeposito = sc.nextDouble(); 
			conta.deposito(segundoDeposito);
		}		
		System.out.println("Deposito confimado, valor atual: ");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.print("Deseja fazer um saque: (s/n)?");
		char respostaSaque = sc.next().charAt(0);
		if (respostaSaque == 's') {
			System.out.print("Digite o valor do saque: ");
			double valorSaque = sc.nextDouble();
			conta.saques(valorSaque);
		}
		System.out.println("Saque realizado com sucesso: ");			
		System.out.println(conta);		
		
		sc.close();
	}
}
