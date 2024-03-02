package Arrays;

import java.util.Arrays;

// resize an array.
public class ResizeArray {
    static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i <arr.length ; i++) {
            temp[i] = arr[i];

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        System.out.println("Length of original Array: "+arr1.length);
        int[] ans=resize(arr1,arr1.length*2);
        System.out.println("Length after resizing the Array: "+ans.length);
    }
}
