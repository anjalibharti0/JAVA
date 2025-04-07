
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class throws {
    public static void main(String[] args) {
        try {
            printDate("invalid-date");
        } catch (ParseException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    static void printDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(dateStr); // ParseException is a checked exception
        System.out.println(date);
    }
}

