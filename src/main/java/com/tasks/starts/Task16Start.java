package main.java.com.tasks.starts;

import main.java.com.messages.Task16Defenition;
import main.java.com.tasks.implementation.TaskNumber16;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.getFAILURE;
import static main.java.com.test.constants.Constants.getSUCCESS;

public class Task16Start {
    public static void startTask16Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task16Defenition.getTASK16DEFENITION());
        System.out.println(TaskNumber16.countNumberOfSteps(in.nextInt()));
    }

    public static void startTask16Test() {
        if (6 == TaskNumber16.countNumberOfSteps(33)) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
