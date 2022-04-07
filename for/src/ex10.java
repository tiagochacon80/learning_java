import java.util.Scanner;
import java.util.Locale;


public class ex10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int cubo = 0;
		int quadrado = 0;
		for(int i = 1; i<=numero; i++) {
			quadrado = i * i;			
			cubo = quadrado * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();

	}
}
