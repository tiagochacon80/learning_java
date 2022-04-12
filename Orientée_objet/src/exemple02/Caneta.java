package exemple02;

public class Caneta {
	//atributos
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	//metodo
	void status(){
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada: " + this.tampada);
	}
}



