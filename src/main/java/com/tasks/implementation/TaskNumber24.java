package main.java.com.tasks.implementation;

public class TaskNumber24 {
    static int parameter = 10;
    static int maxCherrys=0;
    static String finalResult="";
    static int[][] field = new int[][]
            {
                    {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                    {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                    {1, 0, 1, 0, 0, 2, 1, 1, 1, 1},
                    {1, 0, 0, 0, 1, 0, 0, 2, 1, 1},
                    {1, 1, 1, 0, 0, 0, 1, 0, 1, 1},
                    {1, 0, 0, 0, 1, 1, 1, 0, 1, 1},
                    {1, 1, 1, 2, 1, 1, 1, 0, 1, 1},
                    {1, 1, 0, 0, 0, 0, 0, 2, 0, 1},
                    {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 0, 0}
            };

    public static void initiating() {
        for (int i = 0; i < parameter; i++) {
            for (int j = 0; j < parameter; j++) {
//                field[i][j] = rand.nextInt(2);
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        checkWays(0, 0, "",0);
        System.out.println(finalResult+"\nmax cherries is "+maxCherrys);
    }

    public static void checkWays(int coorY, int coorX, String result, int cherrys) {
        result = result + coorY + "," + coorX + ",";
        if (coorX >= parameter - 1 && coorY >= parameter - 1) {
            if(cherrys>maxCherrys){
                maxCherrys=cherrys;
                finalResult=result;
            }
        } else {
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    if (coorX + 1 <= parameter - 1) {
                        if (field[coorY][coorX + 1] == 0) {
                            checkWays(coorY, coorX + 1, result,cherrys);
                        }
                        if (field[coorY][coorX + 1] == 2) {
                            checkWays(coorY, coorX + 1, result,cherrys+1);
                        }
                    }
                }
                if (i == 1) {
                    if (coorY + 1 <= parameter - 1) {
                        if (field[coorY + 1][coorX] == 0) {
                            checkWays(coorY + 1, coorX, result,cherrys);
                        }
                        if (field[coorY + 1][coorX] == 2) {
                            checkWays(coorY + 1, coorX, result,cherrys+1);
                        }
                    }
                }
            }
        }
    }
}
