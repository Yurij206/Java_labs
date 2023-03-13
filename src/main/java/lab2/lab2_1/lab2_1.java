package lab2.lab2_1;
import java.time.*;
public class lab2_1 {
    public static void main(String[] args)
    {
        int year = 2023;
        int month = 3;
        LocalDate date = LocalDate.of(year, month, 1);

        System.out.printf(" Sun Mon Tue Wed Thu Fri Sat\n");

        DayOfWeek weekday = date.getDayOfWeek();
        int value = (weekday.getValue() % 7) + 1;
        for (int i = 1; i < value; i++)
            System.out.printf("    ");

        while (date.getMonthValue() == month)
        {

            System.out.printf ("%4d", date.getDayOfMonth()) ;

            weekday = date.getDayOfWeek();
            value =  (weekday.getValue() % 7) + 1;
            if (value == 7)
                System.out.printf("\n") ;

            date = date.plusDays(1);
        }
    }
}
