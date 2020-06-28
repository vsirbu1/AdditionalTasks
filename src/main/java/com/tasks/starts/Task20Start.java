package main.java.com.tasks.starts;

import main.java.com.messages.Task20Defenition;
import main.java.com.tasks.implementation.TaskNumber20;

import java.util.Scanner;

public class Task20Start {
    public static void startTask20Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task20Defenition.getTASK20DEFENITION());
        TaskNumber20.findSequence(5);
    }
}
