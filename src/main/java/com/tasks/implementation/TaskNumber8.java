package main.java.com.tasks.implementation;

public class TaskNumber8 {
    public static String listOfPrimeNumbers(int n) {
        StringBuilder result = new StringBuilder();
        if (n >= 2) {
            result.append("2 ");
        }
        for (int i = 3; i < n; i++) {
            boolean check = true;
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }
}
