package exMembrosEstaticos;

public class Contador {
	
	//Variavel vale 0, quando nao é atribuido nenhum valor a ela
	private static int cont;
	
	public Contador() {
		cont++;
	}
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
}
