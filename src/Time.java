import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {

    public static void main(String[] args) throws IOException, ParseException {

        System.out.println("Какую операцию вы хотите совершить?");
        System.out.println();
        System.out.println("Если хотите узнать разницу между датами, нажмите 1");
        System.out.println("Если хотите прибавить несколько дней к дате, нажмите 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) different();
        if (a == 2) sum();
        if ((a != 1) & (a != 2)) System.out.println("ОШИБКА: введено неверное число!");

    }

    public static void different () throws IOException {
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

    public static void sum () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую дату в формате dd.mm.yyyy");
        String dat1 = reader.readLine();
        String[] idat = dat1.split("\\.");
        int num1 = Integer.parseInt(idat[0]);
        int month1 = Integer.parseInt(idat[1]);
        int year1 = Integer.parseInt(idat[2]);

        System.out.println("Введите количество прибавляемых/отнимаемых дней");
        System.out.println("Нпример: 5 или -5");
        int day = Integer.parseInt(reader.readLine());

        LocalDate date = LocalDate.of(year1, month1, num1);
        int num = date.plusDays(day).getDayOfMonth();
        int month = date.plusDays(day).getMonthValue();
        int year = date.plusDays(day).getYear();
        System.out.print("Результат: ");
        if (num < 10) {
            System.out.print("0" + num + ".");
        } else {
            System.out.print(num + ".");
        }
        if (month < 10) {
            System.out.print("0" + month + ".");
        } else {
            System.out.print(month + ".");
        }
        System.out.print(year);
    }


}

