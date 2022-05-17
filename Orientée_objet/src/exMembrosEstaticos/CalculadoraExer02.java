package exMembrosEstaticos;

public class CalculadoraExer02 {

	public static void main(String[] args) {
		
		imprimir(Calculadora.somar(1, 2));
		imprimir(Calculadora.subtrair(3, 1));
		imprimir(Calculadora.multiplicar(2, 2));
		imprimir(Calculadora.dividir(10, 5));
		imprimir(Calculadora.potencia(2, 3));

	}
	
	public static void imprimir(double num) {
		System.out.println(num);
	}

}
