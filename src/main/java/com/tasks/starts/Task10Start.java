package main.java.com.tasks.starts;

import main.java.com.messages.Task10Defenition;
import main.java.com.tasks.implementation.TaskNumber10;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task10Start {
    public static void startTask10Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task10Defenition.getTASK10DEFENITION());
        int inputData = in.nextInt();
        System.out.println(TaskNumber10.findLeapYears(inputData));
    }

    public static void startTask10Test() {
        if (getTESTDATA10().equals(TaskNumber10.findLeapYears(6))) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
