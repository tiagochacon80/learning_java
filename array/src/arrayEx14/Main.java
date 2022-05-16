package arrayEx14;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vectA = new int[5];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Informez la valeur du vecteur A de la position " + (i+1));
			vectA[i] = sc.nextInt();
		}
		double somme = 0;
		double impair = 0;
		for(int i=0; i<vectA.length; i++) {
			if(vectA[i] % 2 != 0) {
				somme += vectA[i];
				impair++;
			}
		}				
		System.out.println("Array A: ");
		for(int i=0; i<vectA.length; i++) {
			System.out.print(vectA[i] + " ");
		}		
		System.out.println();
		System.out.print("Somme = " + somme);
		System.out.println();
		System.out.printf("Moyenne = %.2f%n", somme / impair);
				
		sc.close();
	}
}
