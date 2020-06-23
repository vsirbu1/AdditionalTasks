package main.java.com.tasks;

public class TaskNumber4And5 {
    public static String bubbleSortAndOther(int[] inputMatrix) {
        int status = 0;
        while (status != 1) {
            int k = 0;
            for (int i = 0; i < inputMatrix.length - 1; i++) {
                if (inputMatrix[i] < inputMatrix[i + 1]) {
                    int p = inputMatrix[i];
                    inputMatrix[i] = inputMatrix[i + 1];
                    inputMatrix[i + 1] = p;
                    k++;
                }
            }
            if (k == 0)
                status = 1;
        }
        int sum = 0, count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputMatrix.length; i++) {
            if (inputMatrix[i] % 2 == 0) {
                count++;
            } else {
                sum = sum + inputMatrix[i];
            }
            if (i == inputMatrix.length - 1) {
                result.append(inputMatrix[i]);
            } else result.append(inputMatrix[i]).append(" ");
        }
        return sum + " " + count + " " + result.toString();
    }
}
