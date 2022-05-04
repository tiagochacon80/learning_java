import java.util.Scanner;
import java.util.Locale;

public class ex09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int numero = sc.nextInt();
		
		System.out.println("Os divisores de " + numero + " sao:");		
		for(int i = 1; i<=numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}			
		}		
		sc.close();

	}

}
