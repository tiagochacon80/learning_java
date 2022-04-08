import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int num1, int num2, int num3) {
		int aux;
		if (num1 > num2 && num2 > num3) {
			aux = num1;
		}
		else if (num2 > num3) {
			aux = num2;
		}
		else {
			aux = num3;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}	
}
