package exercicies;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		int[][] numAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		
		//Matriz que gera um numero aleatorio		
		for(int i=0; i<numAleatorios.length; i++) {
			for(int j=0; j<numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for(int i=0; i<numAleatorios.length; i++) {
			for (int j=0; j<numAleatorios[i].length; j++) {
				if (numAleatorios[i][j] > maior) {
					maior = numAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		//Impressao da matriz
		for(int i=0; i<numAleatorios.length; i++) {
			for(int j=0; j<numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);
	}
	

}
