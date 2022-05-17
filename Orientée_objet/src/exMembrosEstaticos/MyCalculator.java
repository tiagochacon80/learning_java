package exMembrosEstaticos;

public class MyCalculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int add(int[] arrayInteger) {
		int total = 0;
		
		for(int i=0; i<arrayInteger.length; i++) {
			total += arrayInteger[i];
		}
		
		return total;
	}

}
