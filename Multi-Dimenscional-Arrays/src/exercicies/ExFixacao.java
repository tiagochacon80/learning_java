package exercicies;

import java.util.Scanner;

public class ExFixacao {

	public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
		
		System.out.print("Informez la quantité de lignes du array: ");
		int positionX = sc.nextInt();
		System.out.print("Informez la quantité des colonnes du array: ");
		int positionY = sc.nextInt();		
		int[][] arrayMulti = new int[positionX][positionY];
		
		
		for(int i=0; i<arrayMulti.length; i++) {
			for(int j=0; j<arrayMulti[i].length; j++) {
				arrayMulti[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Choisissez un nombre qui est à l'interieur de la matrice: ");
		int numInterieur = sc.nextInt();
		
		for(int i=0; i<arrayMulti.length; i++) {
			for(int j=0; j<arrayMulti[i].length; j++) {
				if(arrayMulti[i][j] == numInterieur) {
					System.out.println("Position: " + i + "," + j);
					if(j > 0) {
						System.out.println("Left: " + arrayMulti[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + arrayMulti[i-1][j]);
					}
					if(j < 0) {
						System.out.println("Right: " + arrayMulti[i][j+1]);
					}
					if(i < 0) {
						System.out.println("Down: " + arrayMulti[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();		

	}

}
