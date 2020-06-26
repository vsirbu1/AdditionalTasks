package main.java.com.tasks;

public class TaskNumber19 {
    public static Integer k=0;

    public static void permutate(int inputData){
        StringBuilder a = new StringBuilder();
        for (int i = 1; i <= inputData; i++) {
            a.append(i);
        }
        String string = a.toString();
        permutation(string, "");
    }

    private static void permutation(String a, String result) {
        for (int i = 0; i < a.length(); i++) {
            String result1=result;
            if (a.length() > 1) {
                result1 = result1 + a.substring(i, i + 1);
                String rep = a.replace(a.substring(i, i+1), "");
                permutation(rep, result1);
            } else {
                k++;
                System.out.println(k+") "+result+a);
            }
        }
    }
}
