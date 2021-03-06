package main.java.com.tasks.implementation;

public class TaskNumber2 {
    public static String buildStairCase1(int inputData) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputData; i++) {
            for (int j = 0; j < (inputData - i) / 2; j++) {
                result.append(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                result.append("#");
            }
            result.append("\n");
        }
        return result.toString();

    }

    public static String buildStairCase2(int inputData) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= inputData; i++) {
            for (int j = 0; j < inputData - i; j++) {
                result.append(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                result.append("#");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static String buildStairCase(int inputData) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputData; i++) {
            for (int j = 0; j < (inputData - i) - 1; j++) {
                result.append(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                result.append("#");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
