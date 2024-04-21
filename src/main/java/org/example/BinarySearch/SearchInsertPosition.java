package org.example.BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9};
        System.out.println(searchInsert(arr, 0));
    }
}
