package main.java.com.tasks.implementation;

public class TaskNumber17 {
    public static int calculateMatrix(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return determinant(a);
    }

    public static int calculateMatrixTest() {
        int[][] a = new int[][]{{5, 3, 1}, {1, 8, 6}, {1, 1, 5}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return determinant(a);
    }

    private static int determinant(int[][] matrix) {
        if (matrix.length > 2) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (i % 2 == 0) {
                    int[][] a = new int[matrix.length - 1][matrix.length - 1];
                    for (int j = 0; j < a.length; j++) {
                        int r = 0;
                        for (int k = 0; k < matrix.length; k++) {
                            if (k != i) {
                                a[j][r] = matrix[j + 1][k];
                                r++;
                            }
                        }
                    }
//                    showMatrix(a);
                    sum = sum + matrix[0][i] * determinant(a);
                } else {
                    int[][] a = new int[matrix.length - 1][matrix.length - 1];
                    for (int j = 0; j < a.length; j++) {
                        int r = 0;
                        for (int k = 0; k < matrix.length; k++) {
                            if (k != i) {
                                a[j][r] = matrix[j + 1][k];
                                r++;
                            }
                        }
                    }
//                    showMatrix(a);
                    sum = sum - matrix[0][i] * determinant(a);
                }
            }
            return sum;
        } else {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
    }
}
