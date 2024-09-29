import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int date = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int hour = cal.get(Calendar.HOUR); 
        int minute = cal.get(Calendar.MINUTE);
        String amPm = cal.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM"; 
        
        System.out.println("Today is: " + date + "/" + month + "/" + year);
        System.out.println("Current time: " + hour + ":" + minute + " " + amPm);
    }
}
