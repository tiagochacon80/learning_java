package arrayEx10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vectA = new double[5];
		double[] vectB = new double[vectA.length];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valeur du vecteur A de la position " + (i+1));
			vectA[i] = sc.nextDouble();
		}
		for(int i=0; i<vectA.length; i++) {
			vectB[i] = vectA[i] % 2; 
		}
		
		System.out.println("Array A:");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}
		System.out.println();
		System.out.println("Array B:");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectB[i] + " ");
		}
	}

}
