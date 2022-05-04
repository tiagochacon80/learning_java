import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeira coordenadas");
			}else if (x < 0 && y > 0) {
				System.out.println("Segunda coordenadas");
			}else if (x < 0 && y < 0) {
				System.out.println("Terceira coordenadas");
			}else {
				System.out.println("Quarta coordenadas");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
