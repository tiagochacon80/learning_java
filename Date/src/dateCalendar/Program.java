package dateCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date day = Date.from(Instant.parse("2022-05-17T11:27:40Z"));
		
		System.out.println(sdf.format(day));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(day);
		//Ajouter 4 heures au calendrier
		cal.add(Calendar.HOUR_OF_DAY, 4);		
		day = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
						
		System.out.println(day);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		

	}

}
