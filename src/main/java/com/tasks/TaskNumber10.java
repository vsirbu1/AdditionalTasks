package main.java.com.tasks;

import java.util.Calendar;
import java.util.Date;

public class TaskNumber10 {
    public static String findLeapYears(int k) {
        StringBuilder result = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        for (int i = k; i > 0; i--) {
            int r = 0;
            while (r == 0) {
                year++;
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    r = 1;
                }
            }
            result.append(" ").append(year);
        }
        return result.toString();
    }
}
