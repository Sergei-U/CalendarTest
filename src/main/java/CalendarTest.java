import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();
        localDate = localDate.minusDays(today - 1);
        DayOfWeek weekDay = localDate.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i<value; i++) {
            System.out.println(" ");
            while (localDate.getMonthValue()==month) {
                System.out.println("%3d"+localDate.getDayOfMonth());
                if (localDate.getMonthValue()==today)
                    System.out.println("*");
                else
                    System.out.println(" ");
                localDate = localDate.plusDays(1);
                if (localDate.getDayOfWeek().getValue() !=1);
                System.out.println();
            }
            if (localDate.getDayOfWeek().getValue() != 1)
                System.out.println();
        }
    }
}
