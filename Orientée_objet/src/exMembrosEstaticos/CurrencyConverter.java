package exMembrosEstaticos;

public class CurrencyConverter {
	
	public static final double DOLAR = 3.10;
	//public static final double IOF = 1.06;
	
	
	public static double valorReal(double dolar) {
		return DOLAR * dolar * 1.06; 
	}	
	
	//public static double calculoIof(double real) {
		//return IOF * valorReal(real);
	//}
	
}
