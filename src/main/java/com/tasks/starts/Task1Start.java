package main.java.com.tasks.starts;

import java.util.Scanner;

import static main.java.com.messages.Task1Defenition.*;
import static main.java.com.tasks.implementation.TaskNumber1.*;
import static main.java.com.test.constants.Constants.*;
import static main.java.com.test.constants.Constants.getFAILURE;

public class Task1Start {
    public static void startTask1Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(getTASK1DEFENITION() + "\n" + getTASK1INPUT());
        String inputData = in.next();
        System.out.println(checkIfPalindrome(inputData));
    }

    public static void startTask1Test() {
        System.out.println(getTASK1DEFENITION() + "\n"
                + getTASK1TESTTEXT());
        if (checkIfPalindrome(getTESTDATA1()).equals(getTruePalindrome()) &&
                checkIfPalindrome(getTESTDATA2()).equals(getFalsePalindrome())) {
            System.out.println("\n" + getSUCCESS());
        } else System.out.println("\n" + getFAILURE());
    }
}
