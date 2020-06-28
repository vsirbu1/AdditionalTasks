package main.java.com.tasks.starts;

import main.java.com.tasks.implementation.TaskNumber15;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task15Start {
    public static void startTask15Manual() {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(TaskNumber15.rotateMatrix(a, in.nextInt()));
    }

    public static void startTask15Test() {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        if (getTESTDATA15().equals(TaskNumber15.rotateMatrix(a, 2))) System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
