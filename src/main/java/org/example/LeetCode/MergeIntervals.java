package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LC problem no. 56
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        for(int i = 0; i < intervals.length-1; i++){
            int flag = 0;
            for (int j = 0; j < intervals.length-1 ; j++) {
                if (intervals[j][0]> intervals[j+1][0]){
                    int[] temp = new int[0];
                    temp[0] = intervals[j][0];
                    temp[1] = intervals[j][1];
                    intervals[j][0] = intervals[j+1][0];
                    intervals[j][1] = intervals[j+1][1];
                    intervals[j+1][0] = temp[0];
                    intervals[j+1][1] = temp[1];
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }

        List<int[]> ans = new ArrayList<>();
        int[] current_interval = intervals[0];
        ans.add(current_interval);
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0]<=current_interval[1]){
                current_interval[1] = Math.max(current_interval[1], intervals[i][1]);
            }
            else{
                current_interval = intervals[i];
                ans.add(current_interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);

    }


    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6}, {8,10}, {15,18}};
        System.out.println(Arrays.deepToString(MergeIntervals.merge(intervals)));
    }
}
