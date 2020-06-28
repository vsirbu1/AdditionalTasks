package main.java.com.tasks.starts;

import main.java.com.messages.Task6Defenition;
import main.java.com.tasks.implementation.TaskNumber6;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task6Start {
    public static void startTask6Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task6Defenition.getTASK6DEFENITION());
        int inputData = in.nextInt();
        System.out.println("Number Pi is " + Math.PI);
        System.out.println("New number Pi is " + TaskNumber6.findNewPi(inputData));
    }

    public static void startTask6Test() {
        if (getTESTDATA7().equals(TaskNumber6.findNewPi(4))) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
