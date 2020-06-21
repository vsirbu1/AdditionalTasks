package main.java.com.main;

import main.java.com.messages.WelcomeMessage;
import main.java.com.utils.FeatureSelect;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int exitOperator = 0;
        Scanner in = new Scanner(System.in);
        WelcomeMessage.welcomeMessage();
        while (exitOperator != -1) {
            WelcomeMessage.featureSelect();
            int inputNumber= in.nextInt();
            exitOperator= FeatureSelect.featureSelect(inputNumber);
        }

    }
}
