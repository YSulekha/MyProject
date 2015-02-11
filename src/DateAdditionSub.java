import java.util.Date;


public class DateAdditionSub {
	static final long ONE_MINUTE_IN_MILLIS=60000;
	public static void main(String args[]){
		//millisecs
		Date date = new Date();
		long t= date.getTime();
		Date afterAddingTenMins=new Date(t - (10 * ONE_MINUTE_IN_MILLIS));
		System.out.println("Current date and time"+date);
		System.out.println("After 10 mins"+afterAddingTenMins);
	}
}
