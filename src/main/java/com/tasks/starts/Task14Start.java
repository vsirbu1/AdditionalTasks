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
        int amount = in.nextInt();
        System.out.println("For " + amount + " you need" + TaskNumber14.munAmountOfCoins(amount) + " coins");
    }

    public static void startTask14Test() {
        if (4 == TaskNumber14.munAmountOfCoins(33)) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
