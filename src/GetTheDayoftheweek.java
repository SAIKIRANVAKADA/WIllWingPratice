import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.format.DateTimeParseException;



public class GetTheDayoftheweek {
	static String  getDayofWeek(String date , String dateFormatter) {
		Date myDate=null;
		String dayOfWeek = null;
		boolean dateEqual= false;	
		
		try {
			
			 SimpleDateFormat formater =new SimpleDateFormat(dateFormatter);//String to Date conversion
			 myDate= formater.parse(date);
			
			 dateEqual=date.equals(formater.format(myDate));
			 if(dateEqual) {
			  Calendar cal = Calendar.getInstance();  
			  
				cal.setTime(myDate);
				
				SimpleDateFormat newDate = new SimpleDateFormat("EEEE",Locale.ENGLISH);
				dayOfWeek=newDate.format(myDate).toUpperCase();
				}
				else {
					return "please enter the correct date";
				}
			  
			  
		} catch (ParseException e) {
			
			e.printStackTrace();
		
		}
		
		
		return dayOfWeek;
		 
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDayofWeek("2024-01-31","yyyy-MM-dd"));
	
	
	}

}
