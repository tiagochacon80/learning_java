import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
		
		int somme = 0;
		for (int i = 0; i<N; i++) {
			int x = sc.nextInt();
			somme += x;
		}
		
		System.out.println(somme);
		
		sc.close();
	}

}
