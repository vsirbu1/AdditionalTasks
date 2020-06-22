package main.java.com.utils;

import main.java.com.messages.Task1Defenition;
import main.java.com.messages.Task2Defenition;
import main.java.com.messages.Task3Defenition;
import main.java.com.tasks.TaskNumber1;
import main.java.com.tasks.TaskNumber2;
import main.java.com.tasks.TaskNumber3;

import java.util.Random;
import java.util.Scanner;

import static main.java.com.tasks.TaskNumber1.*;

public class TaskSelect {
    //Test Status
    private static final String SUCCESS = "All works as expected\n";
    private static final String FAILURE = "There are some problems\n";
    //Task 1
    private static final String TESTDATA1 = "radar";
    private static final String TESTDATA2 = "qwerty";

    //Task2
    private static final String TESTDATA3 = "  #\n  ##\n ###\n ####\n#####\n";
    private static final String TESTDATA4 = "     #\n    ###\n   #####\n  #######\n #########\n###########\n";

    //Task3
    private static final String TESTDATA5 = "5.25 6.73 9.42 1.54 3.456";

    public static void selectTask(Integer number, Integer checkingType) {
        Scanner in = new Scanner(System.in);
        switch (number) {
            case 1: {
                if (checkingType.equals(1)) {
                    System.out.println(Task1Defenition.getTASK1DEFENITION() + "\n");
                    String inputData = in.next();
                    System.out.println(checkIfPalindrome(inputData));
                } else {
                    System.out.println(Task1Defenition.getTASK1DEFENITION() + "\n");
                    if (checkIfPalindrome(TESTDATA1).equals(getTruepalindrome()) &&
                            checkIfPalindrome(TESTDATA2).equals(getFalsepalindrome())) {
                        System.out.println(SUCCESS);
                    } else System.out.println(FAILURE);
                }
                break;
            }
            case 2: {
                if (checkingType.equals(1)) {
                    System.out.println(Task2Defenition.getTASK2DEFENITION());
                    int inputData = in.nextInt();
                    System.out.println(TaskNumber2.buildStairCase1(inputData)+ "\n or it's possible to draw another, better and more beautiful structure");
                    System.out.println(TaskNumber2.buildStairCase2(inputData));
                } else {
                    int inputData = 5;
                    if(TESTDATA3.equals(TaskNumber2.buildStairCase1(inputData))&&TESTDATA4.equals(TaskNumber2.buildStairCase2(inputData))){
                        System.out.println(SUCCESS);
                    }
                    else System.out.println(FAILURE);
                }
                break;
            }
            case 3: {
                if (checkingType.equals(1)) {
                    System.out.println(Task3Defenition.getTASK3DEFENITION());
                    int inputData = in.nextInt();
                    double[] floatingMatrix = new double[inputData];
                    for (int i = 0; i < floatingMatrix.length; i++) {
                        floatingMatrix[i]= (int)(Math.random()*10)+Math.random();
                        System.out.print(floatingMatrix[i]+" ");
                    }
                    System.out.println();
                    double[] result = TaskNumber3.inverceFloatingMatrix(floatingMatrix);
                    for (int i = 0; i < result.length; i++) {
                        System.out.print(result[i]+" ");
                    }
                } else {
                    double[] floatingMatrix = new double[] {3.456, 1.54, 9.42, 6.73, 5.25};
                    double [] result= TaskNumber3.inverceFloatingMatrix(floatingMatrix);
                    StringBuilder resultString = new StringBuilder();
                    for (int i = 0; i < result.length; i++) {
                        resultString.append(result[i]);
                        if(i!=result.length-1){
                            resultString.append(" ");
                        }
                    }
                    if(TESTDATA5.equals(resultString.toString())){
                        System.out.println(SUCCESS);
                    }
                    else System.out.println(FAILURE);
                }
                break;
            }
            case 4: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 5: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 6: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 7: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 8: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 9: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 10: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 11: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 12: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 13: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 14: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 15: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 16: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 17: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 18: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 19: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            case 20: {
                if (checkingType.equals(1)) {

                } else {

                }
            }
            default: {

            }
        }
    }
}
