import java.util.Scanner;
import java.util.Locale;

public class ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int numero = sc.nextInt();
		
		
		double div = 0;
		for (int i  = 0; i<numero; i++) {
			System.out.println("Entre com os valores de X e Y");
			double x = sc.nextDouble();
			double y =sc.nextDouble();
			
			if(y == 0) {
				System.out.println("Divisao impossivel");
			}
			else {
				div = x / y;
				System.out.println("Resultado: " + div);
			}					
		}		
		
		sc.close();
	}

}
