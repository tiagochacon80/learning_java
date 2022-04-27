package projet_compte_bancaire;

public class Main {

	public static void main(String[] args) {
		CompteBancaire client1 = new CompteBancaire();
		client1.setNumCompte(1668);
		client1.setProprietaire("Tiago Celani Chacon");
		client1.ouvrirCompte("CC");
		
		CompteBancaire client2 = new CompteBancaire();
		client2.setNumCompte(1774);
		client2.setProprietaire("Andreza Borba");
		client2.ouvrirCompte("CP");
		
		client1.depot(100);
		client2.depot(500);
		client2.retirerArgent(1000);
		
		client1.retirerArgent(150);
		client1.fermerCompte();
		
		client1.etatActuel();
		client2.etatActuel();
	}

}
