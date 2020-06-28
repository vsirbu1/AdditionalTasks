package main.java.com.tasks.implementation;

public class TaskNumber1 {
    private static final String TRUEPALINDROME = "Input data is Palindrome";
    private static final String FALSEPALINDROME = "Input data is not Palindrome";

    public static String checkIfPalindrome(String inputData) {
        inputData = inputData.replace(" ", "")
                .replace(",", "")
                .replace("!", "")
                .replace("?", "")
                .replace(".", "");
        StringBuilder builder = new StringBuilder(inputData);
        String reverseInputData = builder.reverse().toString();
        if (inputData.equalsIgnoreCase(reverseInputData))
            return TRUEPALINDROME;
        else
            return FALSEPALINDROME;
    }

    public static String getTruePalindrome() {
        return TRUEPALINDROME;
    }

    public static String getFalsePalindrome() {
        return FALSEPALINDROME;
    }
}
