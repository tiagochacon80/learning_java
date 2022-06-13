package projetReservation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer rooNumber, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = rooNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;		
	}

	public Integer getRooNumber() {
		return roomNumber;
	}

	public void setRooNumber(Integer rooNumber) {
		this.roomNumber = rooNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}	

	public Date getCheckOut() {
		return checkOut;
	}	
	
	public long duration() {
		//Diferença entre as duas datas em milisegundos
		long diff = checkOut.getTime() - checkIn.getTime();
		//Convertendo milisegundos em dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);		
	}
	//Esse método recebe duas datas e atualiza o checkIn e o checkOut
	public void updateDates(Date checkIn, Date checkOut) {		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in resevation: Resevation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;		
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}
