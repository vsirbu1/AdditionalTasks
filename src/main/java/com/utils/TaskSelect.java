package main.java.com.utils;

import main.java.com.messages.Task1Defenition;
import main.java.com.tasks.TaskNumber1;

import java.util.Scanner;

import static main.java.com.tasks.TaskNumber1.*;

public class TaskSelect {
    //Test Status
    private static final String SUCCESS = "All works as expected\n";
    private static final String FAILURE = "There are some problems\n";
    //Task 1
    private static final String TESTDATA1 = "radar";
    private static final String TESTDATA2 = "qwerty";

    public static void selectTask(Integer number, Integer checkingType) {
        Scanner in = new Scanner(System.in);
        switch (number) {
            case 1: {
                if (checkingType.equals(1)) {
                    System.out.println(Task1Defenition.getTASK1DEFENITION() + "\n");
                    String inputData = in.next();
                    System.out.println(checkIfPalindrome(inputData));
                } else {
                    System.out.println(Task1Defenition.getTASK1DEFENITION() + "\n");
                    if (checkIfPalindrome(TESTDATA1).equals(getTruepalindrome()) &&
                            checkIfPalindrome(TESTDATA2).equals(getFalsepalindrome())) {
                        System.out.println(SUCCESS);
                    } else System.out.println(FAILURE);
                }
            }
            case 2: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 3: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 4: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 5: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 6: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 7: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 8: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 9: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 10: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 11: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 12: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 13: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 14: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 15: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 16: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 17: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 18: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 19: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 20: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            default: {

            }
        }
    }
}
