package exMembrosEstaticos;

public class TestCalculator {

	public static void main(String[] args) {
		
		//MyCalculator calc = new MyCalculator();
		
		//calc.add(1, 2);
		
		//Classe utilitaria
		MyCalculator.add(1, 2);	
		
		add2Values(1, 2);
		
	}
	
	static int add2Values(int num1, int num2) {
		return MyCalculator.add(num1 , num2);
	}
}
