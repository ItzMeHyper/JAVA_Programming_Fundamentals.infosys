import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

class Demonstrator
{
    public static void main (String[] args) {
        System.out.println("*****LocalDate*****");
        LocalDate registrationDate = LocalDate.now();
        System.out.println("Today's date(System date): "+registrationDate);
        LocalDate lastDate = registrationDate.plusDays(3); 
        System.out.println("Adding 3 days: "+lastDate);
        if(LocalDate.now().isBefore(lastDate)) {               
            System.out.println("Please take the assessment as soon as possible");
        }
        System.out.println();
        System.out.println("*****LocalTime*****");
        LocalTime startTime = LocalTime.now();
        System.out.println("Start Time: "+startTime); 
        
        LocalTime endTime = startTime.plusHours(1); 
        System.out.println("End Time: "+endTime); 
        
        LocalTime current = LocalTime.now();
        int hour = current.getHour();  
        int minute = current.getMinute();
        int second = current.getSecond();
        System.out.println("Hour: "+hour+" Minute: "+minute+" Second: "+second); 
        
        System.out.println();
        System.out.println("*****LocalDateTime*****");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: "+dateTime);  
        System.out.println(dateTime.minusDays(3));      
       
    }
}