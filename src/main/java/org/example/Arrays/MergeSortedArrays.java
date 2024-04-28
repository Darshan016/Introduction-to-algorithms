package org.example.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 7, 9, 12};
        int[] arr2 = {2, 5, 11, 55};
        int[] ans = merge(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
