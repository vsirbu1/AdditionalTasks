package main.java.com.tasks.starts;

import main.java.com.messages.Task4And5Defenition;
import main.java.com.tasks.implementation.TaskNumber4And5;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task4And5Start {
    public static void startTask4And5Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task4And5Defenition.getTASK4And5DEFENITION()
                + Task4And5Defenition.getINPUTDATA());
        int inputData = in.nextInt();
        int[] initialMatrix = new int[inputData];
        for (int i = 0; i < inputData; i++) {
            initialMatrix[i] = (int) (Math.random() * 100);
            System.out.print(initialMatrix[i] + " ");
        }
        System.out.println();
        String result = TaskNumber4And5.bubbleSortAndOther(initialMatrix);
        int n = result.indexOf(" ");
        System.out.println(Task4And5Defenition.getSUMODD()
                + result.substring(0, n));
        result = result.substring(n + 1);
        n = result.indexOf(" ");
        System.out.println(Task4And5Defenition.getAMOUNTEVEN() + result.substring(0, n));
        result = result.substring(n);
        System.out.println(Task4And5Defenition.getRESULT() + result);
    }

    public static void startTask4AndTest() {
        System.out.println(Task4And5Defenition.getTASK4And5DEFENITION());
        int[] preparedMatrix = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Task4And5Defenition.getTEST());
        for (int i = 0; i < preparedMatrix.length; i++) {
            System.out.print(preparedMatrix[i] + " ");
        }
        String result = TaskNumber4And5.bubbleSortAndOther(preparedMatrix);
        System.out.println(Task4And5Defenition.getTESTRESULT()
                + result);
        if (getTESTDATA6().equals(result)) {
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
