package projet_compte_bancaire;

public class CompteBancaire {
	//Attributs
	public int numCompte;
	protected String type;
	private String proprietaire;
	private float solde;
	private boolean status;	
	//Méthodes
	public void ouvrirCompte() {
		
	}
	public void fermerCompte() {
		
	}
	public void depot() {
		
	}
	public void retirerArgent() {
		
	}
	public void payerForfait() {
		
	}
	//Méthode spéciaux
	public CompteBancaire() {
		this.solde=0;
		this.status=false;
	}	
	public void setNumCompte(int num) {
		this.numCompte = num;
	}
	public int getNumCompte() {
		return this.numCompte;
	}	
	public void setType(String t) {
		this.type = t;
	}
	public String getType() {
		return this.type;
	}
	public void setProprietaire(String p) {
		this.proprietaire = p;
	}
	public String getProprietaire() {
		return this.proprietaire;
	}
	public void setSolde(float s) {
		this.solde = s;
	}
	public float getSolde() {
		return this.solde;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
	public boolean getStatus() {
		return this.status;
	}	
}
