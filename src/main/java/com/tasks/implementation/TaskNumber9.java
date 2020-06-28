package main.java.com.tasks.implementation;

public class TaskNumber9 {
    public static String findFrendlyNumbers(int inputData) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= inputData; i++) {
            double sumi = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    sumi = sumi + k;
                }
            }
            double sigma1 = sumi / i;
            for (int j = 1; j < i; j++) {
                double sumj = 0;
                for (int k = 1; k <= j; k++) {
                    if (j % k == 0) {
                        sumj = sumj + k;
                    }
                }
                double sigma2 = sumj / j;
                if (sigma1 == sigma2) {
                    result.append(i).append(" ").append(j).append(" are friendly numbers").append("\n");
                }
            }
        }
        return result.toString();
    }
}
