package projetopessoas;

public class Professor extends Pessoa{
	private char especialidade;
	private double salario;
	
	public void receberAumento(float aum) {
		this.salario += aum;
	}

	public char getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(char especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
