package org.example.sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    static int[] insertionSort(int[] arr){
        int[] ans={};
        for(int j=0;j<arr.length;j++){
            int key=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={5,2,4,6,1,3};
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
