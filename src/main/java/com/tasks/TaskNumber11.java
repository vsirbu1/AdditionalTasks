package main.java.com.tasks;

public class TaskNumber11 {
    public static String createResultMatrix(int[] a, int[] b, int[] c) {
        int[] result = new int[a.length + b.length + c.length];
        int max = findMax(a[a.length - 1], b[b.length - 1], c[c.length - 1]);
        int a1 = 0, b1 = 0, c1 = 0;

        for (int i = 0; i < result.length; i++) {
            int w1, w2, w3;
            if (a1 > a.length - 1) {
                w1 = max + 1;
            } else
                w1 = a[a1];
            if (b1 > b.length - 1) {
                w2 = max + 1;
            } else
                w2 = b[b1];
            if (c1 > c.length - 1) {
                w3 = max + 1;
            } else
                w3 = c[c1];
            result[i] = findMin(w1, w2, w3);
            int mintable = findTableMin(w1, w2, w3);
            if (mintable == 0)
                a1++;
            if (mintable == 1)
                b1++;
            if (mintable == 2)
                c1++;
        }
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            finalResult.append(" ").append(result[i]);
        }
        return finalResult.toString();
    }

    public static int findMax(int q1, int q2, int q3) {
        int max = q1;
        if (q1 >= q2 && q1 >= q3) {
            max = q1;
        }
        if (q2 >= q1 && q2 >= q3) {
            max = q2;
        }
        if (q3 >= q2 && q3 >= q1) {
            max = q3;
        }
        return max;
    }

    public static int findMin(int q1, int q2, int q3) {
        int min = q1;
        if (q1 <= q2 && q1 <= q3) {
            min = q1;
        }
        if (q2 <= q1 && q2 <= q3) {
            min = q2;
        }
        if (q3 <= q2 && q3 <= q1) {
            min = q3;
        }
        return min;
    }

    public static int findTableMin(int q1, int q2, int q3) {
        int numTable = q1;
        if (q1 <= q2 && q1 <= q3) {
            numTable = 0;
        }
        if (q2 <= q1 && q2 <= q3) {
            numTable = 1;
        }
        if (q3 <= q2 && q3 <= q1) {
            numTable = 2;
        }
        return numTable;
    }
}
