//Cr�ez un vecteur A avec 15 �l�ments entiers. Construire un vecteur B du m�me type et de la m�me taille, o� chaque �l�ment du vecteur B doit �tre la racine carr�e de l'�l�ment respectif de A

package arrayEx05;


import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
			
		double[] vectA = new double[4];
		double[] vectB = new double[vectA.length];
			
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valeur de la position: " + i);
			vectA[i] = sc.nextInt();
				
			vectB[i] = Math.sqrt(vectA[i]);
		}
		System.out.print("Array A = ");
		for (int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
				
		System.out.print("Array B = ");
		for (int i=0; i<vectB.length; i++) {
			System.out.print(df.format(vectB[i]) + " ");
		}
	}
}
