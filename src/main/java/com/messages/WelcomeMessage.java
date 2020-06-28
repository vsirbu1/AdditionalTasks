package main.java.com.messages;

public class WelcomeMessage {
    private static final String WELCOMEMESSAGE = "Hi, you started project which contain a lot of tasks";
    private static final String SELECTFEATURE = "Please select option:";
    private static final String FEATURE1MANUALEXECUTE = "1 if you wanted to check selected task manually";
    private static final String FEATURE2AUTOMATIONEXECUTE = "2 if you wanted start tests which automatically check selected task";
    private static final String STOPANDQUIT = "-1 if you wanted stop this project";
    private static final String INVALIDDATA = "Invalid data, please try again";

    public static final void welcomeMessage() {
        System.out.println(WELCOMEMESSAGE);
    }

    public static String getINVALIDDATA() {
        return INVALIDDATA;
    }

    public static final void featureSelect() {
        System.out.println(SELECTFEATURE);
        System.out.println(FEATURE1MANUALEXECUTE);
        System.out.println(FEATURE2AUTOMATIONEXECUTE);
        System.out.println(STOPANDQUIT);
    }
}
