import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую дату в формате dd.mm.yyyy");
        String dat1 = reader.readLine();
        String[] idat1 = dat1.split("\\.");
        int num1 = Integer.parseInt(idat1[0]);
        int month1 = Integer.parseInt(idat1[1]);
        int year1 = Integer.parseInt(idat1[2]);

        System.out.println("Введите вторую дату в формате dd.mm.yyyy");
        String dat2 = reader.readLine();
        String[] idat2 = dat2.split("\\.");
        int num2 = Integer.parseInt(idat2[0]);
        int month2 = Integer.parseInt(idat2[1]);
        int year2 = Integer.parseInt(idat2[2]);

        LocalDate date1 = LocalDate.of(year1, month1, num1);
        LocalDate date2 = LocalDate.of(year2, month2, num2);

        Period p = Period.between(date1, date2);
        long p2 = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Разнца между датами: " + p.getYears() + " лет, " + p.getMonths() + " месяцев, и " + p.getDays() + " дней. (Всего: " + p2 + " дней)");
    }
}

