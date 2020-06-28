package main.java.com.tasks.starts;

import main.java.com.messages.Task7Defenition;
import main.java.com.tasks.implementation.TaskNumber7;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;
import static main.java.com.test.constants.Constants.getFAILURE;

public class Task7Start {
    public static void startTask7Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task7Defenition.getTASK7DEFENITION() + Task7Defenition.getINPUT1());
        int inputData = in.nextInt();
        System.out.println(Task7Defenition.getINPUT2());
        int[][] inputMatrix = new int[inputData][inputData];
        for (int i = 0; i < inputData; i++) {
            for (int j = 0; j < inputData; j++) {
                System.out.println(Task7Defenition.getINPUTELEMENTS() + i + j);
                inputMatrix[i][j] = in.nextInt();
            }
        }
        if (TaskNumber7.check(inputMatrix)) System.out.println(Task7Defenition.getMAGICSQUARE());
        else System.out.println(Task7Defenition.getNOTMAGICSQUARE());
    }

    public static void startTask7Test() {
        System.out.println(Task7Defenition.getTASK7DEFENITION() + Task7Defenition.getTESTINPUT());
        for (int i = 0; i < getMAGICSQUAREMATRIX().length; i++) {
            for (int j = 0; j < getMAGICSQUAREMATRIX().length; j++) {
                System.out.print(getMAGICSQUAREMATRIX()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < getSQUAREMATRIX().length; i++) {
            for (int j = 0; j < getSQUAREMATRIX().length; j++) {
                System.out.print(getSQUAREMATRIX()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        if (TaskNumber7.check(getMAGICSQUAREMATRIX()) && !TaskNumber7.check(getSQUAREMATRIX()))
            System.out.println(getSUCCESS());
        else System.out.println(getFAILURE());
    }
}
