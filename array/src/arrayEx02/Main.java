//Cr�er un vecteur A avec 5 entiers. Construire un vecteur B de m�me type et avec les m�mes �l�ments que le vecteur A

package arrayEx02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrayA = new int[5];
		int[] arrayB = new int[5];
		
		for(int i=0; i<arrayA.length; i++) {
			
			System.out.println("Informez la valeur de la position: " + i);
			arrayA[i] = sc.nextInt();
			
			arrayB[i] = arrayA[i];
		}
		
		/*for(int i=0; i<arrayA.length; i++) {
			arrayB[i] = arrayA[i] 
		}*/
		
		System.out.println("Array A = ");
		for(int i=0; i<arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Array B = ");
		for(int i=0; i<arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
	}

}
