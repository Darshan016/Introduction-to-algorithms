package org.example.Arrays;

import java.util.Arrays;

// reverse an array using 2 pointers approach.
public class ReverseArray {

    static String reverseArray(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return Arrays.toString(arr);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(reverseArray(arr,0,arr.length-1));
    }
}
