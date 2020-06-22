package main.java.com.tasks;

public class TaskNumber3 {
    public static double[] inverceFloatingMatrix(double[] matrix){
        for (int i = 0; i < matrix.length/2; i++) {
            double p = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = p;
        }
        return matrix;
    }
}
