import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat t1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat t2 = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Введите первую дату в формате dd.mm.yyyy:");
        Date date1 = t1.parse(reader.readLine());
        System.out.println("Введите вторую дату в формате dd.mm.yyyy:");
        Date date2 = t2.parse(reader.readLine());

        long ms = date2.getTime() - date1.getTime();
        long totalDay = ms / 1000 / 60 / 60 / 24;

        System.out.print("Разница между датами: ");
        System.out.println(totalDay + " дней");
    }
}

