package entities;

public class CompteBancaire {
	
	private int numConta;
	private String titular;
	private double saldo;	
	
	public CompteBancaire(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(depositoInicial);//Duvida
	}
	
	public CompteBancaire(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}	
	public int getNumConta() {
		return numConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}	
	
	public void deposito(double valor) {
		saldo += valor;
	}	
	public void saques(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ numConta
				+ ", titular: "
				+ titular 
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}
}
