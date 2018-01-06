//**************************************************
// MonthDateYear.java   Author: Nazmul Hasan
// Demonstrates how to use string.
//**************************************************

package STRING06;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonthDateYear {

	public static void main(String[] args) {


		String testDateString = "01/05/2018";
		String testDateString2 = "01-05-2018 04:30:00";
		String testDateString3 = "01 05, 2018";
		
		
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat df2 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		DateFormat df3 = new SimpleDateFormat("MM dd, yyyy");
		
		try
		{
			//format() method Formats a Date into a date/time string. 
			
			Date d1 = df.parse(testDateString);
			System.out.println("Date: " + d1);
			System.out.println("Date in MM/dd/yyyy format is: "+df.format(d1));

			Date d2 = df2.parse(testDateString2);
			System.out.println("Date: " + d2);
			System.out.println("Date in MM-dd-yyyy HH:mm:ss format is: "+df2.format(d2));
			
			Date d3 = df3.parse(testDateString3);
	           System.out.println("Date: " + d3);
	           System.out.println("Date in MM dd, yyyy format is: "+df3.format(d3));

			
		}
		catch (Exception ex ){
			System.out.println(ex);
		}
	}
}