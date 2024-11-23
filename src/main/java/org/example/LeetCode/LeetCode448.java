package org.example.LeetCode;

import java.util.ArrayList;
import java.util.List;

//find all missing numbers from an array (1-n)
public class LeetCode448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void cyclicSort(int[] arr){
        int n = arr.length;
        int index = 0;
        while (index<n){
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
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }



}
