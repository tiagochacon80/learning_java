package projetopessoas2;

public class TestePessoa {

	public static void main(String[] args) {
		
		//Visitante v1 = new Visitante();
		//v1.setNome("Tiago");
		//v1.setSexo("M");
		//v1.setIdade(41);		
		//System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Alexia");
		a1.setIdade(20);
		a1.setCurso("Informatica");
		a1.setMatricula(1212);
		a1.setSexo("F");
		a1.pagarMensalidade();	
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1313);
		b1.setNome("Jorge");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	
	}
}
