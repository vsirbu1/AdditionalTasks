package main.java.com.tasks;

import main.java.com.messages.WelcomeMessage;
import main.java.com.utils.FeatureSelect;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int exitOperator = 0;
        WelcomeMessage.welcomeMessage();
        while (exitOperator != -1) {
            WelcomeMessage.featureSelect();
            Scanner in = new Scanner(System.in);
            int inputNumber= in.nextInt();
            exitOperator= FeatureSelect.featureSelect(inputNumber);
        }

    }
}
