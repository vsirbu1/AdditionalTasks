package main.java.com.tasks.starts;

import main.java.com.messages.Task18Defenition;
import main.java.com.tasks.implementation.TaskNumber18;

import java.util.Scanner;

public class Task18Start {
    public static void startTask18Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task18Defenition.getTASK18DEFENITION() + "\n" + Task18Defenition.getPLEASE1());
        TaskNumber18.startPlay(in.nextInt(), in.nextInt());
    }
}
