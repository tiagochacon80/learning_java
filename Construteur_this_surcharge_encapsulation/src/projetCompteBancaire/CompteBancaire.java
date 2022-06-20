package projetCompteBancaire;

public class CompteBancaire {

	public String nom;
	public String nas;
	private Double solde;
	
	public CompteBancaire() {	
		solde = 0.0;
	}

	public CompteBancaire(String nom, String nas) {
		this();
		this.nom = nom;
		this.nas = nas;		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNas() {
		return nas;
	}

	public void setNas(String nas) {
		this.nas = nas;
	}

	public Double getSolde() {
		return solde;
	}	
	
}
