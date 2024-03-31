package org.example.MiscProblems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static String generateBinaryNumbers(int n){
        String[] ans = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
            ans[i]=queue.poll();
            String n1 = ans[i]+"0";
            String n2 = ans[i]+"1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return Arrays.toString(ans);
    }

    public static void main(String[] args) {
        System.out.println(generateBinaryNumbers(4));
    }
}
