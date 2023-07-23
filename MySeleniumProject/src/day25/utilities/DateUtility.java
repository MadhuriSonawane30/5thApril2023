package day25.utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {

   /** 
    * Date Formats:
    *                yyyy-MM-dd,  dd/MM/yyyy,  dd-MM-yyyy,  E,   MMM dd yyyy
    *                dd-M-yyyy  hh:mm:ss 
    *                dd MMMM yyyy zzzz
    */
		
	public static  String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}	
		
	public static String getRequiredDateBasedOnNumberOfMonths(String format, int NumberOfMonths) {	
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MONTH, NumberOfMonths);
		SimpleDateFormat s= new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateBasedOnNumberOfYears(String format, int NumberOfYears) {	
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.YEAR, NumberOfYears);
		SimpleDateFormat s= new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static void main(String[] args) {
		
		//DATE FORMAT
	System.out.println(getRequiredDateBasedOnNumberOfDays("yyyy-MM-dd",5));//means aj se 5 days ke baad konsi date hogi the write +5=// 2023-07-25
		//you can use any format as mentioned in date formats
	System.out.println(getRequiredDateBasedOnNumberOfDays("yyyy-MMM-dd",5));
	System.out.println(getRequiredDateBasedOnNumberOfDays("yyyy-MMMM-dd",-25));// -25 means aaj che 25 days before what was the date
		
	//MONTHS FORMAT
		//if yahi date no of months ke basis pe chahiye then how to write
	System.out.println(getRequiredDateBasedOnNumberOfMonths("yyyy/MMMM/dd",-5));//means aaj se 5 months before kya date thi
		 
	//& If we want date & time both format
	System.out.println(getRequiredDateBasedOnNumberOfMonths("yyyy/MMMM/dd  hh:mm:ss",-5)); //aaj se 5 ,months before vali date hai
	
	System.out.println(getRequiredDateBasedOnNumberOfMonths("yyyy/MMM/dd  hh:mm:ss",5)); //aaj se 5 months after vali date hai
	
	//YEAR FORMAT
	System.out.println(getRequiredDateBasedOnNumberOfYears("yyyy/MMM/dd  hh:mm:ss",-1));//aaj se 1 year before kya date thi
	System.out.println(getRequiredDateBasedOnNumberOfYears("yyyy/MMM/dd  hh:mm:ss",3));//aaj se 2 years baad kya date hogi
	
	
	
	}
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

