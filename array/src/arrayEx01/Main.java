//Programme qui stocke la température pendant un an

package arrayEx01;

public class Main {

	public static void main(String[] args) {

		double tempJour001 = 31.3;
		double tempJour002 = 32;
		double tempJour003 = 33.7;
		double tempJour004 = 34;
		double tempJour005 = 33.1;
		
		double[] temp = new double[365];
		temp[0] = 31.3;
		temp[1] = 32;
		temp[2] = 33.7;
		temp[3] = 34;
		temp[4] = 33.1;
		
		System.out.println("Temperature jour 01: " + temp[0]);
		
		System.out.println("Taille do array: " + temp.length);
		
		System.out.println("Les valuers du array: ");
		
		for (int i=0; i<temp.length; i++) {
			System.out.println("Temperature du jour " + (i+1) + " est " + temp[i]);
		}
		
		for (double temperature : temp) {
			System.out.println(temperature);
		}

	}

}
