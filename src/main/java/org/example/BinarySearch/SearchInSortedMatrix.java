package org.example.BinarySearch;

public class SearchInSortedMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {10, 20, 30, 40},
//                {15, 25, 35, 45},
//                {27, 29, 37, 48},
//                {32, 33, 39, 51}
//        };
        int[][] matrix = {
                {1, 3}
        };
        System.out.println(matrix.length);
        System.out.println(searchMatrix(matrix, 3));

    }
}
