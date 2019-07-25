package ivan.samoylov;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String dateStr = new String("22.01.2019 19:15:00");
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        try {
            Date date = formatDate.parse(dateStr);
            dateStr = new SimpleDateFormat("d MMM', ' h:mm a", Locale.ENGLISH).format(date);
        }
        catch (Exception error){
            System.out.println(error);
        }

        System.out.println(dateStr);
    }

}
