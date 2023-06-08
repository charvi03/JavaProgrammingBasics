import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class time_in_GMT {
    public static void main(String[] args) {
        Date localTime = new Date();
        DateFormat GMT_format = new SimpleDateFormat("dd/MM/yyyy" + " " + " HH:mm:ss");
        GMT_format.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("\nThe local time is: " + localTime);
        System.out.println("The time in Gmt is: " + GMT_format.format(localTime));

    }
}

