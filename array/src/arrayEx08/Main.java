package arrayEx08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vectA = new int[5];
		int[] vectB = new int[vectA.length];
		int[] vectC = new int[vectA.length];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valeur du vecteur A de la position " + (i+1));
			vectA[i] = sc.nextInt();
		}
		for(int i=0; i<vectB.length; i++) {
			System.out.println("Informez la valeur du vecteur B de la position " + (i+1));
			vectB[i] = sc.nextInt();			
		}
		for(int i=0; i<vectA.length; i++) {
			vectC[i] = vectA[i] - vectB[i];
		}
		
		System.out.println("Array A:");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Array B: ");
		for(int i=0; i<vectB.length; i++) {
			System.out.print(vectB[i] + " ");
		}
		System.out.println();
		System.out.println("Array C: ");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectC[i] + " ");
		}

	}

}
