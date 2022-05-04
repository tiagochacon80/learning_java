import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um numero ?");
		int x = sc.nextInt();
		
		for(int i = x; i<=x; i--) {
			if(i % 2 == 1) {
				System.out.println(i);
			}			
		}
		sc.close();
	}
}
