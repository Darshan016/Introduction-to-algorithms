package Arrays;

// find missing number in an array. the elements will be in a range 1 to n.
public class FindMissingNumber {
    static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5};
        System.out.println(findMissing(arr));
    }
}
