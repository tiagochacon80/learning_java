import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int n = sc.nextInt();
		
		int multi = 0;
		for(int i = 1; i<= 10; i++) {
			multi = i * n;
			System.out.println(i + " x " + n + " = " + multi);
		}
		
		sc.close();
		
	}

}
