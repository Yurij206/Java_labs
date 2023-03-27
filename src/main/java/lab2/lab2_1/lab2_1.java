package lab2.lab2_1;
import java.time.*;

import static java.lang.Math.abs;
import static java.lang.System.out;
import static java.time.DayOfWeek.of;

public class lab2_1 {
    public static void main(String[] args)
    {
        int year = 2023;
        int month = 5;
        int day_of_week= 1;
        LocalDate date = LocalDate.of(year, month, 1);
        for (int i = 0; i < 7; i++) {
            out.printf("%10s", of((i+day_of_week-1) % 7 + 1).toString());
        }
        out.println();
        DayOfWeek weekday = date.getDayOfWeek();
        int value = ((7+weekday.getValue()-day_of_week) % 7);
        for (int i = 0; i < value; i++)
            System.out.printf("%10s","");

        while (date.getMonthValue() == month)
        {

            System.out.printf ("%10d", date.getDayOfMonth()) ;

            weekday = date.getDayOfWeek();
            value =  ((weekday.getValue()) );
            if (value%7 == (day_of_week-1))
                System.out.printf("\n") ;

            date = date.plusDays(1);
        }
    }
}
