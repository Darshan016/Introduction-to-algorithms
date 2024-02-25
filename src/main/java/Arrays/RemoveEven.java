package Arrays;

import java.util.Arrays;

//remove even elements from an array.
public class RemoveEven {
    static String removeEvenElements(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }

        }
        int[] result = new int[oddCount];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                result[i] = arr[j];
                i++;
            }

        }

        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6};
        System.out.println(removeEvenElements(arr));
    }
}
