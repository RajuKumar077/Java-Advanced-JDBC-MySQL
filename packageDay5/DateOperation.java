package packageDay5;

//Importing java.util.Date for the current date and time
import java.util.Date; 
import java.util.Calendar;


public class DateOperation {
    public static void main(String[] args) {
    	
        Date date = new Date(); 
        System.out.println("Today's Date: " + date);
        
     // Adding Days to the Current Date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 5); // Add 5 days
        System.out.println("Date after 5 days: " + calendar.getTime());
    }
}
