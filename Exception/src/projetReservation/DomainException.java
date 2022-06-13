package projetReservation;

public class DomainException extends RuntimeException {	
	private static final long serialVersionUID = 1L;
	//Armazeando a messagem na exceçao personalizada que foi criada
	public DomainException(String msg) {
		super(msg);
	}
	
}
