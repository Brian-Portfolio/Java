package eg1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class DateTimeApiJava8 {

	
	public static void main(String[] args) {
		
		practiceDateTime();
	}
	
	public static void practiceDateTime() {
		
		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String formatedDateTime = date.format(dateformat);
		
		Month month = ldt.getMonth();
		
		int day = ldt.getDayOfMonth();
		
		int year = ldt.getYear();
		
		Date datestring = Calendar.getInstance().getTime();
		DateFormat newdateformatted = new SimpleDateFormat("yyyy-MM-dd");
		String strdate = newdateformatted.format(datestring);
		
		ZonedDateTime Zone = ZonedDateTime.now();
		
		ZoneId London = ZoneId.of("Europe/London");
		
		ZonedDateTime londonZone = Zone.withZoneSameInstant(London);
		
		
		System.out.println("Local current date : "+date);
		
		System.out.println("Local time : "+time);
		
		System.out.println("Formatted Date Time : "+formatedDateTime);
		
		System.out.println("month, day, year : "+month +" "+day+" "+year);
		
		System.out.println("Converted Date to String : "+strdate);
		
		System.out.println("Local Zone : "+Zone);
		
		System.out.println("londonZone : "+londonZone);
		
	}

}
