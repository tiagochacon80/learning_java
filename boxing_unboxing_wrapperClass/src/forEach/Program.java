package forEach;

public class Program {

	public static void main(String[] args) {		
			
			
			String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
			
			//loop for
			for(int i=0; i<cars.length; i++) {
				System.out.println(cars[i]);
			}
			//loop for each
			System.out.println();	
			for(String i : cars) {
				System.out.println(i);				
			}				
			
			System.out.println();
			String[] vect = new String[] {"Alex", "Rafael", "Joshua"};
			//Loop for each
			for(String obj : vect) {
				System.out.println(obj);
			}				
	}
}
