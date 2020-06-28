package main.java.com.tasks.starts;

import main.java.com.messages.Task14Defenition;
import main.java.com.tasks.implementation.TaskNumber14;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.getFAILURE;
import static main.java.com.test.constants.Constants.getSUCCESS;

public class Task14Start {
    public static void startTask14Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task14Defenition.getTASK14DEFENITION());
        System.out.println(Task14Defenition.getTASK14INPUT());
        int amount = in.nextInt();
        System.out.println("For " + amount + " you need " + TaskNumber14.minAmountOfCoins(amount) + " coins");
    }

    public static void startTask14Test() {
        System.out.println(Task14Defenition.getTASK14DEFENITION());
        System.out.println(Task14Defenition.getTEST14INPUT());
        if (4 == TaskNumber14.minAmountOfCoins(33)) {
            System.out.println(TaskNumber14.minAmountOfCoins(33));
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
