package main.java.com.tasks;

public class TaskNumber12 {
    public static String sortLines(int[][] inputMatrix) {
        int p;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = i + 1; j < inputMatrix.length; j++) {
                int sum1 = 0, sum2 = 0;
                for (int k = 0; k < inputMatrix.length; k++) {
                    sum1 = sum1 + inputMatrix[i][k];
                    sum2 = sum2 + inputMatrix[j][k];
                }
                if (sum2 < sum1) {
                    for (int k = 0; k < inputMatrix.length; k++) {
                        p = inputMatrix[i][k];
                        inputMatrix[i][k] = inputMatrix[j][k];
                        inputMatrix[j][k] = p;
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                result.append(inputMatrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
