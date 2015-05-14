//Simple program that takes an integer between 1 and 366, 
//and return the date in mm/dd format in 2004
//@author Young Nguyen
import java.io.*;

public class DateConverter {

	public static void main (String [ ] args) {
	  //read input from keyboard
	  BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
	  while (true) {
		  int dayOfYear = 0;
		  //throw an error if input is not in integer format
		  try {
			  dayOfYear = Integer.parseInt (keyboard.readLine ( ));
		  } catch (NumberFormatException e) {
			  e.printStackTrace();
		  } catch (IOException e) {
			  e.printStackTrace();
		  }
		  //initialize day and month
		  int month, dateInMonth, daysInMonth;
		  month = 1;
		  daysInMonth = 31;
		  //as long as dayOfYear is greater than the number of days in the current month,
		  //keep subtracting it. Once dayOfYear is less than daysInMonth, we know that
		  //we are at the correct month
		  while (dayOfYear > daysInMonth) {
		    	//subtract amount of days in the current month from the given day of year
		    	dayOfYear = dayOfYear - daysInMonth;
		    	//change the daysInMonth variable for the next month 
		    	//for the next iteration of while loop
				if (month+1==2) {
					  daysInMonth = 29;
		    	} else if (month+1==4 || month+1 == 6 || month+1 ==9 || month+1==11) {
		    		daysInMonth = 30;
		    	} else {daysInMonth = 31;}
				//if the month is less than 12, we can increment it by one
		    	if (month < 12) {
			    	month++;
		    	}
		  }
		  //once dayOfYear is less than daysInMonth, we have the correct month
		  //now assign dayOfYear to the actual date in the month
	      dateInMonth = dayOfYear;
	      System.out.println (month + "/" + dateInMonth + "\n");
	  }
  	}
}
