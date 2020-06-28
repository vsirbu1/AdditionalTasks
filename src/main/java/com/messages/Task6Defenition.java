package main.java.com.messages;

import static main.java.com.test.constants.Constants.getTESTDATA7;

public class Task6Defenition {
    private static final String TASK6DEFENITION = "Given an integer n, determine the number pi with an error less than n decimal places";
    private static final String TASK6INPUT = "\nPlease provide decimal places";
    private static final String ORIGINALPI = "Number Pi is ";
    private static final String NEWPI = "New number Pi is ";
    private static final String TESTINPUT = "\nCheck that for 4 decimal places result is " + getTESTDATA7();


    public static String getTASK6DEFENITION() {
        return TASK6DEFENITION;
    }

    public static String getTASK6INPUT() {
        return TASK6INPUT;
    }

    public static String getORIGINALPI() {
        return ORIGINALPI;
    }

    public static String getNEWPI() {
        return NEWPI;
    }

    public static String getTESTINPUT() {
        return TESTINPUT;
    }
}
