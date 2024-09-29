import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaLocalTime {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        LocalTime startTime = LocalTime.now();
        LocalTime endTime = startTime.plusSeconds(1);
        while (true) {
            LocalTime current = LocalTime.now();
            int second = current.getSecond(); // Getting the seconds components
            if (second == endTime.getSecond()) {
                System.out.println("Over");
                break;
            } else {
                System.out.println("Loop is running");
            }
        }
        System.out.println(dateTime); 
        System.out.println(dateTime.minusDays(3));

    }
}
// The while loop will run for 1 second
