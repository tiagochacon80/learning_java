import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de numeros:");
		int quantidade = sc.nextInt();
		
		int in = 0;
		int out = 0;
		System.out.println("Entre com os numeros:");
		for (int i = 0; i<quantidade; i++) {
			int numeros = sc.nextInt();
			if (numeros >= 10 && numeros <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
		
	}

}
