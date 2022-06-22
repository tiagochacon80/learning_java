package exFatorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero para o fatorial: ");
		int fatorial = sc.nextInt();
		
		int multi = 1;
		System.out.print(fatorial + "! = ");
		for(int i = fatorial; i > 0; i--) {
			multi = multi * i;			
		}
		System.out.println(multi);
	}
}
