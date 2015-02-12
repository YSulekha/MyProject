import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateComparision {
	static Date startDate;
	public static void main(String [] args){
		Date dnow = new Date();
		Date date;
		//String source = "2015-02-24T13:26:56,33";
		String source = "2014-11-18 12:17:29:325";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//	sd.setLenient(false);
		System.out.println(startDate);
		try {
			 
			//if not valid, it will throw ParseException
			date = sd.parse(source);
			System.out.println(date);
			
			if(sd.format(date).equals(source))
				System.out.println("Valid date");
			else
				System.out.println("Invalid date");
 
		} catch (ParseException e) {
			System.out.println("Invalidsss date");
			//System.out.println(date);
			
		}
		//Date dnow2 = sd.parse(source);
		Date dnow3 = new Date();
		System.out.println("Current date"+dnow);
	//	System.out.println(dnow2);
		System.out.println(dnow3);
	//	System.out.println(dnow2.compareTo(dnow3));
		Calendar cal = Calendar.getInstance();
		try {
		    //cal.setTime();
		    System.out.println("done");
		}
		catch (Exception e) {
		  System.out.println("Invalid date");
		}
	}
}
