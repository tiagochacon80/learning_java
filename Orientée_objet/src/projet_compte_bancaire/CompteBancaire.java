package projet_compte_bancaire;

public class CompteBancaire {
	//Attributs
	public int numCompte;
	protected String type;
	private String proprietaire;
	private float solde;
	private boolean status;	
	//M�thodes
	public void etatActuel() {
		System.out.println("----------------------------------");
		System.out.println("Compte: " + this.getNumCompte());
		System.out.println("Type: " + this.getType());
		System.out.println("Nom au complet: " + this.getProprietaire());
		System.out.println("Solde: " + this.getSolde());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void ouvrirCompte(String t) {
		this.setType(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSolde(50);
		}else if (t == "CP") {
			this.setSolde(150);
		}
		System.out.println("Le compte a �t� ouvert avec succ�s");
		
	}
	public void fermerCompte() {
		if (this.getSolde() > 0) {
			System.out.println("Le compte ne peut pas �tre fermer, car le solde n'est pas z�ro");
		}else if (this.getSolde() < 0) {
			System.out.println("Le compte ne peut pas �tre fermer, car il a une dette");
		}else {
			this.setStatus(false);
			System.out.println("Compte ferm�");
		}
	}
	public void depot(float valeur) {
		if (this.getStatus()){
			this.setSolde(this.getSolde() + valeur);
			System.out.println("Le d�p�t a �t� r�alis� avec succ�s " + this.getProprietaire());
		}else {
			System.out.println("Imposssible faire un d�p�t, le compte est ferm�");
		}
	}
	public void retirerArgent(float valeur) {
		if (this.getStatus()) {
			if (this.getSolde() >= valeur) {
				this.setSolde(this.getSolde() - valeur);
				System.out.println("Retrait effectu� sur le compte " + this.getProprietaire());
			}else {
				System.out.println("fonds insuffisants");
			}
		}else {
			System.out.println("Impossible de retirer d'argent d'un compte ferm�!");
		}
	}
	public void fraisMensuel() {
		int valeur = 0;
		if (this.getType() == "CC") {
			valeur = 12;
		}else if (this.getType() == "CP") {
			valeur = 20;
		}
		if (this.getStatus()) {
			this.setSolde(this.getSolde() - valeur);
			System.out.println("Frais mensuels pay�s");
		}else {
			System.out.println("Impossible de payer, car le compte est ferm�!");
		}
	}
	//M�thodes consultants et modificateurs
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
