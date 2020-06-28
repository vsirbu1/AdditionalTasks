package main.java.com.tasks.starts;

import main.java.com.messages.Task11Defenition;

import java.util.Scanner;

import static main.java.com.messages.Task11Defenition.getTEXT1;
import static main.java.com.messages.Task11Defenition.getTEXT2;
import static main.java.com.tasks.implementation.TaskNumber11.createResultMatrix;
import static main.java.com.test.constants.Constants.*;
import static main.java.com.test.constants.Constants.getFAILURE;

public class Task11Start {
    public static void startTask11Manual() {
        Scanner in = new Scanner(System.in);
        System.out.println(Task11Defenition.getTASK11DEFENITION());
        System.out.println(getTEXT1());
        int[] a = new int[in.nextInt()];
        System.out.println(getTEXT2());
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(getTEXT1());
        int[] b = new int[in.nextInt()];
        System.out.println(getTEXT2());
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }
        System.out.println(getTEXT1());
        int[] c = new int[in.nextInt()];
        System.out.println(getTEXT2());
        for (int i = 0; i < c.length; i++) {
            c[i] = in.nextInt();
        }
        System.out.println(Task11Defenition.getRESULT11());
        System.out.println(createResultMatrix(a, b, c));
    }

    public static void startTask11Test() {
        System.out.println(Task11Defenition.getTASK11DEFENITION() + Task11Defenition.getTEST11());
        for (int i = 0; i < getMATRIX1().length; i++) {
            System.out.print(getMATRIX1()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < getMATRIX2().length; i++) {
            System.out.print(getMATRIX2()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < getMATRIX3().length; i++) {
            System.out.print(getMATRIX3()[i] + " ");
        }
        System.out.println();
        System.out.println(Task11Defenition.getRESULT11());
        if (getTESTDATA11().equals(createResultMatrix(getMATRIX1(), getMATRIX2(), getMATRIX3()))) {
            System.out.println(createResultMatrix(getMATRIX1(), getMATRIX2(), getMATRIX3()));
            System.out.println(getSUCCESS());
        } else System.out.println(getFAILURE());
    }
}
