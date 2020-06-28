package main.java.com.tasks.starts;

import main.java.com.messages.Task3Defenition;
import main.java.com.tasks.implementation.TaskNumber3;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.*;

public class Task3Start {
    public static void startTask3Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task3Defenition.getTASK3DEFENITION());
        int inputData = in.nextInt();
        double[] floatingMatrix = new double[inputData];
        for (int i = 0; i < floatingMatrix.length; i++) {
            floatingMatrix[i] = (int) (Math.random() * 10) + Math.random();
            System.out.print(floatingMatrix[i] + " ");
        }
        System.out.println();
        double[] result = TaskNumber3.inverceFloatingMatrix(floatingMatrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void startTask3Test() {
        double[] floatingMatrix = new double[]{3.456, 1.54, 9.42, 6.73, 5.25};
        double[] result = TaskNumber3.inverceFloatingMatrix(floatingMatrix);
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            resultString.append(result[i]);
            if (i != result.length - 1) {
                resultString.append(" ");
            }
        }
        if (getTESTDATA5().equals(resultString.toString())) {
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
