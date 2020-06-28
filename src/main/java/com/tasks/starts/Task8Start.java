package main.java.com.tasks.starts;

import main.java.com.messages.Task8Defenition;
import main.java.com.tasks.implementation.TaskNumber8;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task8Start {
    public static void startTask8Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task8Defenition.getTASK8DEFENITION()
                + Task8Defenition.getTASK8INPUT());
        int inputData = in.nextInt();
        System.out.println(Task8Defenition.getTASK8RESULT()
                + TaskNumber8.listOfPrimeNumbers(inputData));
    }

    public static void startTask8Test() {
        System.out.println(Task8Defenition.getTASK8DEFENITION() + Task8Defenition.getTEST8RESULT());
        if (getTESTDATA8().equals(TaskNumber8.listOfPrimeNumbers(100))) {
            System.out.println(TaskNumber8.listOfPrimeNumbers(100));
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
