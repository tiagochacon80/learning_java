package exercicies;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arrayMulti = new int[3][3];
		
		for(int i=0; i<arrayMulti.length; i++) {
			for(int j=0; j<arrayMulti[i].length; j++) {
			
				System.out.println("Informez la valeur de la position [" + i + "," + j + "]");
				arrayMulti[i][j] = sc.nextInt();
			}
		}
		int qttPaires = 0;
		int qttImpaire = 0;
		for(int i=0; i<arrayMulti.length; i++) {
			for(int j=0; j<arrayMulti[i].length; j++) {
				if(arrayMulti[i][j] % 2 == 0) {
					qttPaires += 1;
				}
				else {
					qttImpaire += 1;
				}
			}
		}
		
		for(int i=0; i<arrayMulti.length; i++) {
			for(int j=0; j<arrayMulti[i].length; j++) {
				System.out.print(arrayMulti[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("La somme des pairs est = " + qttPaires);
		System.out.println("La somme des impairs est = " + qttImpaire);

	}

}
