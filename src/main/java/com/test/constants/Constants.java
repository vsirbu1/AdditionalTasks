package main.java.com.test.constants;

public class Constants {
    //Test Status
    private static final String SUCCESS = "All works as expected\n";
    private static final String FAILURE = "There are some problems\n";
    //Task 1
    private static final String TESTDATA1 = "radar";
    private static final String TESTDATA2 = "qwerty";

    //Task2
    private static final String TESTDATA3 = "    #\n   ##\n  ###\n ####\n#####\n";

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

    //Task15
    private static final String TESTDATA15 = "9 8 7 \n6 5 4 \n3 2 1 \n";

    public static String getSUCCESS() {
        return SUCCESS;
    }

    public static String getFAILURE() {
        return FAILURE;
    }

    public static String getTESTDATA1() {
        return TESTDATA1;
    }

    public static String getTESTDATA2() {
        return TESTDATA2;
    }

    public static String getTESTDATA3() {
        return TESTDATA3;
    }

    public static String getTESTDATA5() {
        return TESTDATA5;
    }

    public static String getTESTDATA6() {
        return TESTDATA6;
    }

    public static Double getTESTDATA7() {
        return TESTDATA7;
    }

    public static int[][] getMAGICSQUAREMATRIX() {
        return MAGICSQUAREMATRIX;
    }

    public static int[][] getSQUAREMATRIX() {
        return SQUAREMATRIX;
    }

    public static String getTESTDATA8() {
        return TESTDATA8;
    }

    public static String getTESTDATA9() {
        return TESTDATA9;
    }

    public static String getTESTDATA10() {
        return TESTDATA10;
    }

    public static int[] getMATRIX1() {
        return MATRIX1;
    }

    public static int[] getMATRIX2() {
        return MATRIX2;
    }

    public static int[] getMATRIX3() {
        return MATRIX3;
    }

    public static String getTESTDATA11() {
        return TESTDATA11;
    }

    public static int[][] getMATRIX4() {
        return MATRIX4;
    }

    public static String getTESTDATA12() {
        return TESTDATA12;
    }

    public static String getTESTDATA13() {
        return TESTDATA13;
    }

    public static String getTESTDATA15() {
        return TESTDATA15;
    }
}
