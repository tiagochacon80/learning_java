import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int somme = 0;
		while(x != 0) {
			somme += x; 
			x = sc.nextInt();
		}
		
		System.out.println("La somme est " + somme);
		
		sc.close();
		
	}

}
