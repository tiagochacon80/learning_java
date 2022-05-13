//Créez un vecteur A avec 15 éléments entiers. Construire un vecteur B du même type et de la même taille, où chaque élément du vecteur B doit être le carré de l'élément respectif de A

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
