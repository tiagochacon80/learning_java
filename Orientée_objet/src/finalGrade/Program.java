package finalGrade;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Stundent stundent = new Stundent();
		
		System.out.print("Name: ");
		stundent.name = sc.nextLine();
		System.out.print("Grade 1: ");
		stundent.nota1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		stundent.nota2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		stundent.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE: %.2f%n", stundent.finalGrade());
		
		if(stundent.finalGrade() > 60.0) {
			System.out.println("PASS");
		} 
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", stundent.missingPoints());
		}
		
		sc.close();		
		
	}
}
