package Exemple;

import java.util.Scanner;

public class ArrayIrregulares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informez le nombre des personnes selectionnées: ");
		int nombreSelectionnees = sc.nextInt();
		
		String[][] nomFills = new String[nombreSelectionnees][];
		
		for(int i=0; i<nomFills.length; i++) {			
			
			System.out.println("Informez la quantité de fills: ");
			int qttFills = sc.nextInt();
			
			nomFills[i] = new String[qttFills];
			
			for(int j=0; i<nomFills[i].length; j++) {				
				System.out.println("Informez le nom du fills: " + (j+1));				
				nomFills[i][j] = sc.next();
			}
		}
		
		for(int i=0; i<nomFills.length; i++) {
			System.out.println("Le candidat " + i + " a " + nomFills[i].length + " fills");
			for(int j=0; j<nomFills[i].length; j++) {
				System.out.println(nomFills[i][j]);
			}
		}
		
	}

}
