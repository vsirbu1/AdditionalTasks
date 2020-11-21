package main.java.com.tasks.implementation;

import java.util.Random;

public class TaskNumber22 {
    public static void initiating(){
        int number=10;
        double perimeter=0;
        Random rand= new Random();
        int[][]dotList= new int[2][number];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < number; j++) {
                dotList[i][j]=rand.nextInt(20)-10;
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = i+1; j < number-1; j++) {
                double k=calculationK(dotList[0][i],dotList[1][i],dotList[0][j],dotList[1][j]);
                double b=calculationB(dotList[0][i],dotList[1][i],k);
                int bigger=0,lower=0;
                for (int l = 0; l < number; l++) {
                    if(dotList[1][l]>k*dotList[0][l]+b){
                        bigger++;
                    }
                    if(dotList[1][l]<k*dotList[0][l]+b){
                        lower++;
                    }
                }
                if(bigger==0||lower==0){
                    perimeter=perimeter+calculationDistance(dotList[0][i],dotList[1][i],dotList[0][j],dotList[1][j]);
                }
            }
        }
        System.out.println("Perimeter is: "+perimeter);
    }
    public static double calculationDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

    public static double calculationK(int x1, int y1, int x2, int y2) {
        if ((x2 - x1) == 0) return 0;
        else return (y2 - y1) / (x2 - x1);
    }

    public static double calculationB(int x1,int y1, double k){
        return y1-k*x1;
    }
}
