package Exemple;

public class ContacteProgram {

	public static void main(String[] args) {
		
		Contacte contacte = new Contacte();
		contacte.setNom("Tyrion");
		contacte.setAdresse("Kings Landing");
		contacte.setTelephone("11 99999-9999");
		
		System.out.println(contacte.getNom());
		System.out.println(contacte.getAdresse());
		System.out.println(contacte.getTelephone());

	}

}
