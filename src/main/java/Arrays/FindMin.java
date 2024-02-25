package Arrays;

// find the minimum element from an array
public class FindMin {
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {88, 5, 98, 6, 77};
        System.out.println(findMin(arr));
    }
}
