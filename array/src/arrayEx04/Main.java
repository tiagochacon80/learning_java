//Créez un vecteur A avec 15 éléments entiers. Construire un vecteur B du même type et de la même taille, où chaque élément du vecteur B doit être la racine carrée de l'élément respectif de A

package arrayEx04;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] vectA = new double[15];
		double[] vectB = new double[vectA.length];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valeur de la position: " + i);
			vectA[i] = sc.nextInt();
			
			vectB[i] = Math.sqrt(vectA[i]);
		}
		System.out.print("Array A = ");
		for (int i=0; i<vectA.length; i++) {
			System.out.println(vectA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Array B = ");
		for (int i=0; i<vectB.length; i++) {
			System.out.println(vectB[i] + " ");
		}
		
		
		
	}

}
