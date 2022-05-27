package projetosobrecarga;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro(); 
		
		c.reagir("Ola");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
	}

}
