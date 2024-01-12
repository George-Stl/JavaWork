package Project;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH) + "." +
                (1 + date.get(GregorianCalendar.MONTH)) + "." + date.get(GregorianCalendar.YEAR));

        GregorianCalendar datePassed = new GregorianCalendar();

        datePassed.setTimeInMillis(1234567898765L);
        System.out.println(datePassed.get(GregorianCalendar.DAY_OF_MONTH) + "." +
                (1 + datePassed.get(GregorianCalendar.MONTH)) + "." + datePassed.get(GregorianCalendar.YEAR));
    }
}