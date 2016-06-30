import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat t1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat t2 = new SimpleDateFormat("MM/dd/yyyy");

        System.out.println("Введите первую дату в формате ММ/DD/YYYY:");
        Date date1 = t1.parse(reader.readLine());
        System.out.println("Введите вторую дату в формате ММ/DD/YYYY:");
        Date date2 = t2.parse(reader.readLine());

        int year = 0;
        int totalMonth = 0;
        long ms = date2.getTime() - date1.getTime();
        long totalDay = ms / 1000 / 60 / 60 / 24;

        if (totalDay > 30) {
            totalMonth = (int) (totalDay / 30.4);
                if (totalMonth >= 12 ) {
                    year = totalMonth / 12;
                }
        }
        int day = (int) (totalDay - (totalMonth * 30.4));
        int month = (totalMonth - (year * 12));

        System.out.print("Разница между датами: ");
        System.out.print(year + " лет ");
        System.out.print(month + " месяцев ");
        System.out.println(day + " дней");
    }
}
