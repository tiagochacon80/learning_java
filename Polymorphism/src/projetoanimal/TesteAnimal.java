package projetoanimal;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish(); 
		Arara e = new Arara();
		
		c.locomover();		
		k.locomover();
		k.emitirSom();
		e.emitirSom();

	}
}
