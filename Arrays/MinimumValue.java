
public class MinimumValue {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 4, 6, 7, -5 };
        System.out.println(findMinimum(arr));
    }

    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
