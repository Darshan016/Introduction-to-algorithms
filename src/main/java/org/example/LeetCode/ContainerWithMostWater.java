package org.example.LeetCode;
// problem no. 11
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int b1 = 0;
        int b2 = height.length-1;
        int ans = 0;
        while(b1<b2){
            int max = (b2-b1)*Math.min(height[b1],height[b2]);
            if (height[b1]< height[b2]){
                b1++;
            }else{
                b2--;
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,1}));
    }
}
