package org.example.Arrays;

import java.util.Arrays;

// move zeroes to the end of an array.
public class MoveZeroToEnd {
    static String moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }

        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0};
        System.out.println(moveZeroToEnd(arr));

    }
}
