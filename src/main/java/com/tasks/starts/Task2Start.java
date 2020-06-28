package main.java.com.tasks.starts;

import java.util.Scanner;

import static main.java.com.messages.Task2Defenition.*;
import static main.java.com.tasks.implementation.TaskNumber2.*;
import static main.java.com.test.constants.Constants.*;

public class Task2Start {
    public static void startTask2Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(getTASK2DEFENITION() + "\n"
                + getTASK2INPUT());
        int inputData = in.nextInt();
        System.out.println(getTASK2RESULT()
                + buildStairCase(inputData)
                + getTASK2BONUS1()
                + buildStairCase1(inputData)
                + getTASK2BONUS2()
                + buildStairCase2(inputData));
    }

    public static void startTask2Test() {
        System.out.println(getTASK2AUTOMATION());
        if (getTESTDATA3().equals(buildStairCase(5))) {
            System.out.println(buildStairCase(5) + "\n" + getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
