import java.util.Scanner;
import java.util.Locale;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		int numero = sc.nextInt();
		
		int fatorial = 1;		
		for(int i = 1; i<=numero; i++) {
			fatorial = fatorial * i; 
			
		}
		System.out.println("Fatorial de " + numero + " = " + fatorial);
		
		sc.close();

	}

}
