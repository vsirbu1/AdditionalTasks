package main.java.com.tasks.implementation;

public class TaskNumber16 {
    public static int countNumberOfSteps(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            count++;
        }
        return count;
    }
}
