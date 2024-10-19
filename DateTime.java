import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime{
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Define a formatter to format the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the date and time
        String formattedDateTime = now.format(formatter);

        // Print the current date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
