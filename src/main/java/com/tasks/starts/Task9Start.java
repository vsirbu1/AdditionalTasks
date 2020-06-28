package main.java.com.tasks.starts;

import main.java.com.messages.Task9Defenition;
import main.java.com.tasks.implementation.TaskNumber9;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task9Start {
    public static void startTask9Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task9Defenition.getTASK9DEFENITION() + Task9Defenition.getTASK9INPUT());
        int inputData = in.nextInt();
        System.out.println(TaskNumber9.findFrendlyNumbers(inputData));
    }

    public static void startTask9Test() {
        System.out.println(Task9Defenition.getTASK9DEFENITION() + Task9Defenition.getTEST9RESULT());
        if (getTESTDATA9().equals(TaskNumber9.findFrendlyNumbers(200))) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
