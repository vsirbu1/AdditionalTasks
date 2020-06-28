package main.java.com.tasks.starts;

import main.java.com.messages.Task12Defenition;
import main.java.com.tasks.implementation.TaskNumber12;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;
import static main.java.com.test.constants.Constants.getFAILURE;

public class Task12Start {
    public static void startTask12Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task12Defenition.getTASK12DEFENITION());
        System.out.println(Task12Defenition.getTEXT1());
        int n = in.nextInt();
        int[][] inputMatrix = new int[n][n];
        System.out.println(Task12Defenition.getTEXT2());
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                inputMatrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(TaskNumber12.sortLines(inputMatrix));
    }

    public static void startTask12Test() {
        if (getTESTDATA12().equals(TaskNumber12.sortLines(getMATRIX4()))) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
