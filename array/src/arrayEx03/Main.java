//Cr�ez un vecteur A avec 8 �l�ments. Construire un vecteur B de m�me type et de m�me taille et avec les �l�ments du vecteur A multipli�s par 2

package arrayEx03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vectA = new int[8];
		int[] vectB = new int[vectA.length];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valeur de la position: " + i);
			vectA[i] = sc.nextInt();
			
			vectB[i] = vectA[i] * 2;
		}
		
		System.out.println("Array A = ");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Array B = ");
		for (int i = 0; i < vectB.length; i++) {
			System.out.print(vectB[i] + " ");
		}		
	}
}
