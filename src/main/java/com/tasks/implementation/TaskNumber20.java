package main.java.com.tasks.implementation;

public class TaskNumber20 {
    public static void findSequence(int inputData){
        StringBuilder a = new StringBuilder();
        for (int i = 1; i <= inputData; i++) {
            a.append(i);
        }
        String string = a.toString();
        permutation(string, "");
    }

    public static void permutation(String a, String result) {
        for (int i = 0; i < a.length(); i++) {
            String result1 = result;
            if (a.length() > 1) {
                result1 = result1 + a.substring(i, i + 1);
                String rep = a.replace(a.substring(i, i + 1), "");
                permutation(rep, result1);
            } else {
                System.out.println(result + a + checking(result + a));
            }
        }
    }

    public static String checking(String a) {
        int alarm = 1;
        for (int i = 1; i < a.length() - 1; i++) {
            int k = Integer.parseInt(a.substring(i, i + 1));
            int kminus = Integer.parseInt(a.substring(i - 1, i));
            int kplus = Integer.parseInt(a.substring(i + 1, i + 2));
            if (kminus == k - 1 || kminus == k + 1 || kplus == k - 1 || kplus == k + 1) {
                alarm = 0;
            }
        }
        if (alarm == 1) {
            return " success sequence";
        } else {
            return " not our choise sequence";
        }
    }
}
