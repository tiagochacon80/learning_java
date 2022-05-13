package arrayEx06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vectA = new int[10];		
		int[] vectB = new int[vectA.length];
		
		for(int i=0; i<vectA.length; i++) {
		System.out.println("Informez la valeur de la position: " + (i+1));
		vectA[i] = sc.nextInt();
		
		vectB[i] = vectA[i] * i;		
		}		
		
		System.out.println("Array A:");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}
		
		System.out.println();
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectB[i] + " ");
		}
	}
}
