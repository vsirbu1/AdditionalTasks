package main.java.com.tasks;

public class TaskNumber6 {
    public static Double findNewPi(int decimalPlaces){
        return Math.round(Math.PI * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }
}
