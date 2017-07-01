package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneInfo {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");

		String dateInString = "22-12-2015 10:15:55 AM";
		Date date = formatter.parse(dateInString);
		TimeZone tz = TimeZone.getDefault();

		// From TimeZone default
		System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
		System.out.println("TimeZone : " + tz);
		System.out.println("Date : " + formatter.format(date));

		// To TimeZone America/New_York
		SimpleDateFormat sdfAmerica = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
		TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
		sdfAmerica.setTimeZone(tzInAmerica);
		
		String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
		Date dateInAmerica = formatter.parse(sDateInAmerica);

		System.out.println("\nTimeZone : " + tzInAmerica.getID() + 
                                      " - " + tzInAmerica.getDisplayName());
		System.out.println("TimeZone : " + tzInAmerica);
		System.out.println("Date (String) : " + sDateInAmerica);
		System.out.println("Date (Object) : " + formatter.format(dateInAmerica)); 
	}

}
