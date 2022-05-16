package Exemple;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		int[][][] arrayTri = new int[3][3][3]; 
		
		for(int i=0; i<arrayTri.length; i++) {
			for(int j=0; j<arrayTri[i].length; j++) {
				for(int k=0; k<arrayTri[i][j].length; k++) {
					//System.out.println("i = " + i + " j = " + j + " k = " + k);
					arrayTri[i][j][k] = i + j + k;
				}
			}
		}
		
		int somme = 0;
		int sommePaires = 0;
		int sommeImpair = 0;
		for(int i=0; i<arrayTri.length; i++) {
			for(int j=0; j<arrayTri[i].length; j++) {
				for(int k=0; k<arrayTri[i][j].length; k++) {
					
					somme += arrayTri[i][j][k];
					
					if(arrayTri[i][j][k] % 2 == 0) {
						sommePaires += arrayTri[i][j][k];
					} else {
						sommeImpair += arrayTri[i][j][k];
					}
				}
			}
		}
		System.out.println("Somme total = " + somme);
		System.out.println("Somme paire = " + sommePaires);
		System.out.println("Somme impaire = " + sommeImpair);

	}

}
