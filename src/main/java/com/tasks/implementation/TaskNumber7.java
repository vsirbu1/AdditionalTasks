package main.java.com.tasks.implementation;

public class TaskNumber7 {
    public static boolean magicSquare(int[][] inputMatrix) {
        return check(inputMatrix);
    }

    public static boolean check(int[][] a) {
        boolean magicSquare = true;
        int[] b = new int[8];
        for (int i = 0; i < a.length; i++) {
            b[0] = b[0] + a[0][i];
            b[1] = b[1] + a[1][i];
            b[2] = b[2] + a[2][i];
            b[3] = b[3] + a[i][0];
            b[4] = b[4] + a[i][1];
            b[5] = b[5] + a[i][2];
            b[6] = b[6] + a[i][i];
            b[7] = b[7] + a[a.length - 1 - i][a.length - 1 - i];
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < b.length; j++) {
                if (b[i] != b[j]) {
                    magicSquare = false;
                    break;
                }
            }
        }
        return magicSquare;
    }
}
