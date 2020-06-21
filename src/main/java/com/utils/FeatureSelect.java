package main.java.com.utils;

public class FeatureSelect {
    private static final String DEFAULTMESSAGE = "You entered invalid command, please try again";

    public static Integer featureSelect(Integer inputNumber) {
        switch (inputNumber) {
            case 1: {
                return 100;
            }
            case 2: {
                return 101;
            }
            case -1: {
                return -1;
            }
            default: {
                System.out.println(DEFAULTMESSAGE);
                return 0;
            }
        }
    }
}
