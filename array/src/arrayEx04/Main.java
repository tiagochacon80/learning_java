//Cr�ez un vecteur A avec 15 �l�ments entiers. Construire un vecteur B du m�me type et de la m�me taille, o� chaque �l�ment du vecteur B doit �tre le carr� de l'�l�ment respectif de A

package arrayEx04;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int[] vectA = new int[15];
		int[] vectB = new int[vectA.length];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valuer de la position " + (i+1));
			vectA[i] = sc.nextInt();
			
			vectB[i] = vectA[i] * vectA[i];			
		}
		
		System.out.println("Array A:");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Array B:");
		for(int i=0; i<vectB.length; i++) {
			System.out.print(vectB[i] + " ");
		}
	}

}
