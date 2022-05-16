package exercicies;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		int[][] numAletorios = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for(int i=0; i<numAletorios.length; i++) {
			for(int j=0; j<numAletorios[i].length; j++) {
				numAletorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		for(int i=0; i<numAletorios.length; i++) {
			for(int j=0; j<numAletorios[i].length; j++) {
				System.out.print(numAletorios[i][j] + " -- ");
			}
			System.out.println();
		}		
		
		int maiorL5 = 0;
		int menorL5 = 101;
		int linha5 = 5;
		for(int i=0; i<numAletorios[linha5].length; i++) {
			if(numAletorios[linha5][i] > maiorL5) {
				maiorL5 = numAletorios[linha5][i];
			}
			if(numAletorios[linha5][i] < menorL5) {
				menorL5 = numAletorios[linha5][i];
			}			
		}
		System.out.println();
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5 );
		
		int maiorC7 = 0;
		int menorC7 = 101;
		int col7 = 7;
		for(int i=0; i<numAletorios.length; i++) {
			if(numAletorios[i][col7] > maiorC7) {
				maiorC7 = numAletorios[i][col7];
			}
			if(numAletorios[i][col7] < menorC7) {
				menorC7 = numAletorios[i][col7];
			}			
		}
		System.out.println();
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("Menor valor da coluna 7 = " + menorC7);
	}
}
