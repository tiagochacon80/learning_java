package Exemple01;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
				this.aprovada = true;
				this.desafiado = l1;
				this.desafiante = l2;
			} else {
				this.aprovada = false;
				this.desafiado = null;
				this.desafiante = null;				
			}
		}	
	public void lutar() {
		
		if(this.aprovada) {
			System.out.println();
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			//Instanciando objeto do tipo random
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //0 1 2
			System.out.println("======== RESULTADO DA LUTA ============");
			switch(vencedor) {
				case 0 :
					System.out.println("Empatou");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("     O VENCEDOR É " + desafiado.getNome());
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 2:
					System.out.println("     O VENCEDOR É " + desafiante.getNome());
					desafiante.ganharLuta();
					desafiado.perderLuta();										
					break;
			}
			System.out.println("=======================================");
		} 
			else {
				System.out.println("Essa luta nao pode acontecer");
		}
		
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
}
