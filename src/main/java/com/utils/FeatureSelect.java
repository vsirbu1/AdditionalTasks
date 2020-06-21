package main.java.com.utils;

import java.util.Scanner;

public class FeatureSelect {
    private static final String DEFAULTMESSAGE = "You entered invalid command, please try again";
    private static final String SELECTINGTASK = "Please select task, enter number";

    public static Integer featureSelect(Integer inputNumber) {
        Scanner in = new Scanner(System.in);
        switch (inputNumber) {
            case 1: {
                System.out.println(SELECTINGTASK);
                TaskSelect.selectTask(in.nextInt(), inputNumber);
                return 100;
            }
            case 2: {
                return 101;
            }
            case -1: {
                return -1;
            }
            default: {
                System.out.println(DEFAULTMESSAGE);
                return 0;
            }
        }
    }
}
