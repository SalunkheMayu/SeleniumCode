package flex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) 
	{
		
		//Date
		Date d=new Date();
		SimpleDateFormat sample= new SimpleDateFormat("MM/dd/YYYY"); 
		System.out.println(sample.format(d));
		System.out.println(d.toString());
		 
		//Calender
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sample_C= new SimpleDateFormat("MM/dd/YYYY"); 
		System.out.println(sample_C.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
		
	}

}
