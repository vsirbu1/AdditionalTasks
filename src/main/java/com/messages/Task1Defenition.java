package main.java.com.messages;

import static main.java.com.test.constants.Constants.getTESTDATA1;
import static main.java.com.test.constants.Constants.getTESTDATA2;

public class Task1Defenition {
    private static final String TASK1DEFENITION = "Given a string of characters, determine if it is a palindrome or not";

    private static final String TASK1INPUT = "Please provide input string, which will be checked";

    private static final String TASK1TESTTEXT = "In this test we check if strings\n'" +
            getTESTDATA1()+ "'\nand\n'"+getTESTDATA2()
            +"'\nare palindrome";

    public static String getTASK1DEFENITION() {
        return TASK1DEFENITION;
    }

    public static String getTASK1INPUT() {
        return TASK1INPUT;
    }

    public static String getTASK1TESTTEXT() {
        return TASK1TESTTEXT;
    }
}
