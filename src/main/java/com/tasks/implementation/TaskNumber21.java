package main.java.com.tasks.implementation;

import java.util.Random;

public class TaskNumber21 {
    static Integer minLength = 0;
    static String resultFinal = "";
    static int parameter = 10;
    static int[][] field = new int[][]
            {
                    {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                    {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                    {1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
                    {1, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };

    public static String getResultFinal() {
        return resultFinal;
    }

    public static void setResultFinal(String resultFinal) {
        TaskNumber21.resultFinal = resultFinal;
    }

    public static Integer getMinLength() {
        return minLength;
    }

    public static void initiating() {
        Random rand = new Random();
        String result111 = "";
        for (int i = 0; i < parameter; i++) {
            for (int j = 0; j < parameter; j++) {
//                field[i][j] = rand.nextInt(2);
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        checkWays(4, 4, -1, result111);
        System.out.println(getResultFinal());
    }

    public static void checkIfNeededUpdate(String result) {
        if (minLength == 0) {
            minLength = result.length();
            setResultFinal(result);
        } else {
            if (result.length() < getMinLength()) {
                minLength = result.length();
                setResultFinal(result);
            }
        }
    }

    public static boolean checkBorder(int a, int b) {
        if (a == 0 || b == 0 || a == parameter - 1 || b == parameter - 1) {
            return true;
        } else return false;
    }

    public static void checkWays(int coorY, int coorX, int previousPos, String result) {
        result = result + coorY + "," + coorX + ",";
        if (checkBorder(coorY, coorX)) {
            checkIfNeededUpdate(result);
        } else {
            if (result.length() < 1000) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        if (field[coorY - 1][coorX] == 0 && previousPos != 1) {
                            checkWays(coorY - 1, coorX, i, result);
                        }
                    }
                    if (i == 1) {
                        if (field[coorY + 1][coorX] == 0 && previousPos != 0) {
                            checkWays(coorY + 1, coorX, i, result);
                        }
                    }
                    if (i == 2) {
                        if (field[coorY][coorX - 1] == 0 && previousPos != 3) {
                            checkWays(coorY, coorX - 1, i, result);
                        }
                    }
                    if (i == 3) {
                        if (field[coorY][coorX + 1] == 0 && previousPos != 2) {
                            checkWays(coorY, coorX + 1, i, result);
                        }
                    }
                }
            }
        }
    }
}
