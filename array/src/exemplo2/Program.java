package exemplo2;

import java.beans.VetoableChangeSupport;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//Criando um vetor de "n" produtos
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			//Instanciando um novo produto com os dados "name" e "price" e fazer com que a posi�ao i aponte(guarde) para o novo produto
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			//Acessando o array na posi�ao i e acessando somente o pre�o do produto
			sum += vect[i].getPrice();
		}
		
		double avg  = sum / vect.length;
		
		System.out.printf("Average price = %.2f%n", avg);
		
	}

}
