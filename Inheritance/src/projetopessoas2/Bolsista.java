package projetopessoas2;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	//overide
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsita, pagamento facilitado");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}	
}
