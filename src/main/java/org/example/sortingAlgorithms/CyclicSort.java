package org.example.sortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void cyclicSort(int[] arr){
        int n = arr.length;
        int index = 0;
        while (index < n){
            int element = arr[index];
            int correctPosition = element - 1;
            if(arr[index]!=arr[correctPosition]){
                swap(arr, index, correctPosition);
            }else{
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {55,78,4,9,5,66};
        System.out.println("before: "+ Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("after: "+ Arrays.toString(arr));
    }
}
