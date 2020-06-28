package main.java.com.messages;

public class Task2Defenition {
    private static final String TASK2DEFENITION = "Drawing a staircase structure - given the required height, output a staircase as shown in the example\n\"Given n = 6, the output should be:\n" +
            "     #\n" +
            "    ##\n" +
            "   ###\n" +
            "  ####\n" +
            " #####\n" +
            "######\"";

    private static final String TASK2INPUT = "Please, provide height of staircase, which should be drawed";

    private static final String TASK2RESULT = "Result is:\n";

    private static final String TASK2BONUS1 = "\nThe same, but little different task is to draw Christmas tree:\n " +
            "It could be drawed like this \n";

    private static final String TASK2BONUS2 = "\n Or like this one: \n";

    private static final String TASK2AUTOMATION = "For test we need to draw staircase with height 5 and compare it with prepared standart:\n";

    public static String getTASK2DEFENITION() {
        return TASK2DEFENITION;
    }

    public static String getTASK2INPUT() {
        return TASK2INPUT;
    }

    public static String getTASK2RESULT() {
        return TASK2RESULT;
    }

    public static String getTASK2BONUS1() {
        return TASK2BONUS1;
    }

    public static String getTASK2BONUS2() {
        return TASK2BONUS2;
    }

    public static String getTASK2AUTOMATION() {
        return TASK2AUTOMATION;
    }
}
