import java.util.Scanner;
//Somar os numeros impares entre X e Y

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de X:");
		int X = sc.nextInt();
		System.out.println("Entre com o valor de Y:");
		int Y = sc.nextInt();
		
		int min, max;
		if(X < Y) {
			min = X;
			max = Y;
		}
		else {
			min = Y;
			max = X;
		}		
		
		int soma = 0;
		for(int i = min+1; i<max; i++) {
			if(i % 2 != 0) {
				soma += i; 
			}
			System.out.println(soma);
		}
		
		System.out.println("A soma dos numeros impares é: " + soma);
		
		sc.close();
	}

}
