package main.java.com.tasks.starts;

import javafx.concurrent.Task;
import main.java.com.messages.Task13Defenition;

import java.util.Scanner;

import static main.java.com.tasks.implementation.TaskNumber13.rotateMatrix;
import static main.java.com.test.constants.Constants.*;

public class Task13Start {
    public static void startTask13Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task13Defenition.getTASK13DEFENITION());
        System.out.println(Task13Defenition.getTEST13INPUT());
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberOfRotates = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(rotateMatrix(a, numberOfRotates));
    }

    public static void startTask13Test() {
        System.out.println(Task13Defenition.getTASK13DEFENITION());
        System.out.println(Task13Defenition.getTEST13INPUT());
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (getTESTDATA13().equals(rotateMatrix(a, 3))) {
            System.out.println(rotateMatrix(a, 3));
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
