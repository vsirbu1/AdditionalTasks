package main.java.com.tasks.starts;

import main.java.com.messages.Task17Defenition;
import main.java.com.messages.Task21Defenition;
import main.java.com.tasks.implementation.TaskNumber17;
import main.java.com.tasks.implementation.TaskNumber21;

import static main.java.com.test.constants.Constants.getFAILURE;
import static main.java.com.test.constants.Constants.getSUCCESS;

public class Task21Start {
    public static void startTask21Test() {
        System.out.println(Task21Defenition.getTASK21DEFENITION());
        TaskNumber21.initiating();
    }
}
