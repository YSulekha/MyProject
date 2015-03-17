import java.util.Date;
import java.util.Scanner;


public class DateDiff {
	
	public static void main(String args[]){
		DateDiff d = new DateDiff();
		String d1 = "1/2/2000";
		String d2 = "1/2/2006";
		System.out.println("Date diff:"+d.getDateDiff(d1,d2));
	}
	public int getLeapYear(int year){
		return(year/4 - year/100+year/400);
	}
	public int getDateDiff(String d1,String d2){
		int days1 = calculateDays(d1);
		int days2 = calculateDays(d2);
		return days2-days1;
	}
	public int calculateDays(String date){
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String [] s = date.split("/");
		int year = Integer.parseInt(s[2]);
		int month = Integer.parseInt(s[1]);
		int day = Integer.parseInt(s[0]);
		int days1 = 0;
		
		days1 = year*365+day;
		if(month > 2)
			days1+=getLeapYear(year);
		else
			days1+=getLeapYear(year-1);
		
		for(int i=1;i<month;i++){
			days1+=months[i];
		}
		return days1;
	}
	
}
