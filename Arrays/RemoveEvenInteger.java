
public class RemoveEvenInteger {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 2, 5, 3, 9, 7, 8 };
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

}
