package main.java.com.tasks.starts;

import main.java.com.messages.Task17Defenition;
import main.java.com.tasks.implementation.TaskNumber17;

import java.util.Scanner;

import static main.java.com.test.constants.Constants.getFAILURE;
import static main.java.com.test.constants.Constants.getSUCCESS;

public class Task17Start {
    public static void startTask17Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task17Defenition.getTASK17DEFENITION() + "\n" + Task17Defenition.getPLEASE());
        System.out.println("Determinant value " + TaskNumber17.calculateMatrix(in.nextInt()));
    }

    public static void startTask17Test() {
        System.out.println(Task17Defenition.getTASK17DEFENITION());
        System.out.println(Task17Defenition.getTESTINPUT());
        if (166 == TaskNumber17.calculateMatrixTest()) {
            System.out.println(Task17Defenition.getTESTINPUT1()
                    + TaskNumber17.calculateMatrixTest());
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
