package main.java.com.tasks;

public class TaskNumber1 {
    private static final String TRUEPALINDROME = "Input data is Palindrome";
    private static final String FALSEPALINDROME = "Input data is not Palindrome";

    public static String checkIfPalindrome(String inputData) {
        StringBuilder builder = new StringBuilder(inputData);
        String reverseInputData = builder.reverse().toString();
        if (inputData.equals(reverseInputData))
            return TRUEPALINDROME;
        else
            return FALSEPALINDROME;
    }

    public static String getTruepalindrome() {
        return TRUEPALINDROME;
    }

    public static String getFalsepalindrome() {
        return FALSEPALINDROME;
    }
}
