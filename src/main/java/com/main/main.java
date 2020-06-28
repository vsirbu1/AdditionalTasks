package main.java.com.main;

import main.java.com.messages.WelcomeMessage;
import main.java.com.utils.FeatureSelect;

import java.util.Scanner;

import static main.java.com.messages.WelcomeMessage.featureSelect;
import static main.java.com.messages.WelcomeMessage.welcomeMessage;

public class main {
    public static void main(String[] args) {
        int exitOperator = 0;
        Scanner in = new Scanner(System.in);
        welcomeMessage();
        while (exitOperator != -1) {
            featureSelect();
            int inputNumber = in.nextInt();
            exitOperator = FeatureSelect.featureSelect(inputNumber);
        }
    }
}
