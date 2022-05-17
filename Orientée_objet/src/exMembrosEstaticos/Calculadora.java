package exMembrosEstaticos;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	public static int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2); 
	}
	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		int total = 1;
		for (int i=num; i>1; i--) {
			total *= num;
		}
		return total;
	}
}
