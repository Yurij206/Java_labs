package lab2.lab2_11;
import java.time.LocalDate;
import static java.time.LocalDate.of;
import static java.lang.System.out;
import static java.time.DayOfWeek.*;
import static java.time.DayOfWeek.of;
public class lab2_11 {
        public static void main(String[] args){
            printmonthCalendar(of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), 1));
        }
    private static void printmonthCalendar(LocalDate date) {
        for (int i = 0; i < 7; i++) {
            out.printf("%10s", of((i) % 7 + 1).toString());
        }
        out.println();
        int value_of_1_day = date.getDayOfWeek().getValue();
        for (int i = 0; i < value_of_1_day; i++)
            out.printf("%10s","");
        while (date.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (date.getDayOfWeek() == SUNDAY) {
                out.println();
            }
            out.printf("%10d", date.getDayOfMonth());
            date = date.plusDays(1);
        }
    }
}
