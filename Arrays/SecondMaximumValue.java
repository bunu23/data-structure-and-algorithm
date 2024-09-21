
public class SecondMaximumValue {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 54, 545, 54, 3, 6, 2 };
        System.out.println(findSecondMaximumValue(arr));
    }

    public static int findSecondMaximumValue(int[] arr) {

        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException("Invalid");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
