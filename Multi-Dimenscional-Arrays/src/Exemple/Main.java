package Exemple;

public class Main {

	public static void main(String[] args) {
		
		double[][] noteEleves = new double[3][4];
		
		noteEleves[0][0] = 10;
		noteEleves[0][1] = 7;
		noteEleves[0][2] = 9;
		noteEleves[0][3] = 9.5;
		
		noteEleves[1][0] = 9;
		noteEleves[1][1] = 8;
		noteEleves[1][2] = 7;
		noteEleves[1][3] = 9;
		
		noteEleves[2][0] = 8;
		noteEleves[2][1] = 8;
		noteEleves[2][2] = 7;
		noteEleves[2][3] = 9;
	
		for(int i=0; i<noteEleves.length; i++) {
			//System.out.println(noteEleves[i] + " ");
			for(int j=0; j<noteEleves[i].length; j++) {
				System.out.print(noteEleves[i][j] + " - ");
			}
			System.out.println();
		}
		
		noteEleves[1][3] = 8;
		System.out.println();
		for(int i=0; i<noteEleves.length; i++) {
			for(int j=0; j<noteEleves[i].length; j++) {
				System.out.print(noteEleves[i][j] + " - ");
			}
			System.out.println();
		}	
		System.out.println();
		System.out.println("Calculer le moyenne de chaque eleve");
		
		double somme;
		for (int i=0; i<noteEleves.length; i++) {			
			somme = 0;
			for(int j=0; j<noteEleves[i].length; j++) {
				somme += noteEleves[i][j];
			}
			System.out.println("Moyenne du eleve " + i + " est = " + (somme/4));
		}
	}
}
