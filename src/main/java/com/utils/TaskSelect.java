package main.java.com.utils;

import main.java.com.messages.*;
import main.java.com.tasks.*;

import java.util.Random;
import java.util.Scanner;

import static main.java.com.messages.Task11Defenition.getTEXT1;
import static main.java.com.messages.Task11Defenition.getTEXT2;
import static main.java.com.tasks.TaskNumber1.*;
import static main.java.com.tasks.TaskNumber11.createResultMatrix;
import static main.java.com.tasks.TaskNumber13.rotateMatrix;

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

    //Task4-5
    private static final String TESTDATA6 = "25 5 10 9 8 7 6 5 4 3 2 1";

    //Task6
    private static final Double TESTDATA7 = 3.1416;

    //Task7
    private static final int[][] MAGICSQUAREMATRIX = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    private static final int[][] SQUAREMATRIX = new int[][]{{2, 6, 6}, {1, 5, 1}, {4, 3, 6}};

    //Task8
    private static final String TESTDATA8 = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";

    //Task9
    private static final String TESTDATA9 = "28 6 are friendly numbers\n140 30 are friendly numbers\n200 80 are friendly numbers\n";

    //Task10
    private static final String TESTDATA10 = " 2024 2028 2032 2036 2040 2044";

    //Task11
    private static final int[] MATRIX1 = new int[]{3, 4, 7, 16};
    private static final int[] MATRIX2 = new int[]{1, 3, 4, 9};
    private static final int[] MATRIX3 = new int[]{5, 6, 8, 9, 13};
    private static final String TESTDATA11 = " 1 3 3 4 4 5 6 7 8 9 9 13 16";

    //Task12
    private static final int[][] MATRIX4 = new int[][]{{3, 1, 22, 3}, {3, 1, 1, 3}, {3, 1, 7, 7}, {3, 1, 7, 11}};
    private static final String TESTDATA12 = "3 1 1 3 \n3 1 7 7 \n3 1 7 11 \n3 1 22 3 \n";

    //Task13
    private static final String TESTDATA13 = "4 5 6 7 8 9 1 2 3 ";

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
                    System.out.println(TaskNumber2.buildStairCase1(inputData) + "\n or it's possible to draw another, better and more beautiful structure");
                    System.out.println(TaskNumber2.buildStairCase2(inputData));
                } else {
                    int inputData = 5;
                    if (TESTDATA3.equals(TaskNumber2.buildStairCase1(inputData)) && TESTDATA4.equals(TaskNumber2.buildStairCase2(inputData))) {
                        System.out.println(SUCCESS);
                    } else System.out.println(FAILURE);
                }
                break;
            }
            case 3: {
                if (checkingType.equals(1)) {
                    System.out.println(Task3Defenition.getTASK3DEFENITION());
                    int inputData = in.nextInt();
                    double[] floatingMatrix = new double[inputData];
                    for (int i = 0; i < floatingMatrix.length; i++) {
                        floatingMatrix[i] = (int) (Math.random() * 10) + Math.random();
                        System.out.print(floatingMatrix[i] + " ");
                    }
                    System.out.println();
                    double[] result = TaskNumber3.inverceFloatingMatrix(floatingMatrix);
                    for (int i = 0; i < result.length; i++) {
                        System.out.print(result[i] + " ");
                    }
                } else {
                    double[] floatingMatrix = new double[]{3.456, 1.54, 9.42, 6.73, 5.25};
                    double[] result = TaskNumber3.inverceFloatingMatrix(floatingMatrix);
                    StringBuilder resultString = new StringBuilder();
                    for (int i = 0; i < result.length; i++) {
                        resultString.append(result[i]);
                        if (i != result.length - 1) {
                            resultString.append(" ");
                        }
                    }
                    if (TESTDATA5.equals(resultString.toString())) {
                        System.out.println(SUCCESS);
                    } else System.out.println(FAILURE);
                }
                break;
            }
            case 4: {
                if (checkingType.equals(1)) {
                    System.out.println(Task4And5Defenition.getTASK4And5DEFENITION());
                    int inputData = in.nextInt();
                    int[] initialMatrix = new int[inputData];
                    for (int i = 0; i < inputData; i++) {
                        initialMatrix[i] = (int) (Math.random() * 100);
                        System.out.print(initialMatrix[i] + " ");
                    }
                    System.out.println();
                    String result = TaskNumber4And5.bubbleSortAndOther(initialMatrix);
                    int n = result.indexOf(" ");
                    System.out.println("Sum of odd numbers is " + result.substring(0, n));
                    result = result.substring(n + 1);
                    n = result.indexOf(" ");
                    System.out.println("Amount of even numbers is " + result.substring(0, n));
                    result = result.substring(n);
                    System.out.println("Result matrix\n" + result);
                } else {
                    int[] preparedMatrix = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    String result = TaskNumber4And5.bubbleSortAndOther(preparedMatrix);
                    if (TESTDATA6.equals(result)) {
                        System.out.println(SUCCESS);
                    } else System.out.println(FAILURE);
                }
                break;
            }
            case 5: {
                if (checkingType.equals(1)) {
                    selectTask(4, 1);
                } else {
                    selectTask(4, 2);
                }
            }
            case 6: {
                if (checkingType.equals(1)) {
                    System.out.println(Task6Defenition.getTASK6DEFENITION());
                    int inputData = in.nextInt();
                    System.out.println("Number Pi is " + Math.PI);
                    System.out.println("New number Pi is " + TaskNumber6.findNewPi(inputData));
                } else {
                    if (TESTDATA7.equals(TaskNumber6.findNewPi(4))) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 7: {
                if (checkingType.equals(1)) {
                    System.out.println(Task7Defenition.getTASK7DEFENITION());
                    int inputData = in.nextInt();
                    int[][] inputMatrix = new int[inputData][inputData];
                    for (int i = 0; i < inputData; i++) {
                        for (int j = 0; j < inputData; j++) {
                            inputMatrix[i][j] = in.nextInt();
                        }
                    }
                    if (TaskNumber7.check(inputMatrix)) System.out.println(Task7Defenition.getMAGICSQUARE());
                    else System.out.println(Task7Defenition.getNOTMAGICSQUARE());
                } else {
                    if (TaskNumber7.check(MAGICSQUAREMATRIX) && !TaskNumber7.check(SQUAREMATRIX))
                        System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
                break;
            }
            case 8: {
                if (checkingType.equals(1)) {
                    System.out.println(Task8Defenition.getTASK8DEFENITION());
                    int inputData = in.nextInt();
                    System.out.println(TaskNumber8.listOfPrimeNumbers(inputData));
                } else {
                    if (TESTDATA8.equals(TaskNumber8.listOfPrimeNumbers(100))) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 9: {
                if (checkingType.equals(1)) {
                    System.out.println(Task9Defenition.getTASK9DEFENITION());
                    int inputData = in.nextInt();
                    System.out.println(TaskNumber9.findFrendlyNumbers(inputData));
                } else {
                    if (TESTDATA9.equals(TaskNumber9.findFrendlyNumbers(200))) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 10: {
                if (checkingType.equals(1)) {
                    System.out.println(Task10Defenition.getTASK10DEFENITION());
                    int inputData = in.nextInt();
                    System.out.println(TaskNumber10.findLeapYears(inputData));
                } else {
                    if (TESTDATA10.equals(TaskNumber10.findLeapYears(6))) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 11: {
                if (checkingType.equals(1)) {
                    System.out.println(Task11Defenition.getTASK11DEFENITION());
                    System.out.println(getTEXT1());
                    int[] a = new int[in.nextInt()];
                    System.out.println(getTEXT2());
                    for (int i = 0; i < a.length; i++) {
                        a[i] = in.nextInt();
                    }
                    System.out.println(getTEXT1());
                    int[] b = new int[in.nextInt()];
                    System.out.println(getTEXT2());
                    for (int i = 0; i < b.length; i++) {
                        b[i] = in.nextInt();
                    }
                    System.out.println(getTEXT1());
                    int[] c = new int[in.nextInt()];
                    System.out.println(getTEXT2());
                    for (int i = 0; i < c.length; i++) {
                        c[i] = in.nextInt();
                    }
                    System.out.println(createResultMatrix(a, b, c));
                } else {

                    if (TESTDATA11.equals(createResultMatrix(MATRIX1, MATRIX2, MATRIX3)))
                        System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 12: {
                if (checkingType.equals(1)) {
                    System.out.println(Task12Defenition.getTASK12DEFENITION());
                    System.out.println(Task12Defenition.getTEXT1());
                    int n = in.nextInt();
                    int[][] inputMatrix = new int[n][n];
                    System.out.println(Task12Defenition.getTEXT2());
                    for (int i = 0; i < inputMatrix.length; i++) {
                        for (int j = 0; j < inputMatrix.length; j++) {
                            inputMatrix[i][j] = in.nextInt();
                        }
                    }
                    for (int i = 0; i < inputMatrix.length; i++) {
                        for (int j = 0; j < inputMatrix.length; j++) {
                            System.out.print(inputMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println(TaskNumber12.sortLines(inputMatrix));
                } else {
                    if (TESTDATA12.equals(TaskNumber12.sortLines(MATRIX4))) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 13: {
                if (checkingType.equals(1)) {
                    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                    int numberOfRotates = in.nextInt();
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    System.out.println(rotateMatrix(a, numberOfRotates));
                } else {
                    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                    if (TESTDATA13.equals(rotateMatrix(a, 3))) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
                }
            }
            case 14: {
                if (checkingType.equals(1)) {
                    System.out.println(Task14Defenition.getTASK14DEFENITION());
                    int amount = in.nextInt();
                    System.out.println("For "+amount+" you need"+TaskNNumber14.munAmountOfCoins(amount)+" coins");
                } else {
                    if(4==TaskNNumber14.munAmountOfCoins(33)) System.out.println(SUCCESS);
                    else System.out.println(FAILURE);
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
