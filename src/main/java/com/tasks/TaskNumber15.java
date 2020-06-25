package main.java.com.tasks;

public class TaskNumber15 {
    public static String rotateMatrix(int[][] a, int n) {
        StringBuilder result = new StringBuilder();
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < b.length; k++) {
                    b[j][k] = 0;
                }
            }
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    b[k][a.length - 1 - j] = a[j][k];
                }
            }
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    a[j][k] = b[j][k];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result.append(a[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
