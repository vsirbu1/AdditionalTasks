package main.java.com.tasks.starts;

import main.java.com.messages.Task19Defenition;
import main.java.com.tasks.implementation.TaskNumber19;

import java.util.Scanner;

public class Task19Start {
    public static void startTask19Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task19Defenition.getTASK19DEFENITION());
        TaskNumber19.permutate(in.nextInt());
    }
}
