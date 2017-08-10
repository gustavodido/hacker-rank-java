package exercises.introduction;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.LONG;
import static java.util.Locale.US;

public class DateAndTime {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int month = Integer.parseInt(scanner.next());
        int day = Integer.parseInt(scanner.next());
        int year = Integer.parseInt(scanner.next());

        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        out.println(calendar.getDisplayName(DAY_OF_WEEK, LONG, US).toUpperCase());
    }

}
