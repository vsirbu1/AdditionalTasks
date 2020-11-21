package main.java.com.tasks.implementation;

import java.util.Random;

public class TaskNumber23 {
    public static void initiating() {
        Random rand = new Random();
        int number = 20;
        int[] list = new int[number];
        for (int i = 0; i < number; i++) {
            list[i] = rand.nextInt(9)+1;
            System.out.print(list[i]);
        }
        System.out.println();
        int numberDeletions = 0;
        for (int i = 0; i < list.length - numberDeletions - 1; i++) {
            if (list[i] > list[i + 1]) {
                for (int j = i; j < list.length - numberDeletions-1; j++) {
                    list[j] = list[j + 1];
                }
                numberDeletions++;
                i = -1;
            }
        }
        for (int i = 0; i < list.length - numberDeletions; i++) {
            System.out.print(list[i]);
        }
        System.out.println();
    }
}
