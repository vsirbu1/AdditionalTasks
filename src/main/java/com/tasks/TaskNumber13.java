package main.java.com.tasks;

public class TaskNumber13 {
    public static String rotateMatrix(int[] a, int numberOfRotates) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfRotates; i++) {
            int p = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = p;
        }
        for (int i = 0; i < a.length; i++) {
            result.append(a[i]).append(" ");
        }
        return result.toString();
    }
}
