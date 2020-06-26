package main.java.com.tasks;

public class TaskNumber18 {
    public static void startPlay(int numberOfPeople, int countingStep) {
        int[] a = new int[numberOfPeople];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int alarm = 0;
        int k = 0;
        int r = 1;
        while (alarm != 1) {
            int countZero = countPeople(a);
            if (countZero == a.length - 1) {
                alarm = 1;
            }
            if (a[k] != 0) {
                if (r == countingStep) {
                    a[k] = 0;
                    r = 0;
                    showPeople(a);
                    System.out.println();
                }
                k++;
                r++;
                if (k == a.length) {
                    k = 0;
                }
                ;
            } else {
                k++;
                if (k == a.length) {
                    k = 0;
                }
                ;
            }
        }
    }

    private static int countPeople(int[] matrix) {
        int countZero = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 0) {
                countZero++;
            }
        }
        return countZero;
    }

    private static void showPeople(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != 0) {
                System.out.print(matrix[i] + " ");
            }
        }
    }
}
