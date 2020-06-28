package main.java.com.tasks.implementation;

import java.util.HashSet;

public class TaskNumber14 {
    public static int minAmountOfCoins(int amount) {
        int inputData = amount;
        int count = 0;
        int[] a = new int[]{1, 3, 10, 25, 50};
        HashSet<Integer> b = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                b.add(a[i] + a[j]);
            }
        }
        HashSet<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = j; k < a.length; k++) {
                    c.add(a[i] + a[j] + a[k]);
                }
            }
        }
        HashSet<Integer> d = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = j; k < a.length; k++) {
                    for (int l = k; l < a.length; l++) {
                        d.add(a[i] + a[j] + a[k] + a[l]);
                    }
                }
            }
        }
        while (inputData > 0) {
            for (int i = 0; i < a.length; i++) {
                if (inputData == a[i]) {
                    count++;
                    inputData = 0;
                    break;
                }
            }
            if (b.contains(inputData)) {
                count = count + 2;
                inputData = 0;
            }
            if (c.contains(inputData)) {
                count = count + 3;
                inputData = 0;
            }
            if (d.contains(inputData)) {
                count = count + 4;
                inputData = 0;
            }
            if (inputData != 0) {
                inputData = inputData - greedyNominal(inputData);
                count++;
            }
        }
        return count;
    }

    public static int greedyNominal(int a) {
        int nominal = 1;
        if (a > 3) {
            nominal = 3;
        }
        if (a > 10) {
            nominal = 10;
        }
        if (a > 25) {
            nominal = 25;
        }
        if (a > 50) {
            nominal = 50;
        }
        return nominal;
    }
}
