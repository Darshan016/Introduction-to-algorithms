package org.example.Strings;

import java.util.Arrays;

// reverse a string
public class ReverseString {
    static String reverse(String word){
        char[] arr = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String word = "bruh";
        System.out.println(reverse(word));
    }
}
